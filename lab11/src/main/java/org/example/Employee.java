package org.example;

public class Employee {
    protected String name;
    protected double salary;
    protected int experience;

    public Employee(String name, double salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public void work() {
        System.out.println(name + ": Работает");
    }

    public void work(int hours) {
        System.out.println(name + ": Работает " + hours + " часов");
    }

    public void work(String project) {
        System.out.println(name + ": Работает над проектом " + project);
    }

    public double calculateBonus() {
        return salary * 0.1;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }
}
