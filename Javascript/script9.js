var listEmployee = [
  { name: "Janu", age: 25, position: "Software Engineer" },
  { name: "Mouni", age: 15, position: "Software Engineer" },
  { name: "Pooji", age: 17, position: "Accounts" }
];
for (let i = 0; i < listEmployee.length; i++) {
    if (listEmployee[i].age >= 18) {
        listEmployee[i].status = "Adult";
    } else {
        listEmployee[i].status = "Minor";
    }
}
console.log(listEmployee);
document.getElementById("output").textContent = JSON.stringify(listEmployee, null, 2);
