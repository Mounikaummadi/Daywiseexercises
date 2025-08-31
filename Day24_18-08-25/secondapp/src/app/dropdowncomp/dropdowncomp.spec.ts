import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Dropdowncomp } from './dropdowncomp';

describe('Dropdowncomp', () => {
  let component: Dropdowncomp;
  let fixture: ComponentFixture<Dropdowncomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Dropdowncomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Dropdowncomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
