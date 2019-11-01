/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Panels.TutorAttendance;
import Panels.TutorGrades;
import Panels.ViewFeedbacks;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class TutorMain extends javax.swing.JFrame {

    /**
     * Creates new form TutorMain
     */
    public String ss;
    public String tt;
    Login xx=new Login();
    GridBagLayout layout=new GridBagLayout();
    TutorGrades ag;
    TutorAttendance aa;
    ViewFeedbacks vf;
    public TutorMain() {
        initComponents();
        DynamicPanel.setLayout(layout);
        ag=new TutorGrades();
        aa=new TutorAttendance();
        vf=new ViewFeedbacks();
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(ag,c);
        DynamicPanel.add(aa,c);
        DynamicPanel.add(vf,c);
        ag.setVisible(false);
        aa.setVisible(false);
        vf.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonAssigngrade = new javax.swing.JButton();
        Buttonfeedback = new javax.swing.JButton();
        ButtonAssignattendance = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        DynamicPanel = new javax.swing.JPanel();
        Background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        Refresh = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonAssigngrade.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        ButtonAssigngrade.setForeground(new java.awt.Color(106, 135, 157));
        ButtonAssigngrade.setText("Assign Grades");
        ButtonAssigngrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAssigngradeActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAssigngrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, -1));

        Buttonfeedback.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        Buttonfeedback.setForeground(new java.awt.Color(106, 135, 157));
        Buttonfeedback.setText("View Feedbacks");
        Buttonfeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonfeedbackActionPerformed(evt);
            }
        });
        getContentPane().add(Buttonfeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 121, -1));

        ButtonAssignattendance.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        ButtonAssignattendance.setForeground(new java.awt.Color(106, 135, 157));
        ButtonAssignattendance.setText("Assign Attendance");
        ButtonAssignattendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAssignattendanceActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAssignattendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 600, 70));

        DynamicPanel.setOpaque(false);
        getContentPane().add(DynamicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 600, 530));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        jMenu1.setBackground(new java.awt.Color(204, 204, 204));
        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Logout");
        jMenu1.add(jMenuItem5);

        Refresh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jMenu1.add(Refresh);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(204, 204, 204));
        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAssigngradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAssigngradeActionPerformed
        // TODO add your handling code here:
        ag.setVisible(true);
        aa.setVisible(false);
        vf.setVisible(false);
    }//GEN-LAST:event_ButtonAssigngradeActionPerformed

    private void ButtonfeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonfeedbackActionPerformed
        // TODO add your handling code here:
        ag.setVisible(false);
        aa.setVisible(false);
        vf.setVisible(true);
    }//GEN-LAST:event_ButtonfeedbackActionPerformed

    private void ButtonAssignattendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAssignattendanceActionPerformed
        // TODO add your handling code here:
        ag.setVisible(false);
        aa.setVisible(true);
        vf.setVisible(false);
    }//GEN-LAST:event_ButtonAssignattendanceActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
int c = JOptionPane.showConfirmDialog(null, "Are you Sure, System will Exit");
        if (c == JOptionPane.OK_OPTION) {
            System.exit(0);
        }       // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        xx.Loogin(ss, tt);
        this.setVisible(false);
    }//GEN-LAST:event_RefreshActionPerformed

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
            java.util.logging.Logger.getLogger(TutorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TutorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TutorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutorMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton ButtonAssignattendance;
    private javax.swing.JButton ButtonAssigngrade;
    private javax.swing.JButton Buttonfeedback;
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JMenuItem Refresh;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
