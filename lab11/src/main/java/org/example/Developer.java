package org.example;

public class Developer extends Employee {
    private String primaryLanguage;

    public Developer(String name, double salary, int experience, String primaryLanguage) {
        super(name, salary, experience);
        this.primaryLanguage = primaryLanguage;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15;
    }

    public void work(String task, boolean isBugFix) {
        String type = isBugFix ? "исправлением бага" : "разработкой фичи";
        System.out.println(name + " (" + primaryLanguage + "): Занимается " + type + " по задаче '" + task + "'");
    }

    public String getPrimaryLanguage() {
        return primaryLanguage;
    }
}
