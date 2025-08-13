var listEmployee = [
  { name: "Janu", age: 25, position: "Software Engineer" },
  { name: "Mouni", age: 15, position: "Software Engineer" },
  { name: "Pooji", age: 17, position: "Accounts" }
];
var updatedEmployees = listEmployee.map(emp => {
    return {
        ...emp, 
        status: emp.age >= 18 ? "Adult" : "Minor" 
    };
});

console.log(updatedEmployees);
document.getElementById("output").textContent = JSON.stringify(updatedEmployees, null, 2);
