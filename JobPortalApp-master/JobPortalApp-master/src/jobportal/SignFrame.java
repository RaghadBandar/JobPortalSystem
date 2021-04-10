package jobportal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class SignFrame extends javax.swing.JFrame {

    static int SekkerID;

    /**
     * Creates new form SignFrame
     */
    public SignFrame() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        AdminRadio = new javax.swing.JRadioButton();
        SeekerRadio = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SeekerIDjText = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel4.setText("User Role:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 250, 130, 40);

        AdminRadio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(AdminRadio);
        AdminRadio.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        AdminRadio.setText("Admin");
        jPanel1.add(AdminRadio);
        AdminRadio.setBounds(150, 260, 80, 20);

        SeekerRadio.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(SeekerRadio);
        SeekerRadio.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        SeekerRadio.setText("Seeker");
        SeekerRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeekerRadioActionPerformed(evt);
            }
        });
        jPanel1.add(SeekerRadio);
        SeekerRadio.setBounds(240, 260, 90, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/Male.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 310, 50, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/pass.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 380, 50, 50);

        SeekerIDjText.setForeground(new java.awt.Color(153, 153, 153));
        SeekerIDjText.setText("Enter ID");
        SeekerIDjText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeekerIDjTextActionPerformed(evt);
            }
        });
        jPanel1.add(SeekerIDjText);
        SeekerIDjText.setBounds(130, 320, 160, 30);

        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("Password");
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(130, 390, 160, 30);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/login-button-png-18019.jpg"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(140, 450, 140, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 480, 50, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/interLG.png"))); // NOI18N
        jLabel1.setText("Admin");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (SeekerRadio.isSelected()) {
            String sql = "SELECT SeekerID FROM Job_Seeker where SeekerID=" + SeekerIDjText.getText();
            try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/JobPortalDB", "DB", "1234");
                    java.sql.Statement stt = con.createStatement();
                    ResultSet rs = stt.executeQuery(sql);) {

                if (rs.next()) {
                    SekeerServices x = new SekeerServices();
                    x.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "your ID and/or Password incorrect!! ", "Error", JOptionPane.ERROR_MESSAGE);
                    Resat();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
                Resat();
            }
        } else if (AdminRadio.isSelected()) {
            String sql = "SELECT AdminID FROM Admin where AdminID=" + SeekerIDjText.getText();
            try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/JobPortalDB", "DB", "1234");
                    java.sql.Statement stt = con.createStatement();
                    ResultSet rs = stt.executeQuery(sql);) {

                if (rs.next()) {
                    AdminServices y = new AdminServices();
                    y.setVisible(true);
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "your ID and/or Password incorrect!! ", "Error", JOptionPane.ERROR_MESSAGE);
                    Resat();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
                Resat();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please, Select a user Role.", "Error", JOptionPane.ERROR_MESSAGE);
            Resat();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void Resat() {
        SeekerIDjText.setText("");
        jPasswordField1.setText("");
        SeekerRadio.setSelected(false);
        AdminRadio.setSelected(false);
    }


    private void SeekerRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeekerRadioActionPerformed

    }//GEN-LAST:event_SeekerRadioActionPerformed

    private void SeekerIDjTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeekerIDjTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeekerIDjTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        screen x = new screen();
        x.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SignFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdminRadio;
    public static javax.swing.JTextField SeekerIDjText;
    private javax.swing.JRadioButton SeekerRadio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
