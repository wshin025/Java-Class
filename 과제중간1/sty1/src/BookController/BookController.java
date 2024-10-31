// 파일 경로: src/BookControl/BookController.java
package BookController;

import BookDTO.Book;
import BookService.BookService;
import BookView.BookView;
import java.util.Scanner;
import java.util.ArrayList;

public class BookController {
    private BookService bookService = new BookService();
    private BookView view = new BookView();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BookController controller = new BookController();
        controller.run();
    }

    public void run() {
        while (true) {
            System.out.println("1. Add Book  2. View Book  3. Update Book  4. Delete Book  5. View All Books  6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행문자 처리

            switch (choice) {
                case 1 -> addBook();
                case 2 -> viewBook();
                case 3 -> updateBook();
                case 4 -> deleteBook();
                case 5 -> viewAllBooks();
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addBook() {
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter Book Name: ");
        String bookName = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Publisher: ");
        String publish = scanner.nextLine();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Book book = new Book(isbn, bookName, author, publish, price);
        bookService.addBook(book);
        view.printBookAdded();
    }

    private void viewBook() {
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        Book book = bookService.getBookByIsbn(isbn);
        view.printBookDetails(book);
    }

    private void deleteBook() {
        System.out.print("Enter ISBN of the book to delete: ");
        String isbn = scanner.nextLine();
        Book book = bookService.getBookByIsbn(isbn);
        if (book != null) {
            bookService.deleteBook(isbn);
            view.printBookDeleted();
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    private void viewAllBooks() {
        ArrayList<Book> bookList = bookService.getBookList();
        if (bookList.isEmpty()) {
            view.printNoBooksAvailable();
        } else {
            view.printAllBooks(bookList);
        }
    }

    private void updateBook() {
        System.out.print("Enter ISBN of the book to update: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter New Book Name: ");
        String bookName = scanner.nextLine();
        bookService.updateBook(isbn, bookName);
        view.printBookUpdated();
    }
}
