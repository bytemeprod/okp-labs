package org.example;

import java.io.*;
import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        File file = new File("f.txt");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 10 целых чисел:");
        try (PrintWriter writer = new PrintWriter("f.txt")) {
            for (int i = 1; i <= 10; i++) {
                System.out.print("Число " + i + ": ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Ошибка ввода. Введите целое число " + i + ": ");
                    scanner.next();
                }
                int num = scanner.nextInt();
                writer.println(num);
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        long product = 1;
        System.out.println("\nСчитанные числа из файла 'f.txt':");
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");
                product *= num;
            }
            System.out.println();
            System.out.println("Произведение всех чисел: " + product);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
    }
}