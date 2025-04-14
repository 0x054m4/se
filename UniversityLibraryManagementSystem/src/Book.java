import java.util.ArrayList;

public class Book {
    private int ISBN;
    private String name;
    private Author author;
    private Status status;
    private String category;
    private Location location;
    private ArrayList<Borrow> borrowList;

    public Book(int ISBN) {
        this.ISBN = ISBN;
    }

    public Book(String name, String author, Status status) {
        this.name = name;
        this.status = status;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setBorrowList(ArrayList<Borrow> borrowList) {
        this.borrowList = borrowList;
    }

    public ArrayList<Borrow> getBorrowList() {
        return borrowList;
    }


    public void addBook() {

    }

    public enum Status {
        ACTIVE,
        DISABLED
    }
}
