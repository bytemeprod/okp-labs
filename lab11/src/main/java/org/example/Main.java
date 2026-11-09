package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Employee genericEmp = new Employee("Иван", 1200.0, 2);

        genericEmp.work();
        genericEmp.work(8);
        genericEmp.work("Тестовый_Проект");

        Manager manager = new Manager("Менеджер", 2500.0, 6, 8);
        Developer dev = new Developer("", 2000.0, 4, "Java");

        manager.work("Проект1", 3);
        dev.work("Проект2", false);
        dev.work("Проект3", true);

        Employee[] employees = new Employee[] {
                new Employee("Петр", 800.0, 1),
                new Manager("Ольга", 2500.0, 6, 8),
                new Developer("Алексей", 2000.0, 4, "Java")
        };

        for (Employee emp : employees) {
            if (emp instanceof Manager) {
                Manager m = (Manager) emp;
                System.out.println(m.getTeamSize());
            } else if (emp instanceof Developer) {
                Developer d = (Developer) emp;
                System.out.println(d.getPrimaryLanguage());
            } else {
                System.out.println(emp.getName());
            }
        }
    }
}
