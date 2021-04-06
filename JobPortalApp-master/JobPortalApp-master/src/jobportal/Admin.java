/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobportal;

/**
 *
 * @author ِAsus
 */
public class Admin extends User{
    
    private String adminName;
    private String email;
    private String adminRole; //I think we don't need it!
    
    public Admin (){
           }
    
    public Admin (String adminName, String email, String adminRole, String userID, String password){
        
        this.adminName = adminName;
        this.adminRole = adminRole;
        this.email = email;
        this.userID = userID;
        this.password = password;
        
    }
    
    public void setName (String adminName){
       this.adminName = adminName;
    }
    
    public void setAdminRole (String adminRole){
       this.adminRole = adminRole;
    }
    
    public void setEmail (String email){
       this.email = email;
    }
    
    public String getName (){
        return adminName;
    }
    
    public String getRole (){
        return adminRole;
    }
    
    public String getEmail (){
        return email;
    }
    
     @Override
    public String toString() {
        return "Admin {" + "AdminName = " + adminName + ", Email = " + email + ", AdminRole = " + adminRole + '}';
    }
    
    public void addJob (String jobName, int jobID, String jobDescription, boolean jobState, String jobMajor){
        //Fatima
        
    }//end of addJob method
    
    public void deleteJob (String jobName, int jobID, String jobDescription, boolean jobState, String jobMajor) {
        //khawla
        
    }//end of deleteJob method

    public void updateJob (int jobID){
        //Razan
        
    }//end of updateJob method
    
}//end of Admin class 
