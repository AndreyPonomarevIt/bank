package by.itacademy.andreyponomarev.javabasics.oop;

public class Book {
    private int idBook;
    private String author;
    private String publishingHouse;
    private int theYearOfPublishing;
    private int numberOfPages;
    private double price;
    public Book (int newIdBook, String newAuthor, String newPublishingHouse, int newTheYearOfPublishing,
                 int newNumberOfPages, double newPrice) {
        idBook=newIdBook;
        author=newAuthor;
        publishingHouse=newPublishingHouse;
        theYearOfPublishing=newTheYearOfPublishing;
        numberOfPages=newNumberOfPages;
        price=newPrice;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int newIdBook) {
        idBook = newIdBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String newPublishingHouse) {
        publishingHouse = newPublishingHouse;
    }

    public int getTheYearOfPublishing() {
        return theYearOfPublishing;
    }

    public void setTheYearOfPublishing(int newTheYearOfPublishing) {
        theYearOfPublishing = newTheYearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int newNumberOfPages) {
        numberOfPages = newNumberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", theYearOfPublishing=" + theYearOfPublishing +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                '}';
    }
}
