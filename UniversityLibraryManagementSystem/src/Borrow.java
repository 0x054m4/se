import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class Borrow {
    private int borrowID;
    private Date borrowDate;
    private Date dueDate;
    private Date returnDate;
    private String status;
    private double maxAmount;
    private Student student;
    private Book book;
    private String dbURL = "jdbc:derby://localhost:1527/UniversityLibraryDB;create=true";
    private Connection connection = null;
    private void connect() {
        try {
            // Optional, but good practice to register the driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            connection = DriverManager.getConnection(dbURL);
            System.out.println("Connected successfully to DB.");
        } catch (ClassNotFoundException e) {
            System.out.println("Derby ClientDriver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to DB.");
            e.printStackTrace();
        }
    }
    public Borrow(int borrowID) {
        this.borrowID = borrowID;
        connect();
    }

    public Borrow( Date borrowDate, Date dueDate, Book book, Student student) {
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.book = book;
        this.student = student;
        connect();
    }

    public int getBorrowID() {
        return borrowID;
    }

    public void setBorrowID(int borrowID) {
        this.borrowID = borrowID;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void renewBorrow(Date newDueDate) {
        this.dueDate = newDueDate;
        
    }

    public boolean isOverdue() {
        Date currentDate = new Date();
        return currentDate.after(dueDate);
    }

    // DB operations
    public void addBorrow() throws SQLException {
        String sql = "INSERT INTO Borrow (borrowDate, dueDate, returnDate, status, maxAmount, studentID, bookID) VALUES ('"
            + new java.sql.Date(borrowDate.getTime()) + "', '"
            + new java.sql.Date(dueDate.getTime()) + "', '"
            + (returnDate != null ? new java.sql.Date(returnDate.getTime()) : null) + "', '"
            + status + "', "
            + maxAmount + ", "
            + student.getUserID() + ", "
            + book.getISBN() + ")";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
     
    }
    public void updateBorrow() throws SQLException{
        String sql = "UPDATE Borrow SET borrowDate = '" + new java.sql.Date(borrowDate.getTime()) + "', dueDate = '"
            + new java.sql.Date(dueDate.getTime()) + "', returnDate = '"
            + (returnDate != null ? new java.sql.Date(returnDate.getTime()) : null) + "', status = '"
            + status + "', maxAmount = "
            + maxAmount + ", studentID = "
            + student.getUserID() + ", bookID = "
            + book.getISBN() + " WHERE borrowID = " + borrowID;
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
       
    }

    public void removeBorrow() throws SQLException{
        String sql = "DELETE FROM Borrow WHERE borrowID = " + borrowID;
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
    }

}
