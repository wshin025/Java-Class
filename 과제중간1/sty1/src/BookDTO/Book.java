// 파일 경로: src/BookDTO/Book.java
package BookDTO;

public class Book {
    private String isbn;
    private String bookName;
    private String author;
    private String publish;
    private double price;

    public Book(String isbn, String bookName, String author, String publish, double price) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
        this.publish = publish;
        this.price = price;
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getBookName() { return bookName; }
    public void setBookName(String bookName) { this.bookName = bookName; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getPublish() { return publish; }
    public void setPublish(String publish) { this.publish = publish; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Book Name: " + bookName + ", Author: " + author + ", Publisher: " + publish + ", Price: " + price;
    }
}
