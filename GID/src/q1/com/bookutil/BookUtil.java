package q1.com.bookutil;

import q1.com.book.Book;
import q1.com.book.BookStore;
import q1.com.book.exceptions.InvalidBookException;

import java.util.Scanner;

public class BookUtil {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        try {
            for (int i = 0; i < 3; i++) {
                // create and add 3 new books to the book store
                bookStore.addBook(createbookEntry());
            }

            bookStore.searchByAuthor("J.R.R Tolkien");
            bookStore.searchByTitle("Lord of the rings");

            bookStore.searchByTitle("Star Wars: Shadow of the Sith");

            bookStore.displayAll();
        } catch (InvalidBookException e) {
            System.out.println(e.getMessage());
        }
    }

    // This method is used to create a new book to be added to the book store
    static Book createbookEntry() throws InvalidBookException {
        System.out.print("Enter book id: ");
        String bookId = scanner.nextLine();
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book category: ");
        String category = scanner.nextLine();
        System.out.print("Enter book price: ");
        float price = scanner.nextFloat();

        scanner.nextLine();

        return new Book(bookId, title, author, category, price);
    }

}
