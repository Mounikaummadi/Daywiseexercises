package com.wipro.generic;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRunner {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee("e1", "Badari", 23, 75000));
        employees.add(new Employee("e2", "Vijay", 23, 85000));
        employees.add(new Employee("e3", "Vinay", 23, 65000));
        employees.add(new Employee("e4", "Ramu", 24, 25000));
//        for (int i = 0; i < employees.size(); i++) {
//            if (employees.get(i).getEmpSalary() > 80000) {
//                employees.remove(i);
//                i--;
//            }
//        }
//
//        System.out.println("Employees earning 80000 or less:");
//        for (Employee emp : employees) {
//            System.out.println(emp);
//        }
        employees.sort((e1, e2) -> e1.empName.compareTo(e2.empName));

//        for (Employee e : employees) {
//            System.out.println(e);
//        }
        System.out.println(employees);



    }

}
