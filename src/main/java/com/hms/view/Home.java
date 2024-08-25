/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hms.view;

import javax.swing.JOptionPane;

/**
 *
 * @author MD. Samir Al Fayed Ifti
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public Home() {
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

        jLabel1 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuHome = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menuptestsearch = new javax.swing.JMenuItem();
        menuptestSetup = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menurtestsearch = new javax.swing.JMenuItem();
        menurtestSetup = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Welcome To Our Hospital Management Software: Shifa(Aroggo)!");

        btnlogout.setText("Log Out");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        menuHome.setText("Home");
        jMenuBar1.add(menuHome);

        jMenu2.setText("Pathelogical Test");

        menuptestsearch.setText("Search");
        menuptestsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuptestsearchActionPerformed(evt);
            }
        });
        jMenu2.add(menuptestsearch);

        menuptestSetup.setText("Setup (input)");
        menuptestSetup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuptestSetupActionPerformed(evt);
            }
        });
        jMenu2.add(menuptestSetup);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Radiological Test");

        menurtestsearch.setText("Search");
        menurtestsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menurtestsearchActionPerformed(evt);
            }
        });
        jMenu3.add(menurtestsearch);

        menurtestSetup.setText("Setup (input)");
        menurtestSetup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menurtestSetupActionPerformed(evt);
            }
        });
        jMenu3.add(menurtestSetup);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Medical Test");

        jMenu1.setText("Pathological Test");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        jMenu4.add(jMenu1);

        jMenu5.setText("jMenu5");

        jMenuItem3.setText("jMenuItem3");
        jMenu5.add(jMenuItem3);

        jMenu4.add(jMenu5);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addComponent(btnlogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                .addComponent(btnlogout))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
            int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", 
            "Logout Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    
    if (response == JOptionPane.YES_OPTION) {
        // Close the current window (Home JFrame)
        this.dispose();
        
        // Redirect to the login screen
        Login loginScreen = new Login();  // Assuming you have a Login JFrame class
        loginScreen.setVisible(true);
    }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void menurtestSetupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menurtestSetupActionPerformed
        // TODO add your handling code here:
        new RadiologicalTestSetup().setVisible(true);
    }//GEN-LAST:event_menurtestSetupActionPerformed

    private void menurtestsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menurtestsearchActionPerformed
        // TODO add your handling code here:
        new RadiologicalTestSearch().setVisible(true);
    }//GEN-LAST:event_menurtestsearchActionPerformed

    private void menuptestSetupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuptestSetupActionPerformed
        // TODO add your handling code here:
        new PathologicalTestSetup().setVisible(true);
    }//GEN-LAST:event_menuptestSetupActionPerformed

    private void menuptestsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuptestsearchActionPerformed
        // TODO add your handling code here:
        new PathologicalTestSearch().setVisible(true);
    }//GEN-LAST:event_menuptestsearchActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new home().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenuItem menuptestSetup;
    private javax.swing.JMenuItem menuptestsearch;
    private javax.swing.JMenuItem menurtestSetup;
    private javax.swing.JMenuItem menurtestsearch;
    // End of variables declaration//GEN-END:variables

    private static class Login {

        public Login() {
        }

        private void setVisible(boolean b) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
