// Import the BookLendingService class from the Service package
import Service.BookLendingService;

// Import the Scanner class for user input
import java.util.Scanner;

public class Main {

    // Create a Scanner object to read user input from the console
    private static final Scanner scanner = new Scanner(System.in);

    // private static final BookLibraryService bookLibraryService = new BookLibraryService();
    /*
     * Instead of creating two separate objects, use one instance of BookLendingService
     * (since it extends BookLibraryService) for all operations.
     * This way, when you add books, they are available when lending books.
     * And then use bookLendingService.addBook(...) instead of bookLibraryService.addBook(...).
     */
    // Create a single instance of BookLendingService to handle all book-related operations
    private static final BookLendingService bookLendingService = new BookLendingService();

    public static void main(String[] args) {

        // Display a welcome message to the user
        System.out.println("Welcome to the Library Management System!");

        // Initialize a flag to control the main loop of the application
        boolean running = true;

        // Main loop of the application: continues until the user chooses to exit
        do {

            // Print the main menu options
            printMainMenu();
            // Read the user's menu choice as an integer
            int mainMenuUserInput = scanner.nextInt();
            // Clear the newline character from the input buffer
            scanner.nextLine();

            // Execute different actions based on the user's input using a switch-case statement
            switch (mainMenuUserInput){
                case 1: // Add new book to library
                    System.out.println("");
                    System.out.print("Enter book title: ");
                    // Read the book title from user input
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    // Read the author name from user input
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    // Read the ISBN from user input
                    String isbn = scanner.nextLine();

                    // Add the new book to the library using the BookLendingService
                    bookLendingService.addBook(bookTitle, author, isbn);
                    System.out.println("Book added successfully!");
                    break;

                case 2: // Display all books in the library
                    System.out.println("");
                    System.out.println("All Books:");
                    System.out.println("---------------------------");
                    // Display the list of all books by calling the printAllBooks method
                    bookLendingService.printAllBooks();
                    break;

                case 3: // Search for a book by title within the library
                    System.out.println("");
                    System.out.print("Enter a book title to search: ");
                    // Read the book title to search for from user input
                    String userSearchedBookTitle = scanner.nextLine();
                    // Search for the book using the searchBookTitle method
                    bookLendingService.searchBookTitle(userSearchedBookTitle);
                    break;

                case 4: // Check out a book from the library
                    System.out.println("");
                    System.out.print("Enter the ISBN of the book you want to check out: ");
                    // Read the ISBN of the book the user wants to check out
                    String userSearchedBookIsbn = scanner.nextLine();
                    // Attempt to lend the book using the lendBook method
                    bookLendingService.lendBook(userSearchedBookIsbn);
                    break;

                case 5: // Return a previously checked out book to the library
                    System.out.println("");
                    System.out.print("Enter the ISBN of the book you want to return: ");
                    // Read the ISBN of the book the user is returning
                    String userReturnBookIsbn = scanner.nextLine();
                    // Process the return of the book using the returnBook method
                    bookLendingService.returnBook(userReturnBookIsbn);
                    break;

                case 6: // Exit the application
                    System.out.println("");
                    System.out.println("Thank you for using Library Management System!");
                    // Set running to "false" to exit the loop and end the program
                    running = false;
                    break;

                default: {
                    // Handle invalid user input by notifying the user of an unrecognized entry
                    System.out.println("Unrecognised Entry! Please try again.");
                }
            }
        } while (running); // Continue looping until running is set to false

        // Close the scanner resource to prevent resource leaks
        scanner.close();
    }

    // Method to print the main menu options to the console
    private static void printMainMenu() {
        System.out.println("");
        System.out.println("Please select an option: ");
        System.out.println("1.  Add new book");
        System.out.println("2.  Display all books");
        System.out.println("3.  Search for a book by title");
        System.out.println("4.  Check out a book");
        System.out.println("5.  Return a book");
        System.out.println("6.  Exit");
        System.out.println("");
        System.out.print("Enter your choice: ");
    }
}