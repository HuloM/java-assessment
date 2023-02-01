package q1.com.book;

import java.util.LinkedHashSet;
import java.util.Set;

public class BookStore {
    // using a set so that there won't be duplicate books
    Set<Book> books;

    public BookStore() {
        // using a linked hash set so that the books will be ordered by the order they are added
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
            // if no book is found with the given title it will print the following message
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
            // if no book is found with the given author it will print the following message
            System.out.println("No book found with the author: " + author);
        }
    }

    // print out all the books in the book store
    public void displayAll() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
