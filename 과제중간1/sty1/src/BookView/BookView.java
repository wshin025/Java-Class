// 파일 경로: src/BookView/BookManagementView.java
package BookView;

import BookDTO.Book;
import java.util.ArrayList;

public class BookView {

    public void printBookDetails(Book book) {
        if (book != null) {
            System.out.println(book.toString());
        } else {
            System.out.println("Book not found.");
        }
    }

    public void printAllBooks(ArrayList<Book> bookList) {
        System.out.println("All books:");
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    public void printBookAdded() {
        System.out.println("Book added successfully!");
    }

    public void printBookDeleted() {
        System.out.println("Book deleted successfully!");
    }

    public void printNoBooksAvailable() {
        System.out.println("No books available.");
    }

    public void printBookUpdated() {
        System.out.println("Book updated successfully!");
    }
}

