import java.util.ArrayList;

public class Student extends User{
    private ArrayList<Borrow> borrowList;

    public Student(int userID) {
        super(userID);
        this.borrowList = new ArrayList<Borrow>();
    }
    
    public Student(String name, String email, String password, String role, Status status) {
        super(name, email, password, role, status);
        this.borrowList = new ArrayList<Borrow>();
    }
    
    public void setBorrowList(ArrayList<Borrow> borrowList) {
        this.borrowList = borrowList;
    }

    public ArrayList<Borrow> getBorrowList() {
        return borrowList;
    }
}