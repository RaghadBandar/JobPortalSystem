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
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ِAsus
 */
public class UpdateJob extends javax.swing.JFrame {

    
     
    public UpdateJob() {
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

        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/deleteicon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Update \nJob");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 50, 160, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/adminInterface.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 425, 200);

        jLabel3.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Enter the ID of the Job you want to Update");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 200, 330, 50);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Enter ID");
        jPanel2.add(jTextField1);
        jTextField1.setBounds(120, 260, 180, 30);
        jPanel2.add(jButton1);
        jButton1.setBounds(40, 310, 50, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(280, 320, 50, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int ID;

        String sql=" DELETE FROM Job WHERE JobID=?" ;
        try(Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/JobPortalDB", "DB", "1234");
            PreparedStatement prepstatement= connection.prepareStatement("SELECT JobID FROM Job WHERE JobID=?")){
            ID = Integer.parseInt(jTextField1.getText());
            prepstatement.setInt(1, ID);
            ResultSet rs=prepstatement.executeQuery();
            boolean exists = false;
            while(rs.next()){
                exists=true;
            }
            if(exists){
                int option= JOptionPane.showConfirmDialog(null,"Are you sure you want to delete This permenantly? ","Delete Job",JOptionPane.YES_NO_OPTION);
                if(option==JOptionPane.YES_OPTION){
                    PreparedStatement sts= connection.prepareStatement(sql);
                    sts.setInt(1,ID);
                    sts.executeUpdate();
                    JOptionPane.showMessageDialog(this.jTextField1,"your Operation was successfuly Done","info",JOptionPane.PLAIN_MESSAGE);
                }
                if(option==JOptionPane.NO_OPTION){
                    return;
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"This information does not exixt ","Error could not be found",JOptionPane.PLAIN_MESSAGE);
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                ex.getMessage(), "Database error",
                JOptionPane.ERROR_MESSAGE);
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,
                ex.getMessage(), " error has accord! Try Again",
                JOptionPane.ERROR_MESSAGE);
        }

        catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                ex.getMessage(), "an error has accured ",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    /* private void jButton2ActionPerformed(java.awt.event.ActionEvent evt){                                         
       int ID; 
        
        String sql=" UPDATE FROM Job WHERE JobID=?" ;
        try(Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/JobPortalDB", "DB", "1234");  
        PreparedStatement prepstatement= connection.prepareStatement("SELECT JobID FROM Job WHERE JobID=?")){
        ID = Integer.parseInt(jTextField1.getText());
        prepstatement.setInt(1, ID);
        ResultSet rs=prepstatement.executeQuery();
        boolean exists = false; 
        while(rs.next()){
           exists=true;
       }
        
        if(exists){
        int option= JOptionPane.showConfirmDialog(null,"Are you sure you want to update This permenantly? ","Update Job",JOptionPane.YES_NO_OPTION);
        if(option==JOptionPane.YES_OPTION){
        PreparedStatement sts= connection.prepareStatement(sql);
        sts.setInt(1,ID); 
        sts.executeUpdate();
        JOptionPane.showMessageDialog(this.jTextField1,"your Operation was successfuly Done","info",JOptionPane.PLAIN_MESSAGE);
      }
        if(option==JOptionPane.NO_OPTION){
        return;
      }
       }
        else{
        JOptionPane.showMessageDialog(null,"This information does not exixt ","Error could not be found",JOptionPane.PLAIN_MESSAGE);
       } 
      }
       catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, 
           ex.getMessage(), "Database error", 
           JOptionPane.ERROR_MESSAGE);
        }
       catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(null, 
          ex.getMessage(), " error has accord! Try Again", 
          JOptionPane.ERROR_MESSAGE);
        }

         catch (Exception ex) {
          JOptionPane.showMessageDialog(null, 
         ex.getMessage(), "an error has accured ", 
          JOptionPane.ERROR_MESSAGE);
        }*/
    
    
     private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.setVisible(false);
        new AdminServices().setVisible(true);
    }                                        
    /**
     * 
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
            java.util.logging.Logger.getLogger(UpdateJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateJob().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
