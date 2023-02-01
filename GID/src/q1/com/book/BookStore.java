package q1.com.book;

import java.util.LinkedHashSet;
import java.util.Set;

public class BookStore {
    Set<Book> books;

    public BookStore() {
        this.books = new LinkedHashSet<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void searchByTitle(String title) {
        boolean isFound = false;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println(book);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("No book found with the title: " + title);
        }
    }

    public void searchByAuthor(String author) {
        boolean isFound = false;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("No book found with the author: " + author);
        }
    }

    public void displayAll() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
