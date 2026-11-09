package org.example;

class InvalidISBNException extends Exception {
    public InvalidISBNException(String message) {
        super(message);
    }
}

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}

class Book {
    private String title;
    private String author;
    private String isbn;
    private int pages;
    private boolean available;

    private static final String ISBN_REGEX = "^\\d{3}-\\d{1}-\\d{4}-\\d{4}-\\d{1}$";

    public Book(String title, String author, String isbn, int pages) throws InvalidISBNException {
        if (isbn == null || !isbn.matches(ISBN_REGEX)) {
            throw new InvalidISBNException("Неверный формат ISBN: " + isbn);
        }
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.available = true;
    }

    public void borrow() throws BookNotAvailableException {
        if (!available) {
            throw new BookNotAvailableException("Книга \"" + title + "\" недоступна.");
        }
        available = false;
        System.out.println("Вы взяли книгу: " + title);
    }

    public void returnBook() {
        available = true;
        System.out.println("Книга возвращена: " + title);
    }

    public String getIsbn() {
        return isbn;
    }
}

public class Main {
    static void main() {
        try {
            Book book = new Book("Мастер и Маргарита", "М. А. Булгаков", "978-5-170-80115-2", 448);

            // Операции выдачи и возврата
            book.borrow();

            // book.borrow(); 

            book.returnBook();

        } catch (InvalidISBNException | BookNotAvailableException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
