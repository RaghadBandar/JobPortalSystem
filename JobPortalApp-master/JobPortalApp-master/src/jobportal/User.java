package jobportal;

public class User {
      
    String password;  
    String UserID;
    
    public User() {
    }
    
    public User(String password, String UserID) {
        this.password = password;
        this.UserID = UserID;
    }

    public String getPassword() {
        return password;
    }

    public String getUserID() {
        return UserID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    @Override
    public String toString() {
        return "User{" + "password=" + password + ", UserID=" + UserID + '}';
    }

    public boolean logIn(String password, String UserID) {
        //We Will do it!!
        return true;
    }
    
     
    
}
