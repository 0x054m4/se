import java.util.ArrayList;
    public class User {
        private int userID;
        private String name;
        private String email;
        private String password;
        private String role;
        private Status status;
    
        public User(int id) {
            this.userID = id;
        }
    
        public User(String name, String email, String password, String role, Status status) {
            this.name = name;
            this.email = email;
            this.password = password;
            this.role = role;
            this.status = status;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getName() {
            return name;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
    
        public String getEmail() {
            return email;
        }
    
        public void setRole(String role) {
            this.role = role;
        }
    
        public String getRole() {
            return role;
        }
    
        public void addUser() {
        }
    
        public void deleteUser() {
        }
    
        public void modifyUser() {
        }
    
        public void login() {
        }
    
        public enum Status {
            ACTIVE,
            DISABLED 
        }
    }
