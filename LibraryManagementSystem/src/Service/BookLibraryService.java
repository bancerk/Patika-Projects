// This package declaration places this class in the Service package
package Service;

// Import the Book model class to create and manage book objects
import Model.Book;

// Import necessary utilities for working with lists
import java.util.ArrayList;
import java.util.List;

public class BookLibraryService {

    // List to store all books in the library
    public List<Book> Books = new ArrayList<>();

    // Flag to indicate if a book was found during title search operations
    boolean bookFoundTitleSearch = false;

    // Method to search for a book by its title
    public void searchBookTitle(String userSearchedBookTitle) {
        // Iterate over each book in the Books list
        for (Book book : Books){
            // Check if the current book's title matches the user's search query
            if (book.getBookTitle().equals(userSearchedBookTitle)){
                System.out.println("Found books:");
                System.out.println("---------------------------");
                // Print the details of the found book
                System.out.println(book);
                // Set the flag to true indicating that a match was found
                bookFoundTitleSearch = true;
                // Exit the loop after the first matching book is found
                break;
            }
        }
        // If no book was found after the search, notify the user
        if (!bookFoundTitleSearch){
            System.out.println("Search yielded no results.");
        }
    }

    // Method to print details of all books in the library
    public void printAllBooks() {
        // Loop through each book in the Books list and print its details
        for (Book book : Books){
            System.out.println(book);
        }
    }

    // Method to add a new book to the library
    public void addBook(String bookTitle, String author, String isbn) {
        // Create a new Book object with the provided title, author, ISBN, and default status "Available"
        Book book = new Book(bookTitle, author, isbn, "Available");
        // Add the newly created book to the Books list
        Books.add(book);
    }
}
