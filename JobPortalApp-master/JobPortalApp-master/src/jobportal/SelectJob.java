/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobportal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static jobportal.SignFrame.SeekerIDjText;

/**
 *
 * @author ِAsus
 */
public class SelectJob extends javax.swing.JFrame {

    int JobID;
    
    public SelectJob(int ID) {
        this();
        this.JobID = ID;
        jTextField10.setText(""+this.JobID);
    String sql = "SELECT JobName,Major,Descripiton FROM JOB where JobID="+ID;          
    
    try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/JobPortalDB",  "DB",  "1234");
    java.sql.Statement stt = con.createStatement();
    ResultSet rs = stt.executeQuery(sql)) {
    
    if(rs.next()){
        
           jTextField1.setText(rs.getString("JobName"));
        
           jTextField12.setText(rs.getString("Major"));
        
           jTextField13.setText(rs.getString("Descripiton"));
        }
        
    }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public SelectJob() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField11 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTextField11.setBackground(new java.awt.Color(255, 255, 204));
        jTextField11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField11.setText("Number of employee 2");
        jTextField11.setBorder(null);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/selectJobInter.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 420, 100);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel4.setForeground(new java.awt.Color(255, 255, 204));
        jPanel4.setLayout(null);

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 255, 204));
        jTextField10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField10.setText("2001");
        jTextField10.setBorder(null);
        jPanel4.add(jTextField10);
        jTextField10.setBounds(10, 50, 28, 20);

        jTextField12.setBackground(new java.awt.Color(255, 255, 204));
        jTextField12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField12.setText("Marketing Department");
        jTextField12.setBorder(null);
        jPanel4.add(jTextField12);
        jTextField12.setBounds(10, 80, 320, 20);

        jTextField13.setBackground(new java.awt.Color(255, 255, 204));
        jTextField13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField13.setText("Offers part time work with a salary of 5000 SR");
        jTextField13.setBorder(null);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField13);
        jTextField13.setBounds(10, 110, 330, 20);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 204));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.setText("Social Media Assistant");
        jTextField1.setBorder(null);
        jPanel4.add(jTextField1);
        jTextField1.setBounds(10, 20, 330, 20);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(30, 110, 350, 160);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/back.png"))); // NOI18N
        jButton1.setToolTipText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 290, 40, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/checkIcon.png"))); // NOI18N
        jButton2.setToolTipText("Apply for Job");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(360, 280, 50, 50);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/cancleIcon.png"))); // NOI18N
        jButton3.setToolTipText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(310, 280, 50, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JobTable x = new JobTable();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int SeekerID = Integer.parseInt(SeekerIDjText.getText());        
        String sql_appliy = "SELECT * FROM APPLIED_TO_BY where JobID=" + JobID + " and SeekerID=" + SeekerID;//If the seeker appliy for this job befor
        String sql_State = "SELECT State FROM JOB where JobID=" + JobID;//If this Job have a Seeker 

        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/JobPortalDB", "DB", "1234");
                java.sql.Statement st_State = con.createStatement();
                ResultSet rs_State = st_State.executeQuery(sql_State);
                java.sql.PreparedStatement pst2 = con.prepareStatement("Insert into APPLIED_TO_BY values( ?,?)");
                
                java.sql.Statement St_apply = con.createStatement();
                ResultSet rs_apply = St_apply.executeQuery(sql_appliy)) {

            
            rs_State.next();
              String JobState = rs_State.getString("State");  

            boolean empty = true;
            while(rs_apply.next()){
                empty = false;
            }
            
            if (empty) {
//                if (JobState == "T") {
                    
                    pst2.setInt(1, JobID);
                    pst2.setInt(2, SeekerID);

                    int updateRow2 = pst2.executeUpdate();
                    if (updateRow2 > 0) {
                        JOptionPane.showMessageDialog(null, "successfull applying for job", "successfull", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Unsuccessfull applying for job", "Unsuccessfull", JOptionPane.INFORMATION_MESSAGE);
                    }
//                } else {
//                    JOptionPane.showMessageDialog(null, "You can't apply for a Job " + JobID + " becouse the job state is approved for another seeker.", "Unsuccessfull", JOptionPane.INFORMATION_MESSAGE);
//                }
            } else {
                JOptionPane.showMessageDialog(null, "You can't apply for a Job " + JobID + " becouse you have applied for it before.", "Unsuccessfull", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    JobTable x = new JobTable();
    x.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SekeerServices x = new SekeerServices();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

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
            java.util.logging.Logger.getLogger(SelectJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectJob().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    // End of variables declaration//GEN-END:variables
}
