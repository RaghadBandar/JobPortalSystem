
package jobportal;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ِAsus
 */
public class UpdateJobNext extends javax.swing.JFrame {

      
    int IDJob;
    private Component jTextField;
    
    public UpdateJobNext() {
       
        super("UPDATE JOB");
        initComponents();
        setLocationRelativeTo(null);    }
    
    public UpdateJobNext(int IDJob ) {
        this();
        this.IDJob = IDJob;
    }

////    /**
////     * This method is called from within the constructor to initialize the form.
////     * WARNING: Do NOT modify this code. The content of this method is always
////     * regenerated by the Form Editor.
////     */
////    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Update \nJob");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 80, 310, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/adminInterface.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 430, 200);

        jLabel13.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        jLabel13.setText("Name of Job");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(60, 210, 200, 29);

        jLabel10.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        jLabel10.setText("Major");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 260, 100, 29);

        jLabel12.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        jLabel12.setText("State ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(60, 310, 150, 29);

        jLabel14.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        jLabel14.setText("Describtion");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(60, 370, 140, 29);

        jComboBox4.setMaximumRowCount(3);
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Finance Department", "marketing Department", "Accounting Department", "Development Department" }));
        jComboBox4.setToolTipText("Chose One");
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(210, 260, 170, 30);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(153, 153, 153));
        jTextField6.setToolTipText("Enter Name of Job");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(210, 210, 170, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 490, 50, 30);

        jButton2.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/Updicon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(310, 490, 90, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(153, 153, 153));
        jTextArea1.setRows(5);
        jTextArea1.setText("Enter Description of JOB!");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(200, 360, 210, 60);

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("True");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(210, 310, 70, 29);

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("False");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(290, 310, 67, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
        if (jTextField6.getText().equals("") || jTextArea1.getText().equals("") ||   jComboBox4.getSelectedItem().equals("") ) 
         {
             JOptionPane.showMessageDialog(null, "There are an EMPTY field","",JOptionPane.PLAIN_MESSAGE);
         }  else{
            try(Connection connection=DriverManager.getConnection("jdbc:derby://localhost:1527/JobPortalDB", "DB", "1234");
            PreparedStatement updateSt= connection.prepareStatement("Update Job set JobName=?, State=?,Descripiton=?,Major=? WHERE JobId=? ");
        ){
        
        
        updateSt.setString(1,jTextField6.getText()); //Job Name
        
        if(jRadioButton1.isSelected()){
          updateSt.setString(2,"T"); //State  
        }else {
            updateSt.setString(2,"F"); //State 
        }
        
        updateSt.setString(3,jTextArea1.getText()); ///Descrbtion
        
        if(jComboBox4.getSelectedItem() == jComboBox4.getItemAt(0)){
            updateSt.setString(4,"Finance Department");
        }else if(jComboBox4.getSelectedItem() == jComboBox4.getItemAt(1)){
            updateSt.setString(4,"marketing Department");
        }else if(jComboBox4.getSelectedItem() == jComboBox4.getItemAt(2)){
            updateSt.setString(4,"Accounting Department");
        }else if(jComboBox4.getSelectedItem() == jComboBox4.getItemAt(3)){
            updateSt.setString(4,"Development Department");
        }
        updateSt.setInt(5,IDJob);//JobID
        
        int updateRow2 = updateSt.executeUpdate();
                if (updateRow2 > 0) {
                    JOptionPane.showMessageDialog(null, "successfull Updataing job", "successfull", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Unsuccessfull Updataing for job", "Unsuccessfull", JOptionPane.INFORMATION_MESSAGE);
                }

        
    } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                ex.getMessage(), "an error has accured ",
                JOptionPane.ERROR_MESSAGE);
        }
        }
    
    
         
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         this.setVisible(false);
        new AdminServices().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateJobNext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateJobNext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateJobNext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateJobNext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateJobNext().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
