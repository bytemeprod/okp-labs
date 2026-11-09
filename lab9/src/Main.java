void main() {
    Employee[] employees = new Employee[] {
            new Manager("Алексей Смирнов", 120000.0, 7, 8),
            new Developer("Иван Петров", 95000.0, 3, "Java"),
    };

    for (Employee emp : employees) {q
        emp.displayInfo();
        System.out.print("Обязанность: ");
        emp.work();
        System.out.printf("Бонус: %f\n", emp.calculateBonus());
    }
}