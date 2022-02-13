package ru.skypro;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

// База:


        System.out.println();
        employeeBook.printList();

        System.out.println();

        employeeBook.printSumSalary();
        System.out.println();

        employeeBook.minSalary();
        System.out.println();

        employeeBook.maxSalary();
        System.out.println();

        employeeBook.averageSalary();
        System.out.println();


        employeeBook.printEmployeeNames();
        System.out.println();

// Повышенная сложность:

        employeeBook.indexingSalary();
        System.out.println();

        employeeBook.minSalaryDepartment(2);
        System.out.println();

        employeeBook.maxSalaryDepartment(3);
        System.out.println();

        employeeBook.sumSalaryDepartment(2);
        System.out.println();


        employeeBook.averageSalaryDepartment(2);
        System.out.println();

        employeeBook.indexingSalaryDepartment(3, 10);
        System.out.println();

        employeeBook.printEmployeeDepartment(5);
        System.out.println();

        employeeBook.lessThan(80000);
        System.out.println();

        employeeBook.moreThan(80000);
        System.out.println();


        employeeBook.printDepartmentEmployee();

        employeeBook.changeSalary("Виктор Сергеевич Замков",176000);
        employeeBook.changeDepartment("Виктор Сергеевич Замков",69);

       Employee employee  = employeeBook.getEmployee("Виктор Сергеевич Замков");
        System.out.println("employee = " + employee);

    }
}




