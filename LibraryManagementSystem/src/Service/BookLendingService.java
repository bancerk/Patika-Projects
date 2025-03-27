// This package declaration places this class in the Service package
package Service;

// Import the Book model class for managing book objects
import Model.Book;

// BookLendingService extends BookLibraryService to reuse basic library operations 
// while adding functionality for lending and returning books.
public class BookLendingService extends BookLibraryService {

    // Flag to indicate if a book was found during ISBN search operations
    boolean bookFoundIsbnSearch = false;

    // Method to check out (lend) a book based on its ISBN
    public void lendBook(String userSearchedBookIsbn) {
        // Iterate over each book in the inherited Books list
        for (Book book : Books) {
            // Check if the current book's ISBN matches the provided ISBN 
            // and the book is currently available for checkout
            if (book.getIsbn().equals(userSearchedBookIsbn) && book.getStatus().equals("Available")) {
                // Change the status of the book to "Unavailable" to indicate it's checked out
                book.setStatus("Unavailable");
                System.out.println("Book checked out successfully!");
                // Set the flag to true indicating that a matching book was found and processed
                bookFoundIsbnSearch = true;
                // Exit the loop as the book has been successfully checked out
                break;
            }
        }
        // If no matching book was found or if the book was already checked out, notify the user
        // This logic is placed outside the loop to avoid multiple prints.
        if (!bookFoundIsbnSearch) {
            System.out.println("Book not found or already checked out.");
        }
    }

    // Method to return a previously checked out book based on its ISBN
    public void returnBook(String userReturnBookIsbn) {
        // Iterate over each book in the inherited Books list
        for (Book book : Books) {
            // Check if the current book's ISBN matches the provided ISBN 
            // and the book is currently marked as "Unavailable" (checked out)
            if (book.getIsbn().equals(userReturnBookIsbn) && book.getStatus().equals("Unavailable")) {
                // Change the status of the book to "Available" to indicate it's returned
                book.setStatus("Available");
                System.out.println("Book returned successfully!");
                // Set the flag to true indicating that a matching book was found and processed
                bookFoundIsbnSearch = true;
                // Exit the loop as the book has been successfully returned
                break;
            }
        }
        // If the book is not found or already marked available, the message is printed to notify user
        // This logic is placed outside the loop to avoid multiple prints.
        if (!bookFoundIsbnSearch) {
            System.out.println("Entered ISBN does not match with any registered books in Library");
        }
    }
}