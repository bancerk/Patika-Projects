package Model;

public class Book {
    private String bookTitle;
    private String author;
    private String isbn;
    private boolean availabilityStatus;
    private String status;

    public Book(String bookTitle, String author, String isbn, boolean availabilityStatus) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.isbn = isbn;
        this.availabilityStatus = availabilityStatus;
        if (availabilityStatus){
            status = "Available";
        }else {
            status = "Unavailable";
        }
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

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
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

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
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
