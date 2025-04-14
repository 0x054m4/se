package UniversityLibraryManagementSystem.src;
import java.util.ArrayList;

public class Author {
    private String name;
    private String bio;
    private int id;
    private ArrayList<Book> books;

    // Constructors
    public Author(String name, String bio, ArrayList<Book> books) {
        this.name = name;
        this.bio = bio;
        this.books = books;
    }

    public Author(int id) {
        this.id = id;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    // Other methods
    public void addAuthor() {
        // Add author to DB or list
    }

    public void updateAuthor() {
        // Update author info
    }

    public void deleteAuthor() {
        // Delete author
    }
}
