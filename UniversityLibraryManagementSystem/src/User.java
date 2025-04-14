public class User {
    private int userID;
    private String name;
    private String email;
    private String password;
    private String role;
    private Status status;

    public User(int userID) {
        this.userID = userID;
    }

    public User(String name, String email, String password, String role, Status status) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Status {
        ACTIVE, DISABLED
    }
}

public class Student extends User {
    
    public Student(int userID) {
        super(userID);
    }

    public Student(String name, String email, String password, Status status) {
        super(name, email, password, "Student", status);
    }
}

public class Admin extends User {
    
    public Admin(int userID) {
        super(userID);
    }

    public Admin(String name, String email, String password, Status status) {
        super(name, email, password, "Admin", status);
    }
}

public class Librarian extends User {
    
    public Librarian(int userID) {
        super(userID);
    }

    public Librarian(String name, String email, String password, Status status) {
        super(name, email, password, "Librarian", status);
    }
}