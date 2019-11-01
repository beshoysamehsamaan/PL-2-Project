/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author User
 */
public class AdminCourse extends javax.swing.JPanel {

    /**
     * Creates new form AdminCourse
     */
    GridBagLayout layout=new GridBagLayout();
    AddCourse ac;
    ListCourse lc;
    UpdateCourse uc;
    Materials m;
    public AdminCourse() {
        initComponents();
        DynamicPanel.setLayout(layout);
        ac=new AddCourse();
        lc=new ListCourse();
        uc=new UpdateCourse();
        m=new Materials();
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        DynamicPanel.add(ac,c);
        DynamicPanel.add(lc,c);
        DynamicPanel.add(uc,c);
        DynamicPanel.add(m,c);
        ac.setVisible(false);
        lc.setVisible(false);
        uc.setVisible(false);
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

        jPanel2 = new javax.swing.JPanel();
        jButtonAddcourse = new javax.swing.JButton();
        jButtonListcourse = new javax.swing.JButton();
        jButtonUpdatecourse = new javax.swing.JButton();
        jButtonMaterials = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);

        jButtonAddcourse.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jButtonAddcourse.setForeground(new java.awt.Color(106, 135, 157));
        jButtonAddcourse.setText("Add Course");
        jButtonAddcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddcourseActionPerformed(evt);
            }
        });

        jButtonListcourse.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jButtonListcourse.setForeground(new java.awt.Color(106, 135, 157));
        jButtonListcourse.setText("List Courses");
        jButtonListcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListcourseActionPerformed(evt);
            }
        });

        jButtonUpdatecourse.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jButtonUpdatecourse.setForeground(new java.awt.Color(106, 135, 157));
        jButtonUpdatecourse.setText("Update/Delete Course");
        jButtonUpdatecourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdatecourseActionPerformed(evt);
            }
        });

        jButtonMaterials.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        jButtonMaterials.setForeground(new java.awt.Color(106, 135, 157));
        jButtonMaterials.setText("Materials");
        jButtonMaterials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaterialsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButtonAddcourse)
                .addGap(41, 41, 41)
                .addComponent(jButtonListcourse)
                .addGap(38, 38, 38)
                .addComponent(jButtonUpdatecourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonMaterials)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddcourse)
                    .addComponent(jButtonListcourse)
                    .addComponent(jButtonUpdatecourse)
                    .addComponent(jButtonMaterials))
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        DynamicPanel.setOpaque(false);

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        add(DynamicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 600, -1));

        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddcourseActionPerformed
        // TODO add your handling code here:
        ac.setVisible(true);
        lc.setVisible(false);
        uc.setVisible(false);
        m.setVisible(false);
    }//GEN-LAST:event_jButtonAddcourseActionPerformed

    private void jButtonListcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListcourseActionPerformed
        // TODO add your handling code here:
        ac.setVisible(false);
        lc.setVisible(true);
        uc.setVisible(false);
        m.setVisible(false);

    }//GEN-LAST:event_jButtonListcourseActionPerformed

    private void jButtonUpdatecourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdatecourseActionPerformed
        // TODO add your handling code here:
        ac.setVisible(false);
        lc.setVisible(false);
        uc.setVisible(true);
        m.setVisible(false);

    }//GEN-LAST:event_jButtonUpdatecourseActionPerformed

    private void jButtonMaterialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaterialsActionPerformed
        // TODO add your handling code here:
        ac.setVisible(false);
        lc.setVisible(false);
        uc.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_jButtonMaterialsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JButton jButtonAddcourse;
    private javax.swing.JButton jButtonListcourse;
    private javax.swing.JButton jButtonMaterials;
    private javax.swing.JButton jButtonUpdatecourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
