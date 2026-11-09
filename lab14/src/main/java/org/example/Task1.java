package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;

class Task1 {
    public static void main(String[] args) {
        File file = new File("favorite_book.txt");
        String bookInfo = "Название: Название Книги\n" +
                "Автор: Автор Книги\n" +
                "Жанр: Жанр Книги\n" +
                "Год публикации: 1967\n" +
                "Описание: описание книги";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8))) {
            writer.write(bookInfo);
            System.out.println("Файл успешно создан и заполнен.\n");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }

        System.out.println("Имя файла: " + file.getName());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Существует: " + file.exists());
        System.out.println("Доступен для чтения: " + file.canRead());
        System.out.println("Доступен для записи: " + file.canWrite());
        System.out.println("Это директория: " + file.isDirectory());

        System.out.println("Содержимое файла: ");
        try (BufferedReader reader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}