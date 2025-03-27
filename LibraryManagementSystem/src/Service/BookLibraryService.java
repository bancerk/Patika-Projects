package Service;

import Model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookLibraryService {

    public List<Book> Books = new ArrayList<>();

    public void searchBookTitle(String userSearchedBookTitle) {
        for (Book book : Books){
            if (book.getBookTitle().equals(userSearchedBookTitle)){
                System.out.println("Found books:");
                System.out.println("---------------------------");
                System.out.println(book);
                return;
            }else {
                System.out.println("Search yielded no results.");
            }
        }
    }

    public void printAllBooks() {
        for (Book book : Books){
            System.out.println(book);
        }
    }

    public void addBook(String bookTitle, String author, String isbn) {
        Book book = new Book(bookTitle,author,isbn,"Available");
        Books.add(book);
    }
}
