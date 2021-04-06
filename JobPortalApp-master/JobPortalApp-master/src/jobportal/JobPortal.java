//OOP2 Project Section#4/Group#4 

//Fatima Al-Ramadhan 2180004473
//Raghad bandar 2190005368
//Razan Alsudairi 2180002990
// Manar
// khawla 


package jobportal;

public class JobPortal {

    private final String DataBase_URL = "jdbc:derby://localhost:1527/JobPortalDB";
     private final String DataBase_UsreName = "DB";
     private final String DataBase_UPassword = "DB";
   
    public static void main(String[] args) {
        
         screen mai = new screen();
               mai.setVisible(true);
         SignFrame e = new SignFrame();
                 e.setVisible(true);
        
                 
                
    }
    
}
