
var employees = [
    { name: "John Doe", role: "Manager", empId: 101, salary: 70000 },
    { name: "Mark Smith", role: "Developer", empId: 102, salary: 50000 },
    { name: "Patricia Dark", role: "Manager", empId: 103, salary: 80000 },
    { name: "Emma Watson", role: "QA", empId: 104, salary: 45000 },
    { name: "Robert Brown", role: "Manager", empId: 105, salary: 75000 }
];
var totalManagerSalary = employees
    .filter(emp => emp.role === "Manager")
    .reduce((total, emp) => total + emp.salary, 0); 

console.log("Total salary of all Managers:", totalManagerSalary);
