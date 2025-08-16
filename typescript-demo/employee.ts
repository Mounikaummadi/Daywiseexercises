
interface Employee {
    empId: number;
    empName: string;
    salary: number;
}

const employees: Employee[] = [
    { empId: 101, empName: "Alice", salary: 50000 },
    { empId: 102, empName: "Bob", salary: 60000 },
    { empId: 103, empName: "Charlie", salary: 55000 }
];

function printEmployees(empList: Employee[]): number {
    empList.forEach(emp => {
        console.log(`ID: ${emp.empId}, Name: ${emp.empName}, Salary: ${emp.salary}`);
    });
    return empList.length;
}

const count = printEmployees(employees);
console.log("Total Employees:", count);
