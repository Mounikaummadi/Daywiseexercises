import { ChangeDetectorRef, Component,OnInit} from '@angular/core';
import { VehicleService } from '../vehicle';
import { Ivehicle } from '../ivehicle';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-vehiclecomp',
  imports: [CommonModule,FormsModule],
  templateUrl: './vehiclecomp.html',
  styleUrl: './vehiclecomp.css'
})
export class Vehiclecomp implements OnInit {

  vehicles: Ivehicle[] = [];

  vehicleAdd: Ivehicle = { id: 0, make: '', model: '', fuelType: '', price: 0 };
  vehicleEdit: Ivehicle | null = null; 

  constructor(
    private vehicleService: VehicleService,
    private cdr: ChangeDetectorRef
  ) {}

  ngOnInit() {
    this.loadVehicles();
  }

  loadVehicles() {
    this.vehicleService.getVehicles().subscribe(data => {
      this.vehicles = data;
      this.cdr.detectChanges(); 
    });
  }

  edit(vehicleId: number) {
    this.vehicleService.getVehicleById(vehicleId).subscribe(vehicle => {
      this.vehicleEdit = { ...vehicle };
      console.log('Editing vehicle:', this.vehicleEdit);
      this.cdr.detectChanges(); 
    });
  }

  update() {
    if (!this.vehicleEdit) return;

    this.vehicleService.updateVehicle(this.vehicleEdit).subscribe(updatedVehicle => {
      const index = this.vehicles.findIndex(v => v.id === updatedVehicle.id);
      if (index !== -1) this.vehicles[index] = updatedVehicle;

      this.vehicleEdit = null; 
      this.cdr.detectChanges(); 
    });
  }

  delete(vehicleId: number) {
    if (!confirm('Are you sure?')) return;

    this.vehicleService.deleteVehicle(vehicleId).subscribe(() => {
      this.vehicles = this.vehicles.filter(v => v.id !== vehicleId);
      this.cdr.detectChanges(); 
    });
  }

  save() {
    const vehicleToAdd: any = { ...this.vehicleAdd };
    delete vehicleToAdd.id; 

    this.vehicleService.addVehicle(vehicleToAdd).subscribe(newVehicle => {
      this.vehicles.push(newVehicle);
      this.vehicleAdd = { id: 0, make: '', model: '', fuelType: '', price: 0 };
      this.cdr.detectChanges(); 
    });
  }

}

