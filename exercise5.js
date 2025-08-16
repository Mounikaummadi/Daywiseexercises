
class Vehicle {
    constructor(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    getInfo() {
        return `Make: ${this.make}, Model: ${this.model}, Year: ${this.year}`;
    }
}
class Car extends Vehicle {
    constructor(make, model, year, numDoors) {
        super(make, model, year); 
        this.numDoors = numDoors;
    }
    getInfo() {
        return `${super.getInfo()}, Number of Doors: ${this.numDoors}`;
    }
}
const vehicle1 = new Vehicle("Toyota", "Corolla", 2020);
const car1 = new Car("Honda", "Civic", 2022, 4);
const outputDiv = document.getElementById("output");
outputDiv.innerHTML = `
${vehicle1.getInfo()}<br>
${car1.getInfo()}
`;
console.log(vehicle1.getInfo());
console.log(car1.getInfo());
