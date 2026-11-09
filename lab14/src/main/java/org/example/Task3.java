package org.example;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        File fileF = new File("f.txt");
        File fileG = new File("g.txt");
        File fileH = new File("h.txt");

        Random random = new Random();
        int totalNumbers = 20;

        try (PrintWriter writerF = new PrintWriter(new FileWriter(fileF))) {
            for (int i = 0; i < totalNumbers; i++) {
                int val = random.nextInt(301) - 150;
                writerF.println(val);
            }
            System.out.println("Файл 'f.txt' успешно создан с " + totalNumbers + " случайными числами.");
        } catch (IOException e) {
            System.err.println("Ошибка при создании файла f: " + e.getMessage());
            return;
        }

        try (Scanner scannerF = new Scanner(fileF);
             PrintWriter writerG = new PrintWriter(new FileWriter(fileG));
             PrintWriter writerH = new PrintWriter(new FileWriter(fileH))) {

            while (scannerF.hasNextInt()) {
                int number = scannerF.nextInt();
                int absVal = Math.abs(number);

                if (absVal >= 10 && absVal <= 99) {
                    writerG.println(number);
                } else {
                    writerH.println(number);
                }
            }
            System.out.println("Двузначные числа успешно записаны в 'g.txt'.");
            System.out.println("Остальные числа записаны в 'h.txt'.");

        } catch (IOException e) {
            System.err.println("Ошибка при обработке файлов: " + e.getMessage());
        }
    }
}