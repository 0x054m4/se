package UniversityLibraryManagementSystem.src;

import java.util.ArrayList;

public class Book {
    private int ISBN;
    private String name;
    private Author author;
    private Status status;
    private String category;
    private Location location;

    // Constructors
    public Book(int ISBN) {
        this.ISBN = ISBN;
    }

    public Book(String name, String author, Status status) {
        this.name = name;
        this.status = status;
        // You might need logic to assign the Author by name
    }

    // Setters
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    // Getters
    public int getISBN() {
        return ISBN;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Status getStatus() {
        return status;
    }

    public String getCategory() {
        return category;
    }

    public Location getLocation() {
        return location;
    }

    // Other methods
    public void addBook() {
        // Logic to add book
    }
}
