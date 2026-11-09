class Employee {
    String fullname;
    double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о зарплате сотрудников: ");
        System.out.printf("%-15s %10s%n", "ФИО", "Зарплата");
        for (Employee emp : employees) {
            System.out.printf("%-15s %10.2f%n", emp.fullname, emp.salary);
        }
    }
}


void main() {
    Employee[] employees = {
            new Employee("Иванов И.И.", 1250.50),
            new Employee("Петров П.П.", 980.00),
            new Employee("Сидоров С.С.", 2100.75)
    };

    Report.generateReport(employees);
}
