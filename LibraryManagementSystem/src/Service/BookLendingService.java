package Service;

import Model.Book;

public class BookLendingService extends BookLibraryService {

    boolean bookFoundIsbnSearch = false;

    public void lendBook(String userSearchedBookIsbn) {
        for (Book book : Books){
            if (book.getIsbn().equals(userSearchedBookIsbn)){
                book.setStatus("Unavailable");
                System.out.println("Book checked out successfully!");
                bookFoundIsbnSearch =  true;
                break;
            }
        }
            if (!bookFoundIsbnSearch){
                System.out.println("Book not found or already checked out.");
            }
    }

    public void returnBook(String userReturnBookIsbn) {
        for (Book book : Books){
            if (book.getIsbn().equals(userReturnBookIsbn) && book.getStatus().equals("Unavailable")){
                book.setStatus("Available");
                System.out.println("Book returned successfully!");
                bookFoundIsbnSearch = true;
                break;
            }
            if (!bookFoundIsbnSearch){
                System.out.println("Entered ISBN does not match with any books in Library");
            }
        }
    }
}