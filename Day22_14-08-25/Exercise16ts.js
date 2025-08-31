var employees = [
    { empId: 101, empName: "Alice", salary: 50000 },
    { empId: 102, empName: "Bob", salary: 60000 },
    { empId: 103, empName: "Charlie", salary: 55000 }
];
function printAndCountEmployees(empList) {
    empList.forEach(function (emp) {
        console.log("ID: ".concat(emp.empId, ", Name: ").concat(emp.empName, ", Salary: \u20B9").concat(emp.salary));
    });
    return empList.length;
}
var count = printAndCountEmployees(employees);
console.log("Total Employees: ".concat(count));
