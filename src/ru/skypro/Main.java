package ru.skypro;

import java.util.Arrays;


public class Main {

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


    //Базовая сложность

    public static void printList() {

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                System.out.println(persArray[i]);
            }
        }
    }


    public static double sumSalary() {

        double sum = 0;
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                sum = sum + persArray[i].getSalary();
            }
        }
        return sum;
    }

    public static void printSumSalary() {
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary() + " руб.");
    }

    public static int countEmployee() {
        int count = 0;
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static double averageSalary() {

        double averageSalary = sumSalary() / countEmployee();

        System.out.println("среднее значение зарплат: " + averageSalary + " руб.");
        return averageSalary;
    }

    public static void maxSalary() {

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


    public static void minSalary() {

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

    public static void printEmployeeNames() {

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                System.out.println(persArray[i].getName());
            }
        }
    }

    // Повышенная сложность
    public static void indexingSalary() {
        double indexing = 0.1;
        double b;
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                b = (persArray[i].getSalary() * indexing) + persArray[i].getSalary();
                System.out.println(b);
            }
        }
    }

    public static void lessThan(int a) {
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


    public static void moreThan(int a) {
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


    public static void maxSalaryDepartment(int department) {
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

    public static void minSalaryDepartment(int department) {
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

    public static void sumSalaryDepartment(int department) {
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


    public static void averageSalaryDepartment(int x) {
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

    public static void indexingSalaryDepartment(int employee, double indexationPercentage) {

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

    public static void printEmployeeDepartment(int x) {

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i] != null) {
                if (persArray[i].getDepartment() == x) {
                    System.out.println(persArray[i].getName() + " " + persArray[i].getSalary());
                }
            }
        }
    }

    public static void main(String[] args) {


// База:
        System.out.println();
        printList();

        System.out.println();

        printSumSalary();
        System.out.println();

        minSalary();
        System.out.println();

        maxSalary();
        System.out.println();

        averageSalary();
        System.out.println();


        printEmployeeNames();
        System.out.println();

// Повышенная сложность:

        indexingSalary();
        System.out.println();

        minSalaryDepartment(2);
        System.out.println();

        maxSalaryDepartment(3);
        System.out.println();

        sumSalaryDepartment(2);
        System.out.println();


        averageSalaryDepartment(2);
        System.out.println();

        indexingSalaryDepartment(3, 10);
        System.out.println();

        printEmployeeDepartment(5);
        System.out.println();

        lessThan(80000);
        System.out.println();

        moreThan(80000);
        System.out.println();


    }
}




