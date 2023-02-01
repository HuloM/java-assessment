package q1.com.book;

import q1.com.book.exceptions.InvalidBookException;

import java.util.Arrays;
import java.util.List;

public class Book {
    static final List<String> ACCEPTED_CATEGORIES = Arrays.asList("science", "fiction", "technology", "others");
    private String bookId;
    private String title;
    private String author;
    private String category;
    private float price;

    public Book(String bookId, String title, String author, String category, float price) throws InvalidBookException {
        // as per requirements, bookId must start with ‘B’ and must be of length 4 characters
        if (!bookId.startsWith("B") || bookId.trim().length() > 4)
            throw new InvalidBookException("bookID must start with ‘B’ and must be of length 4 characters");
        // as per requirements, the price cannot be negative
        if (price < 0)
            throw new InvalidBookException("price cannot be negative");
        // as per requirements, the category must be one of the following: science, fiction, technology, or others
        if(!ACCEPTED_CATEGORIES.contains(category.toLowerCase()))
            throw new InvalidBookException("category must be one of the following: " + ACCEPTED_CATEGORIES.toString());


        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "bookId = " + bookId +
                ", title = " + title +
                ", author = " + author +
                ", category = " + category +
                ", price = " + price;
    }
}
