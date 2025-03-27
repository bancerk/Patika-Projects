// This class represents a Book object with details such as title, author, ISBN, and status.
package Model;

public class Book {
    // Private instance variables to hold the book details.
    private String bookTitle;
    private String author;
    private String isbn;
    private String status;

    // Constructor to initialize a new Book object with title, author, ISBN, and status.
    public Book(String bookTitle, String author, String isbn, String status) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.isbn = isbn;
        this.status = status;
    }

    // Getter method for the book title.
    public String getBookTitle() {
        return bookTitle;
    }

    // Getter method for the book author.
    public String getAuthor() {
        return author;
    }

    // Getter method for the book ISBN.
    public String getIsbn() {
        return isbn;
    }

    // Setter method for updating the book author.
    public void setAuthor(String author) {
        this.author = author;
    }

    // Setter method for updating the book title.
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    // Setter method for updating the book ISBN.
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Getter method for the book status.
    public String getStatus() {
        return status;
    }

    // Setter method for updating the book status.
    public void setStatus(String status) {
        this.status = status;
    }

    // Overrides the default toString() method to provide a formatted string representation of the book.
    @Override
    public String toString() {
        return  "Title: " + bookTitle + "\n" +
                "Author: " + author + "\n" +
                "ISBN: " + isbn + "\n" +
                "Status: " + status + "\n" +
                "---------------------------";
    }
}
