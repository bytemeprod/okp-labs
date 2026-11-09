package org.example;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {
        File file = new File("temperatures.txt");
        Scanner consoleScanner = new Scanner(System.in);
        consoleScanner.useLocale(Locale.US);

        int count = 14;

        System.out.println("Введите " + count + " положительных вещественных значений температуры тела пациента:");
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            for (int i = 1; i <= count; i++) {
                double temp;
                while (true) {
                    System.out.print("Пациент " + i + ": ");

                    if (!consoleScanner.hasNextDouble()) {
                        System.out.println("Некорректный ввод. Нужно вещественное число.");
                        consoleScanner.next();
                        continue;
                    }

                    temp = consoleScanner.nextDouble();
                    if (temp > 0) {
                        break;
                    }
                    System.out.println("Температура должна быть положительной.");
                }
                writer.println(temp);
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи файла: " + e.getMessage());
            return;
        }

        double sum = 0.0;
        int readCount = 0;

        try (Scanner fileScanner = new Scanner(file)) {
            fileScanner.useLocale(Locale.US);
            while (fileScanner.hasNextDouble()) {
                double temp = fileScanner.nextDouble();
                sum += temp;
                readCount++;
            }

            if (readCount > 0) {
                double average = sum / readCount;
                System.out.printf(Locale.US, "\nСредняя температура по %d пациентам: %.2f °C\n", readCount, average);
            } else {
                System.out.println("Файл пуст.");
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
    }
}