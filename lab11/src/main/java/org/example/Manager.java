package org.example;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int experience, int teamSize) {
        super(name, salary, experience);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2;
    }

    public void work(String project, int meetingsCount) {
        System.out.println(name + ": Ведет проект " + project + " и проводит " + meetingsCount + " совещаний с командой из " + teamSize + " чел.");
    }

    public int getTeamSize() {
        return teamSize;
    }
}
