/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lacasadelespresso;

import javax.swing.JOptionPane;


public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form Admin_LogIn
     */
    public LogIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        juser = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        LogIn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jpassword = new javax.swing.JPasswordField();
        jshowpassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 14)); // NOI18N
        jLabel2.setText("RESTRICTED for Admin Only!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 260, 51));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel3.setText("Username:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 90, 40));

        juser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juserActionPerformed(evt);
            }
        });
        jPanel1.add(juser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 180, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 90, -1));

        LogIn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        LogIn.setText("Log In");
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });
        jPanel1.add(LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 90, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 80, 40));
        jPanel1.add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 180, -1));

        jshowpassword.setText("Show Password");
        jshowpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jshowpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jshowpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void juserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Front fr= new Front();
        fr.show();
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
        // TODO add your handling code here:
        if(juser.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out username");    
        }
        else if(jpassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill out password");
        }
        else if(juser.getText().contains("admin")&& jpassword.getText().contains("12345")){
            JOptionPane.showMessageDialog(null, "Login Successful!!");
            Admin ad= new Admin();
            ad.show();
            
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Wrong Username or password!", "Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LogInActionPerformed

    private void jshowpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jshowpasswordActionPerformed
        // TODO add your handling code here:
        if (jshowpassword.isSelected()){
            jpassword.setEchoChar((char)0);
        }
        else {
            jpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jshowpasswordActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogIn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JCheckBox jshowpassword;
    private javax.swing.JTextField juser;
    // End of variables declaration//GEN-END:variables
}
