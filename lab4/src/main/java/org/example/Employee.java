package org.example;

public class Employee {
    private String name;
    private double salary;
    private String position;

    public Employee(String name, double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " | Должность: " + position + " | Зарплата: " + salary;
    }


    void main() {
        Employee[] employees = {
                new Employee("Иван", 1200.0, "Разработчик"),
                new Employee("Анна", 2500.0, "Team Lead"),
                new Employee("Олег", 800.0, "Стажер"),
                new Employee("Мария", 1800.0, "QA Инженер"),
                new Employee("Павел", 3000.0, "Архитектор"),
                new Employee("Елена", 2100.0, "Project Manager")
        };

        Employee maxSalaryEmployee = employees[0];
        Employee minSalaryEmployee = employees[0];

        for (Employee emp : employees) {
            if (emp.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = emp;
            }
            if (emp.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = emp;
            }
        }

        System.out.println("Сотрудник с максимальной зарплатой:");
        System.out.println(maxSalaryEmployee);

        System.out.println("\nСотрудник с минимальной зарплатой:");
        System.out.println(minSalaryEmployee);
    }
}