package Model;

public class Book {
    private String name;
    private Author author;
    private String isbn;
    private boolean availabilityStatus;

    public Book(String name, Author author, String isbn, boolean availabilityStatus) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.availabilityStatus = availabilityStatus;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", isbn='" + isbn + '\'' +
                ", availabilityStatus=" + availabilityStatus +
                '}';
    }
}
