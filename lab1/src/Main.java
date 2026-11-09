import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    int choice;

    do {
        System.out.println();
        System.out.println("1 - Задание 1 (произведение двух чисел)");
        System.out.println("2 - Задание 2 (большее из двух чисел)");
        System.out.println("3 - Задание 3 (нечётные числа от 99 до 1)");
        System.out.println("0 - Выход");
        System.out.print("Выбор: ");

        if (sc.hasNextInt()) {
            choice = sc.nextInt();
        } else {
            System.out.println("Ошибка ввода");
            sc.next();
            choice = -1;
            continue;
        }

        switch (choice) {
            case 1:
                System.out.print("Первое число: ");
                if (!sc.hasNextDouble()) {
                    System.out.println("Ошибка ввода");
                    sc.next();
                    break;
                }
                double a1 = sc.nextDouble();

                System.out.print("Второе число: ");
                if (!sc.hasNextDouble()) {
                    System.out.println("Ошибка ввода");
                    sc.next();
                    break;
                }
                double b1 = sc.nextDouble();

                System.out.println("Произведение = " + (a1 * b1));
                break;

            case 2:
                System.out.print("Первое число: ");
                if (!sc.hasNextDouble()) {
                    System.out.println("Ошибка ввода");
                    sc.next();
                    break;
                }
                double a2 = sc.nextDouble();

                System.out.print("Второе число: ");
                if (!sc.hasNextDouble()) {
                    System.out.println("Ошибка ввода");
                    sc.next();
                    break;
                }
                double b2 = sc.nextDouble();

                if (a2 > b2) {
                    System.out.println("Большее: " + a2);
                } else if (b2 > a2) {
                    System.out.println("Большее: " + b2);
                } else {
                    System.out.println("Равны");
                }
                break;

            case 3:
                System.out.println("Нечетные от 99 до 1:");
//                for (int i = 99; i >= 1; i -= 2) {
//                    System.out.print(i + " ");
//                }
                int i = 99;
                do {
                    System.out.print(i + "");
                    i-=2;
                } while (i >= 1);
                System.out.println();
                break;

            case 0:
                System.out.println("Выход");
                break;

            default:
                System.out.println("Неверный выбор");
        }
    } while (choice != 0);

    sc.close();
}