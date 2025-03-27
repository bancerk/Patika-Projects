import Service.BookLendingService;

import java.util.Scanner;

public class Main {

    private static  final Scanner scanner = new Scanner(System.in);
    // private static final BookLibraryService bookLibraryService = new BookLibraryService();
    /*
     Instead of creating two separate objects, use one instance of BookLendingService
     (since it extends BookLibraryService) for all operations.
     This way, when you add books, they are available when lending books.
     And then use bookLendingService.addBook(...) instead of bookLibraryService.addBook(...).
     */
    private static final BookLendingService bookLendingService = new BookLendingService();


    public static void main(String[] args) {

        // Greeter
        System.out.println("Welcome to the Library Management System!");

        boolean running = true;

        do {

            printMainMenu();
            int mainMenuUserInput = scanner.nextInt();
            scanner.nextLine();


            switch (mainMenuUserInput){
                case 1: // Add new book
                    System.out.println("");
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();

                    bookLendingService.addBook(bookTitle,author,isbn);
                    System.out.println("Book added successfully!");
                    break;

                case 2: // Display all books
                    System.out.println("");
                    System.out.println("All Books:");
                    System.out.println("---------------------------");
                    bookLendingService.printAllBooks();
                    break;

                case 3: // Search for a book by title
                    System.out.println("");
                    System.out.print("Enter a book title to search: ");
                    String userSearchedBookTitle = scanner.nextLine();
                    bookLendingService.searchBookTitle(userSearchedBookTitle);
                    break;

                case 4: // Check out a book
                    System.out.println("");
                    System.out.print("Enter the ISBN of the book you want to check out: ");
                    String userSearchedBookIsbn = scanner.nextLine();
                    bookLendingService.lendBook(userSearchedBookIsbn);
                    break;

                case 5: // Return a book
                    System.out.println("");
                    System.out.print("Enter the ISBN of the book you want to return: ");
                    String userReturnBookIsbn = scanner.nextLine();
                    bookLendingService.returnBook(userReturnBookIsbn);
                    break;

                case 6: // Exit
                    System.out.println("");
                    System.out.println("Thank you for using Library Management System!");
                    running = false;
                    break;

                default: {
                    System.out.println("Unrecognised Entry! Please try again.");
                }
            }
        }while (running);

        scanner.close();
    }

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