package ru.skypro;

import java.util.Arrays;


public class Main {


    public static void printList(Employee[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }


    public static double sumSalary(Employee[] arr) {

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                sum = sum + arr[i].getSalary();
            }
        }
        return sum;
    }

    public static void printSumSalary(double a) {
        System.out.println("Сумма затрат на зарплаты в месяц: " + a + " руб.");
    }

    public static int countEmployee(Employee[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static double averageSalary(Employee[] arr) {

        double averageSalary = sumSalary(arr) / countEmployee(arr);

        System.out.println("среднее значение зарплат: " + averageSalary + " руб.");
        return averageSalary;
    }

    public static void maxSalary(Employee[] arr) {

        double max = 0;
        String employee = arr[0].getName();
        int department = arr[0].getDepartment();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getSalary() > max) {
                    max = arr[i].getSalary();
                    employee = arr[i].getName();
                    department = arr[i].getDepartment();
                }
            }
        }
        System.out.println("Самая большая зарплата у сотрудника : " + employee + " " + (int) max + " руб. Из отдела №" + department);
    }


    public static void minSalary(Employee[] arr) {

        double min = arr[0].getSalary();
        String employee = arr[0].getName();
        int department = arr[0].getDepartment();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getSalary() <= min) {
                    min = arr[i].getSalary();
                    employee = arr[i].getName();
                    department = arr[i].getDepartment();
                }
            }
        }
        System.out.println("Минимальная зарплата у сотрудника : " + employee + " " + (int) min + " руб. Из отдела №" + department);
    }

    public static void employee(Employee[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getName());
            }
        }
    }


    public static void main(String[] args) {

        Employee[] persArray = new Employee[10];
        persArray[0] = new Employee("Иван Валерьевич Сухин", 83000, 5);
        persArray[1] = new Employee("Семен Генадьевич Семенов", 74700, 3);
        persArray[2] = new Employee("Виктор Сергеевич Замков", 51000, 4);
        persArray[3] = new Employee("Сергей Иванович Матвеев", 68500, 1);
        persArray[4] = new Employee("Маргарита Ивановна Степакова", 72800, 2);
        persArray[5] = new Employee("Игнат Степанович Федотов", 83300, 3);
        persArray[6] = new Employee("Марина Валеревна Жукова", 92800, 4);
        persArray[7] = new Employee("Станислав Петрович Сумкин", 72900, 1);
        persArray[8] = new Employee("Светлана Антоновна Ручка", 88200, 3);
        persArray[9] = new Employee("Андрей Олегович Петров", 73500, 5);


        printList(persArray);
        System.out.println();

        printSumSalary(sumSalary(persArray));
        System.out.println();

        minSalary(persArray);
        System.out.println();

        maxSalary(persArray);
        System.out.println();

        averageSalary(persArray);
        System.out.println();

        System.out.println();
        employee(persArray);
    }
}




