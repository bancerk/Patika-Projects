# Library Management System

A simple Java-based library management system that allows users to add, search, lend, and return books using a console interface.

---

## Project Structure

- **Main.java**  
  Contains the entry point (`main` method) and manages user interactions via a console menu.

- **Model/Book.java**  
  Defines the `Book` class, which represents a book with attributes such as title, author, ISBN, and status.

- **Service/BookLibraryService.java**  
  Provides basic library operations including adding books, listing all books, and searching for books by title.

- **Service/BookLendingService.java**  
  Extends `BookLibraryService` and adds functionalities for lending (checking out) and returning books based on ISBN.

---

## Features

- **Add New Book:**  
  Allows users to enter the title, author, and ISBN to add a new book to the library. Books are added with a default status of "Available".

- **Display All Books:**  
  Lists all the books currently stored in the library.

- **Search by Title:**  
  Enables users to search for a book by providing its title. The search returns the first matching book.

- **Lend a Book:**  
  Checks out a book by changing its status to "Unavailable", provided that the book is currently available.

- **Return a Book:**  
  Returns a book by changing its status back to "Available", provided that it was previously checked out.  
  If the book does not match any ISBN number of previously lent books, i.e. the book belongs to another library or person, or the book was not lent to anyone (is still available within the library) and is a duplicate copy with the same ISBN number, the system notifies the user accordingly.

---

## Code Overview

- **Main.java:**  
  Implements the user interface and controls the flow of the application. It uses a loop to display the menu and process user inputs.

- **Book.java:**  
  Represents a book entity with its properties. It also provides getter and setter methods for manipulating these properties and an overridden `toString()` method for formatted display.

- **BookLibraryService.java:**  
  Manages the core library functionalities such as adding books to the collection and searching for a book by its title.

- **BookLendingService.java:**  
  Inherits from `BookLibraryService` and adds methods to lend (check out) and return books, ensuring that the status of each book is updated accordingly.

---

## Notes

- **Console-Based Application:**  
  The project uses simple console I/O for user interaction, making it straightforward and ideal for learning purposes.

- **Exact Match Searching:**  
  The search functionality currently matches the book title exactly. Consider enhancing the search logic for case-insensitive or partial matching as needed.

- **Educational Purposes:**  
  This project is designed to demonstrate basic object-oriented programming concepts and service inheritance in Java.