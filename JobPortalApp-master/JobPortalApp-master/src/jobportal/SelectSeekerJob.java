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
public class SelectSeekerJob extends javax.swing.JFrame {

    /**
     * Creates new form SelectSeekerJob
     */
    public SelectSeekerJob() {
        super("Select Seeker Job");
        initComponents();
        setLocationRelativeTo(null);    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Seeker");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 20, 190, 70);

        jLabel3.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("For Job");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 60, 170, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobportal/adminInterface.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 420, 200);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel4.setForeground(new java.awt.Color(255, 255, 204));
        jPanel4.setLayout(null);

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 204));
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jRadioButton3.setText("Ahmed Majed");
        jPanel4.add(jRadioButton3);
        jRadioButton3.setBounds(10, 10, 137, 31);

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 255, 204));
        jTextField10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(204, 0, 0));
        jTextField10.setText("3001");
        jTextField10.setBorder(null);
        jPanel4.add(jTextField10);
        jTextField10.setBounds(50, 90, 100, 17);

        jTextField11.setBackground(new java.awt.Color(255, 255, 204));
        jTextField11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField11.setText("+966549800908");
        jTextField11.setBorder(null);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField11);
        jTextField11.setBounds(50, 110, 92, 17);

        jTextField12.setBackground(new java.awt.Color(255, 255, 204));
        jTextField12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField12.setText("ahmed@gmail.com");
        jTextField12.setBorder(null);
        jPanel4.add(jTextField12);
        jTextField12.setBounds(50, 130, 109, 17);

        jTextField13.setBackground(new java.awt.Color(255, 255, 204));
        jTextField13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(204, 0, 0));
        jTextField13.setText("Social Media Assisment");
        jTextField13.setBorder(null);
        jPanel4.add(jTextField13);
        jTextField13.setBounds(50, 70, 200, 17);

        jTextField14.setBackground(new java.awt.Color(255, 255, 204));
        jTextField14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField14.setText("3 out of 5");
        jTextField14.setBorder(null);
        jPanel4.add(jTextField14);
        jTextField14.setBounds(50, 150, 56, 17);

        jTextField15.setBackground(new java.awt.Color(255, 255, 204));
        jTextField15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField15.setText("Dammam");
        jTextField15.setBorder(null);
        jPanel4.add(jTextField15);
        jTextField15.setBounds(50, 170, 270, 17);

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 204));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Male");
        jRadioButton1.setEnabled(false);
        jPanel4.add(jRadioButton1);
        jRadioButton1.setBounds(140, 220, 50, 23);

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 204));
        jRadioButton2.setText("Female");
        jRadioButton2.setEnabled(false);
        jPanel4.add(jRadioButton2);
        jRadioButton2.setBounds(50, 220, 60, 23);

        jTextField16.setBackground(new java.awt.Color(255, 255, 204));
        jTextField16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField16.setText("5 years on unversity with finance major");
        jTextField16.setBorder(null);
        jPanel4.add(jTextField16);
        jTextField16.setBounds(50, 190, 270, 17);

        jTextField17.setBackground(new java.awt.Color(255, 255, 204));
        jTextField17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField17.setText("Bachelor of Finance major");
        jTextField17.setBorder(null);
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField17);
        jTextField17.setBounds(50, 250, 180, 17);

        jTextField18.setBackground(new java.awt.Color(255, 255, 204));
        jTextField18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField18.setText("Finance major");
        jTextField18.setBorder(null);
        jPanel4.add(jTextField18);
        jTextField18.setBounds(50, 270, 100, 17);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(40, 220, 310, 300);

        jButton1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        jButton1.setText("Add interviow");
        jPanel1.add(jButton1);
        jButton1.setBounds(290, 540, 110, 31);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

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
            java.util.logging.Logger.getLogger(SelectSeekerJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectSeekerJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectSeekerJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectSeekerJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectSeekerJob().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    // End of variables declaration//GEN-END:variables
}
