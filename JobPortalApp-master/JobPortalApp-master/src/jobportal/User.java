package jobportal;

public class User {
      
    String password;  
    String userID;
    
    public User() {
    }
    
    public User(String password, String UserID) {
        this.password = password;
        this.userID = UserID;
    }

    public String getPassword() {
        return password;
    }

    public String getUserID() {
        return userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserID(String UserID) {
        this.userID = UserID;
    }

    @Override
    public String toString() {
        return "User{" + "password=" + password + ", UserID=" + userID + '}';
    }

    public boolean logIn(String password, String UserID) {
        //We Will do it!!
        return true;
    }
    
     
    
}
