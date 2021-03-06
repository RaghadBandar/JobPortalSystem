/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobportal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ِAsus
 */
public class AddJob extends javax.swing.JFrame {

    /**
     * Creates new form AddJob
     */
    public AddJob() {
        
        super("ADD NEW JOB");
        initComponents();
        setLocationRelativeTo(null);
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        stateLabel = new javax.swing.JLabel();
        stateText = new javax.swing.JTextField();
        jobtext = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        desTextArea = new javax.swing.JTextArea();
        jobID1 = new javax.swing.JTextField();
        majorText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        addButton.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/addicon.jpg"))); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addButton);
        addButton.setBounds(330, 490, 70, 70);

        stateLabel.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        stateLabel.setText("State");
        jPanel2.add(stateLabel);
        stateLabel.setBounds(70, 360, 80, 29);

        stateText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        stateText.setForeground(new java.awt.Color(153, 153, 153));
        stateText.setToolTipText("T (True) OR F (False)");
        jPanel2.add(stateText);
        stateText.setBounds(180, 360, 170, 30);

        jobtext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jobtext.setForeground(new java.awt.Color(153, 153, 153));
        jobtext.setToolTipText("Enter Name of Job!");
        jPanel2.add(jobtext);
        jobtext.setBounds(180, 210, 170, 30);

        jLabel13.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        jLabel13.setText("Name of Job");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(70, 210, 100, 29);

        jLabel11.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        jLabel11.setText("Job ID");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(70, 260, 100, 29);

        jLabel14.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        jLabel14.setText("Describtion");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(70, 400, 100, 29);

        jLabel15.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ADD NEW");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(40, 40, 120, 40);

        jLabel10.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        jLabel10.setText("Major");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(70, 310, 100, 29);

        jLabel16.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("JOB!");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(40, 90, 120, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/adminInterface.png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 0, 430, 200);

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/back.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backButton);
        backButton.setBounds(20, 510, 50, 30);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setToolTipText("");

        desTextArea.setColumns(20);
        desTextArea.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        desTextArea.setForeground(new java.awt.Color(153, 153, 153));
        desTextArea.setRows(5);
        desTextArea.setToolTipText("Enter Description of JOB!");
        jScrollPane1.setViewportView(desTextArea);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(180, 410, 190, 70);

        jobID1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jobID1.setForeground(new java.awt.Color(153, 153, 153));
        jobID1.setToolTipText("Enter Job ID!");
        jPanel2.add(jobID1);
        jobID1.setBounds(180, 260, 170, 30);

        majorText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        majorText.setForeground(new java.awt.Color(153, 153, 153));
        majorText.setToolTipText("Enter Major!");
        jPanel2.add(majorText);
        majorText.setBounds(180, 310, 170, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        
            
            String jobName = jobtext.getText();
            String jobid =jobID1.getText();
            String major = majorText.getText();
            String state = stateText.getText();
            String des = desTextArea.getText();
            
            
            
            if (verifData()){
            int ID = Integer.parseInt(jobid);
            
            String insert = "INSERT INTO JOB (JobID, JobName, State, Descripiton, Major) VALUES ("+jobid+",'"+jobName+"','"+state+"','"+des+"','"+major+"')";
            
            try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/JobPortalDB", "DB", "1234");
                    java.sql.Statement stt = con.createStatement(); )
                    {
                      
                        int INSERT_State = stt.executeUpdate(insert);
                        
                        if (INSERT_State>0)
                           JOptionPane.showMessageDialog(AddJob.this, "The Job have been added successfully!");   
                    
                    }
            catch (SQLException ex){
                JOptionPane.showMessageDialog(AddJob.this, ex.getMessage(), "Error in INSERT", JOptionPane.ERROR_MESSAGE);
            }  catch (Exception ex) {
                
          JOptionPane.showMessageDialog(AddJob.this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            
           
            }
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdminServices().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    public boolean verifData (){
         
         
         if (jobtext.getText().equals("") || jobID1.getText().equals("") 
               || majorText.getText().equals("") || stateText.getText().equals("") || desTextArea.getText().equals(""))
         {
             JOptionPane.showMessageDialog(AddJob.this, "One or more filed is empty.. Try again!","Empty fileds",JOptionPane.PLAIN_MESSAGE);
             return false;
         }
         else if (jobtext.getText().equals("Enter Name of Job!") || jobID1.getText().equals("Enter Job ID!") 
               || majorText.getText().equals("Enter Major!") || stateText.getText().equals("T (True) OR F (False)") 
                 || desTextArea.getText().equals("Enter Description of JOB!"))
         {
              JOptionPane.showMessageDialog(AddJob.this, "One or more filed is empty.. Try again!","Empty fileds",JOptionPane.PLAIN_MESSAGE);
             return false;
         }   
         else if (!(stateText.getText().equals("T") || stateText.getText().equals("F"))){
             JOptionPane.showMessageDialog(AddJob.this, "You should enter T or F.. Try again!","Error in STATE",JOptionPane.PLAIN_MESSAGE);
             return false;
         }
         else if (isJobIDexist(Integer.parseInt(jobID1.getText())) ) {
             JOptionPane.showMessageDialog(AddJob.this, "Job ID is already exist.. Try again!","Error in JOB ID",JOptionPane.PLAIN_MESSAGE);
             return false;
             
         }
        
         else  return true;
     }
      
    public boolean isJobIDexist(int id) {
        
        boolean uExist = false;
        
        
       try( Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/JobPortalDB", "DB", "1234");
              PreparedStatement ps= con.prepareStatement("SELECT * FROM job WHERE jobID = ? ") ){
           
            ps.setInt(1, id);
           
           ResultSet rs = ps.executeQuery();
           
           while (rs.next()){
               uExist = true;
           }
       }
        catch (SQLException ex){
                JOptionPane.showMessageDialog(AddJob.this, ex.getMessage(), "Error in JOB ID", JOptionPane.ERROR_MESSAGE);
            
        }
       return uExist;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddJob().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextArea desTextArea;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jobID1;
    private javax.swing.JTextField jobtext;
    private javax.swing.JTextField majorText;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField stateText;
    // End of variables declaration//GEN-END:variables
}
