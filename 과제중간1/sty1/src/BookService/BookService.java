// 파일 경로: src/BookService/BookService.java
package BookService;

import BookDTO.Book;
import java.util.ArrayList;

public class BookService {
    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public Book getBookByIsbn(String isbn) {
        for (Book book : bookList) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void deleteBook(String isbn) {
        bookList.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void updateBook(String isbn, String newBookName) {
        Book book = getBookByIsbn(isbn);
        if (book != null) {
            book.setBookName(newBookName);
        }
    }


}
