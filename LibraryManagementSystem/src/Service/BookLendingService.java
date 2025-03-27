package Service;

import Model.Book;

public class BookLendingService extends BookLibraryService {

    boolean bookFound = false;

    public void lendBook(String userSearchedBookIsbn) {
        for (Book book : Books){
            if (book.getIsbn().equals(userSearchedBookIsbn)){
                book.setStatus("Unavailable");
                System.out.println("Book checked out successfully!");
                bookFound =  true;
                break;
            }
            if (!bookFound){
                System.out.println("Book not found or already checked out.");
            }
        }
    }
}