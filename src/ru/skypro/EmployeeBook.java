package ru.skypro;

import java.util.Arrays;
import java.util.Objects;

public class EmployeeBook {

    private static Employee[] persArray = hiringingPersArray();


    public static Employee[] hiringingPersArray() {
        Employee[] a = new Employee[10];
        a[0] = new Employee("Иван Валерьевич Сухин", 83000, 5);
        a[1] = new Employee("Семен Генадьевич Семенов", 74700, 2);
        a[2] = new Employee("Виктор Сергеевич Замков", 51000, 4);
        a[3] = new Employee("Сергей Иванович Матвеев", 68500, 1);
        a[4] = new Employee("Маргарита Ивановна Степакова", 72800, 2);
        a[5] = new Employee("Игнат Степанович Федотов", 83300, 3);
        a[6] = new Employee("Марина Валерьевна Жукова", 92800, 4);
        a[7] = new Employee("Станислав Петрович Сумкин", 72900, 1);
        a[8] = new Employee("Светлана Антоновна Ручка", 88200, 3);
        a[9] = new Employee("Андрей Олегович Петров", 73500, 5);
        return a;
    }

    public static Employee[] getPersArray() {
        return persArray;
    }

    public static void setPersArray(Employee[] persArray) {
        EmployeeBook.persArray = persArray;
    }

    @Override
    public String toString() {
        return
                " 1 2 3 ";
    }

    //Базовая сложность

    public void printList() {

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                System.out.println(persArray[i]);
            }
        }
    }


    public double sumSalary() {

        double sum = 0;
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                sum = sum + persArray[i].getSalary();
            }
        }
        return sum;
    }

    public void printSumSalary() {
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary() + " руб.");
    }

    public int countEmployee() {
        int count = 0;
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                count++;
            }
        }
        return count;
    }

    public double averageSalary() {

        double averageSalary = sumSalary() / countEmployee();

        System.out.println("среднее значение зарплат: " + averageSalary + " руб.");
        return averageSalary;
    }

    public void maxSalary() {

        double max = 0;
        String employee = persArray[0].toString();

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                if (persArray[i].getSalary() > max) {
                    max = persArray[i].getSalary();
                    employee = persArray[i].toString();

                }

            }
        }
        System.out.println(employee);
    }


    public void minSalary() {

        double min = persArray[0].getSalary();
        String employee = persArray[0].toString();
        int department = persArray[0].getDepartment();
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                if (persArray[i].getSalary() <= min) {
                    min = persArray[i].getSalary();
                    employee = persArray[i].toString();

                }
            }
        }
        System.out.println(employee);
    }

    public void printEmployeeNames() {

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                System.out.println(persArray[i].getName());
            }
        }


    }

    // Повышенная сложность
    public void indexingSalary() {
        double indexing = 0.1;
        double b;
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                b = (persArray[i].getSalary() * indexing) + persArray[i].getSalary();
                System.out.println(b);
            }
        }
    }

    public void lessThan(int a) {
        String b = persArray[0].getName();


        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                if (persArray[i].getSalary() < a) {
                    System.out.println("У сотруднока зарплата меньше чем " + a
                            + " руб. " + "Id:" + persArray[i].id + " " + persArray[i].getName() + " " + persArray[i].getSalary());
                }
            }
        }

    }


    public void moreThan(int a) {
        String b = persArray[0].getName();


        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                if (persArray[i].getSalary() >= a) {
                    System.out.println("У сотруднока зарплата больше чем " + a
                            + " руб. " + "Id:" + persArray[i].id + " " + persArray[i].getName() + " " + persArray[i].getSalary());
                }
            }
        }

    }


    public void maxSalaryDepartment(int department) {
        double max = 0;
        String employee = persArray[0].getName();
        int departmentNumber = persArray[0].getDepartment();
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                if (persArray[i].getDepartment() == department) {
                    max = persArray[i].getSalary();
                    employee = persArray[i].getName();
                    departmentNumber = persArray[i].getDepartment();
                }
            }

        }
        System.out.println("Самая большая зарплата у сотрудника : " + employee + " " + (int) max + " руб. Из отдела №" +
                department);
    }

    public void minSalaryDepartment(int department) {
        double min = persArray[0].getSalary();
        String employee = persArray[0].getName();
        int departmentNumber = persArray[0].getDepartment();
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                if (persArray[i].getDepartment() == department) {
                    if (persArray[i].getSalary() <= min) {
                        min = persArray[i].getSalary();
                        employee = persArray[i].getName();
                        departmentNumber = persArray[i].getDepartment();
                    }
                }
            }
        }
        System.out.println("Минимальная зарплата у сотрудника : " + employee + " " + (int) min + " руб. Из отдела №" +
                department);
    }

    public void sumSalaryDepartment(int department) {
        double sum = 0;
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                if (persArray[i].getDepartment() == department) {
                    sum = persArray[i].getSalary() + sum;

                }
            }
        }
        System.out.println("Сумма затрат на зарплату по отделу : " + sum + " руб.");


    }


    public void averageSalaryDepartment(int x) {
        double salaryDepartment = 0;
        int counterEmployee = 0;
        double averageSalaryDepartment = 0;
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                if (persArray[i].getDepartment() == x) {
                    System.out.println(persArray[i].toString());
                    counterEmployee++;
                    salaryDepartment = persArray[i].getSalary() + salaryDepartment;
                }
            }
        }
        averageSalaryDepartment = salaryDepartment / counterEmployee;
        System.out.println("Средняя зарплата по отделу : " + averageSalaryDepartment + " руб.");
    }

    public void indexingSalaryDepartment(int employee, double indexationPercentage) {

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                if (persArray[i].getDepartment() == employee) {
                    double indexingSalaryDepartment = (persArray[i].getSalary() * indexationPercentage / 100) +
                            persArray[i].getSalary();
                    System.out.println("До повышения : " + persArray[i].getSalary() + " руб. " + "После повышения: " +
                            indexingSalaryDepartment + " руб.");
                }
            }
        }
    }

    public void printEmployeeDepartment(int x) {

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                if (persArray[i].getDepartment() == x) {
                    System.out.println(persArray[i].getName() + " " + persArray[i].getSalary());
                }
            }
        }
    }

    // Очень сложно

    public boolean addEmployee(Employee newEmployee) {
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] == null) {
                persArray[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    public boolean removeEmployee(String name) {
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getName().equals(name)) {
                persArray[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean removeEmployee(int id) {
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getId() == id) {
                persArray[i] = null;
                return true;
            }
        }
        return false;
    }

    public void changeSalary(String name, int salary) {
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getName().equals(name)) {
                persArray[i].setSalary(salary);
                return;
            }
        }
        System.out.println(name + " Такого нет");

    }

    public void changeDepartment(String name, int department) {
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getName().equals(name)) {
                persArray[i].setDepartment(department);
                return;
            }

        }
        System.out.println(name + " Такого нет");
    }

    public Employee getEmployee(String name) {
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getName().equals(name)) {
                return persArray[i];
            }
        }
        return null;

    }

    private void printDepartmentEmployee(int department) {
        System.out.println("В отдел # " + department + " работают: ");
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getDepartment() == department) {
                System.out.println(persArray[i].getName());
            }
        }
    }

    public void printDepartmentEmployee() {
        for (int i = 0; i < 5; i++) {
            printDepartmentEmployee(i);
        }
    }


}


