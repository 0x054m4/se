import java.util.Date;

public class Borrow {
    private int borrowID;
    private Date borrowDate;
    private Date dueDate;
    private Date returnDate;
    private String status;
    private double maxAmount;
    private Student student;
    private Book book;

    public Borrow(int borrowID) {
        this.borrowID = borrowID;
    }

    public Borrow( Date borrowDate, Date dueDate, Book book, Student student) {
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.book = book;
        this.student = student;
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
}
