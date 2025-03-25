import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Greeter
        System.out.println("Welcome to the Library Management System!");

        // implement do-while loop
        // print main menu after each switch case operation

        // Main Menu
        System.out.println("Please select an option: ");
        System.out.println("1.  Add new book");
        System.out.println("2.  Display all books");
        System.out.println("3.  Search for a book by title");
        System.out.println("4.  Check out a book");
        System.out.println("5.  Return a book");
        System.out.println("6.  Exit");

        int mainMenuUserInput = scanner.nextInt();
        scanner.nextLine();

        System.out.println("");
        System.out.print("Enter your choice: ");


        //switch cases upon user input

        switch (mainMenuUserInput){
            case 1:
                System.out.print("Enter book title: ");
                scanner.nextLine();
                System.out.print("Enter author name: ");
                scanner.nextLine();
                System.out.print("Enter ISBN: ");
                scanner.nextLine();
                System.out.println("Book added successfully!");
                break;
            case 2:
                System.out.println("All Books:");
                /*
                ----------------------------------
                Title:
                Author:
                ISBN:
                Status: Available
                ----------------------------------
                 */
                break;
            case 3:
                System.out.print("Enter a book title to search: ");
                scanner.nextLine();
                /*
                Found Books:
                ----------------------------------
                Title:
                Author:
                ISBN:
                Status: Available
                ----------------------------------
                 */
                break;
            case 4:
                System.out.print("Enter the ISBN of the book you want to check out: ");
                scanner.nextLine();
                // implement book available control
                System.out.println("Book checked out successfully!");
                System.out.println("Book not found or already checked out.");
                break;
            case 5:
                System.out.print("Enter the ISBN of the book you want to return: ");
                scanner.nextLine();
                System.out.println("Book returned successfully!");
                break;
            case 6:
                System.out.println("Exiting Library Management System...");
                return;
            default: {
                System.out.println("Unrecognised Entry! Please try again.");
            }
        }

        scanner.close();
    }
}