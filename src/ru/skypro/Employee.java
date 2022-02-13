package ru.skypro;

import java.util.Objects;

public class Employee {

    private final String name;
    private double salary;
    private int department;
    private static int counter = 0;
    public int id;

    public Employee(String name, double salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = counter++;
    }

    public  int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return
                "Ф.И.О. сотрудника: " + name +
                        "; Зарпалата: " + salary + "p" +
                        "; Номер отдела: " + department +
                        ";";
    }


    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee a = (Employee) other;
        return name.equals(a.name)
                && salary == a.salary
                && department == a.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
                salary, department);
    }
}

