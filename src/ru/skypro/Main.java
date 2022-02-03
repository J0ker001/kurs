package ru.skypro;

import java.util.Arrays;


public class Main {

    //Базовая сложность

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

    public static void printSumSalary(Employee[] arr) {
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary(arr) + " руб.");
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
        String employee = arr[0].toString();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getSalary() > max) {
                    max = arr[i].getSalary();
                    employee = arr[i].toString();

                }

            }
        }
        System.out.println(employee);
    }


    public static void minSalary(Employee[] arr) {

        double min = arr[0].getSalary();
        String employee = arr[0].toString();
        int department = arr[0].getDepartment();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getSalary() <= min) {
                    min = arr[i].getSalary();
                    employee = arr[i].toString();

                }
            }
        }
        System.out.println(employee);
    }

    public static void printEmployeeNames(Employee[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getName());
            }
        }
    }

    // Повышенная сложность
    public static void indexingSalary(Employee[] arr) {
        double indexing = 0.1;
        double b;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                b = (arr[i].getSalary() * indexing) + arr[i].getSalary();
                System.out.println(b);
            }
        }
    }

    public static void lessThan(Employee[] arr, int a) {
        String b = arr[0].getName();


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getSalary() < a) {
                    System.out.println("У сотруднока зарплата меньше чем " + a
                            + " руб. " + "Id:" + arr[i].id + " " + arr[i].getName() + " " + arr[i].getSalary());
                }
            }
        }

    }


    public static void moreThan(Employee[] arr, int a) {
        String b = arr[0].getName();


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getSalary() >= a) {
                    System.out.println("У сотруднока зарплата больше чем " + a
                            + " руб. " + "Id:" + arr[i].id + " " + arr[i].getName() + " " + arr[i].getSalary());
                }
            }
        }

    }


    public static void maxSalaryDepartment(Employee[] arr, int x) {
        double max = 0;
        String employee = arr[0].getName();
        int department = arr[0].getDepartment();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getDepartment() == x) {
                    max = arr[i].getSalary();
                    employee = arr[i].getName();
                    department = arr[i].getDepartment();
                }
            }

        }
        System.out.println("Самая большая зарплата у сотрудника : " + employee + " " + (int) max + " руб. Из отдела №" +
                department);
    }

    public static void minSalaryDepartment(Employee[] arr, int x) {
        double min = arr[0].getSalary();
        String employee = arr[0].getName();
        int department = arr[0].getDepartment();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getDepartment() == x) {
                    if (arr[i].getSalary() <= min) {
                        min = arr[i].getSalary();
                        employee = arr[i].getName();
                        department = arr[i].getDepartment();
                    }
                }
            }
        }
        System.out.println("Минимальная зарплата у сотрудника : " + employee + " " + (int) min + " руб. Из отдела №" +
                department);
    }

    public static void sumSalaryDepartment(Employee[] arr, int x) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getDepartment() == x) {
                    sum = arr[i].getSalary() + sum;

                }
            }
        }
        System.out.println("Сумма затрат на зарплату по отделу : " + sum + " руб.");


    }


    public static void averageSalaryDepartment(Employee[] arr, int x) {
        double salaryDepartment = 0;
        int counterEmployee = 0;
        double averageSalaryDepartment = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getDepartment() == x) {
                    System.out.println(arr[i].toString());
                    counterEmployee++;
                    salaryDepartment = arr[i].getSalary() + salaryDepartment;
                }
            }
        }
        averageSalaryDepartment = salaryDepartment / counterEmployee;
        System.out.println("Средняя зарплата по отделу : " + averageSalaryDepartment + " руб.");
    }

    public static void indexingSalaryDepartment(Employee[] arr, int employee, double indexationPercentage) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getDepartment() == employee) {
                    double indexingSalaryDepartment = (arr[i].getSalary() * indexationPercentage / 100) +
                            arr[i].getSalary();
                    System.out.println("До повышения : " + arr[i].getSalary() + " руб. " + "После повышения: " +
                            indexingSalaryDepartment + " руб.");
                }
            }
        }
    }

    public static void printEmployeeDepartment(Employee[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getDepartment() == x) {
                    System.out.println(arr[i].getName() + " " + arr[i].getSalary());
                }
            }
        }
    }

    public static void main(String[] args) {

        Employee[] persArray = new Employee[10];
        persArray[0] = new Employee("Иван Валерьевич Сухин", 83000, 5);
        persArray[1] = new Employee("Семен Генадьевич Семенов", 74700, 2);
        persArray[2] = new Employee("Виктор Сергеевич Замков", 51000, 4);
        persArray[3] = new Employee("Сергей Иванович Матвеев", 68500, 1);
        persArray[4] = new Employee("Маргарита Ивановна Степакова", 72800, 2);
        persArray[5] = new Employee("Игнат Степанович Федотов", 83300, 3);
        persArray[6] = new Employee("Марина Валерьевна Жукова", 92800, 4);
        persArray[7] = new Employee("Станислав Петрович Сумкин", 72900, 1);
        persArray[8] = new Employee("Светлана Антоновна Ручка", 88200, 3);
        persArray[9] = new Employee("Андрей Олегович Петров", 73500, 5);

// База:
        System.out.println();
        printList(persArray);
        System.out.println();

        printSumSalary(persArray);
        System.out.println();

        minSalary(persArray);
        System.out.println();

        maxSalary(persArray);
        System.out.println();

        averageSalary(persArray);
        System.out.println();


        printEmployeeNames(persArray);
        System.out.println();

// Повышенная сложность:

        indexingSalary(persArray);
        System.out.println();

        minSalaryDepartment(persArray, 2);
        System.out.println();

        maxSalaryDepartment(persArray, 3);
        System.out.println();

        sumSalaryDepartment(persArray, 2);
        System.out.println();


        averageSalaryDepartment(persArray, 2);
        System.out.println();

        indexingSalaryDepartment(persArray, 3, 10);
        System.out.println();

        printEmployeeDepartment(persArray, 5);
        System.out.println();

        lessThan(persArray, 80000);
        System.out.println();

        moreThan(persArray, 80000);
        System.out.println();


    }
}




