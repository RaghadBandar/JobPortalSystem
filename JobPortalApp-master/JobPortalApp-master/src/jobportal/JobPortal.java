//OOP2 Project Section#4/Group#4 
//Fatima Al-Ramadhan 2180004473
//Raghad bandar 2190005368
//Razan Alsudairi 2180002990
// Manar
// khawla 
package jobportal;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JobPortal {

    private Connection connectionse;

    public void closeDB() {

        try {
            connectionse.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void openDB() {

        try {
            connectionse = DriverManager.getConnection(DataBase_URL, DataBase_UsreName, DataBase_UPassword);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private static final String DataBase_URL = "jdbc:derby://localhost:1527/JobPortalDB";
    private static final String DataBase_UsreName = "DB";
    private static final String DataBase_UPassword = "1234";

    public static void main(String[] args) {

        //openDB();
        screen mai = new screen();
        mai.setVisible(true);

        //closeDB();
    }
}
