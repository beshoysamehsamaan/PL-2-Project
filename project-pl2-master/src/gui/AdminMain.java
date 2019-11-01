/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import Panels.*;
import Panels.AdminCourse;
import Panels.AdminMail;
import Panels.AdminStudent;
import Panels.AdminTutor;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class AdminMain extends javax.swing.JFrame {

    /**
     * Creates new form AdminMain
     */
    public String ss;
    public String tt;
    Login xx=new Login();
    GridBagLayout layout = new GridBagLayout();
    AdminStudent s ;
    AdminCourse x;
    AdminTutor t;
    AdminMail m;
    public AdminMain() {
        initComponents();
        s = new AdminStudent();
        x=new AdminCourse();
        t=new AdminTutor();
        m=new AdminMail();
        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(s, c);
        DynamicPanel.add(x, c);
        DynamicPanel.add(t, c);
        DynamicPanel.add(m, c);
        s.setVisible(false);
        x.setVisible(false);
        t.setVisible(false);
        m.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonTutor = new javax.swing.JButton();
        jButtonStudent = new javax.swing.JButton();
        jButtonCourse = new javax.swing.JButton();
        jButtonCourse1 = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        Refresh = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jButtonTutor.setBackground(new java.awt.Color(204, 204, 204));
        jButtonTutor.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jButtonTutor.setForeground(new java.awt.Color(106, 135, 157));
        jButtonTutor.setText("Tutor");
        jButtonTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTutorActionPerformed(evt);
            }
        });

        jButtonStudent.setBackground(new java.awt.Color(204, 204, 204));
        jButtonStudent.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jButtonStudent.setForeground(new java.awt.Color(106, 135, 157));
        jButtonStudent.setText("Student");
        jButtonStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStudentActionPerformed(evt);
            }
        });

        jButtonCourse.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCourse.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jButtonCourse.setForeground(new java.awt.Color(106, 135, 157));
        jButtonCourse.setText("Course");
        jButtonCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCourseActionPerformed(evt);
            }
        });

        jButtonCourse1.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCourse1.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jButtonCourse1.setForeground(new java.awt.Color(106, 135, 157));
        jButtonCourse1.setText("E-Mail");
        jButtonCourse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCourse1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButtonTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButtonStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jButtonCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButtonCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTutor)
                    .addComponent(jButtonStudent)
                    .addComponent(jButtonCourse)
                    .addComponent(jButtonCourse1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        DynamicPanel.setOpaque(false);
        DynamicPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(DynamicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 600, 540));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        jMenu1.setBackground(new java.awt.Color(204, 204, 204));
        jMenu1.setText("File");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Logout");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
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

    private void jButtonStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStudentActionPerformed
        // TODO add your handling code here:
        s.setVisible(true);
        x.setVisible(false);
        t.setVisible(false);
        m.setVisible(false);
    }//GEN-LAST:event_jButtonStudentActionPerformed

    private void jButtonCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCourseActionPerformed
        // TODO add your handling code here:
        s.setVisible(false);
        x.setVisible(true);
        t.setVisible(false);
        m.setVisible(false);
    }//GEN-LAST:event_jButtonCourseActionPerformed

    private void jButtonTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTutorActionPerformed
        // TODO add your handling code here:
        s.setVisible(false);
        x.setVisible(false);
        t.setVisible(true);
        m.setVisible(false);
    }//GEN-LAST:event_jButtonTutorActionPerformed

    private void jButtonCourse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCourse1ActionPerformed
        // TODO add your handling code here:
        s.setVisible(false);
        x.setVisible(false);
        t.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_jButtonCourse1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
int c = JOptionPane.showConfirmDialog(null, "Are you Sure, System will Exit");
        if (c == JOptionPane.OK_OPTION) {
            System.exit(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JMenuItem Refresh;
    private javax.swing.JButton jButtonCourse;
    private javax.swing.JButton jButtonCourse1;
    private javax.swing.JButton jButtonStudent;
    private javax.swing.JButton jButtonTutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}