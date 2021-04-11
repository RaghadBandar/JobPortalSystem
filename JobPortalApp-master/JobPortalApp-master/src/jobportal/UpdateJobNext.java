
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
public class UpdateJobNext extends javax.swing.JFrame {

      
    int IDJob;
    
    public UpdateJobNext() {
        initComponents();
    }
    
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Update \nJob");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 50, 160, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/adminInterface.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 430, 200);

        jLabel13.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        jLabel13.setText("Name of Job");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(70, 210, 100, 30);

        jLabel10.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        jLabel10.setText("Major");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 280, 100, 30);

        jLabel12.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        jLabel12.setText("State ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(70, 340, 150, 30);

        jLabel14.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 24)); // NOI18N
        jLabel14.setText("Describtion");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(70, 400, 100, 30);

        jComboBox3.setMaximumRowCount(2);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        jComboBox3.setToolTipText("");
        jComboBox3.setAutoscrolls(true);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(240, 340, 110, 30);

        jComboBox4.setMaximumRowCount(3);
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Finance Department", "marketing Department", "Accounting Department", "Development Department" }));
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(180, 280, 170, 30);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(153, 153, 153));
        jTextField6.setText("Enter Name of Job");
        jPanel1.add(jTextField6);
        jTextField6.setBounds(180, 210, 170, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/back.png"))); // NOI18N
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
        jScrollPane1.setBounds(180, 410, 210, 60);

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
    int ID; 
    String sql=" Update FROM Job WHERE JobID=?" ;
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
                int option= JOptionPane.showConfirmDialog(null,"Are you sure you want to Update This permenantly? ","Update Job",JOptionPane.YES_NO_OPTION);
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

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
