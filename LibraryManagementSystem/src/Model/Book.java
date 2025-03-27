package Model;

public class Book {
    private String bookTitle;
    private String author;
    private String isbn;
    private String status;

    public Book(String bookTitle, String author, String isbn, String status) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.isbn = isbn;
        this.status = status;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  "Title: " + bookTitle + "\n" +
                "Author: " + author + "\n" +
                "ISBN: " + isbn + "\n" +
                "Status: " + status + "\n" +
                "---------------------------";

    }
}
