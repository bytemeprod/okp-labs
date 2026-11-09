package org.example;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

class Task5 {
    public static void main(String[] args) {
        File file = new File("f.txt");
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(100);
                writer.println(num);
            }
            System.out.println("Файл 'f.txt' с 10 числами сформирован.");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        int multiplesOf5Count = 0;
        System.out.print("Содержимое файла: ");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                System.out.print(num + " ");

                if (num % 5 == 0) {
                    multiplesOf5Count++;
                }
            }
            System.out.println();
            System.out.println("Количество чисел, кратных 5: " + multiplesOf5Count);
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
    }
}