import java.util.ArrayList;

public class Student extends User{
    private ArrayList<BorrowHistory> borrowHistory;
    public Student(int userID) {
        super(userID);
        this.borrowHistory = new ArrayList<>();
    }
public Student(String name, String email, String password, String role, Status status) {
        super(name, email, password, role, status);
        this.borrowHistory = new ArrayList<>();
    }

   
}