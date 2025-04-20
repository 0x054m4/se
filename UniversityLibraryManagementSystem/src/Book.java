import java.util.ArrayList;

public class Book {
    private int ISBN;
    private String name;
    private Status status;
    private String category;
    private ArrayList<Author> author;
    private Location location;
    private Borrow borrow;

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
    
    public void setAuthor(ArrayList<Author> author) {
        this.author = author;
    }

    public ArrayList<Author> getAuthor() {
        return author;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setBorrow(Borrow borrow) {
        this.borrow = borrow;
    }

    public Borrow getBorrow() {
        return borrow;
    }

    public void addBook() {

    }

    public enum Status {
        ACTIVE,
        DISABLED
    }
}
