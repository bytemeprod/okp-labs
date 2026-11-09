package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printBooks(List<Book> books, int popularity) {
        System.out.println("Книги с уровнем популярности: " + popularity);
        boolean found = false;
        for (Book book : books) {
            if (book.getPopularity() == popularity) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Книг с такой популярностью не найдено.");
        }
    }

    static void main() {
        Map<String, Product> productMap = new LinkedHashMap<>();

        productMap.put("El_1", new Electronics("ElName1", 101, 1199.99, 12));
        productMap.put("El_2", new Electronics("ElName2", 102, 899.50, 24));
        productMap.put("El_3", new Electronics("ElName3", 103, 349.00, 12));

        productMap.put("Food_1", new Food("FoodName1", 201, 1.20, "2026-11-20"));
        productMap.put("Food_2", new Food("FoodName2", 202, 0.90, "2026-11-06"));
        productMap.put("Food_3", new Food("FoodName3", 203, 8.50, "2027-02-15"));

        productMap.put("Clothing_1", new Clothing("ClothingName1", 301, 45.00, "L"));
        productMap.put("Clothing_2", new Clothing("ClothingName2", 302, 60.00, "32/32"));

        System.out.println("Список всех продуктов в Map:");
        for (var value : productMap.entrySet()) {
            System.out.println("Ключ (Название): [" + value.getKey() + "] -> Значение: " + value.getValue());
        }

        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Название Книги", "Автор Книги", 5, Arrays.asList(5, 5, 4, 5)));
        printBooks(books, 5);
    }
}
