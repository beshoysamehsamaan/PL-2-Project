/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;
import training.center.Invoice;
import training.center.Student;
import training.center.Attendence;
import training.center.Grade;
import training.center.Metrail;
import training.center.MyException;
        /**
 *
 * @author Abanoub
 */
public class Activatecourses extends javax.swing.JPanel {

    /**
     * Creates new form Activatecourses
     */
    public Activatecourses() {
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

        jLabel2 = new javax.swing.JLabel();
        SID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CName = new javax.swing.JTextField();
        Message = new javax.swing.JLabel();
        Activatebtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CPrice = new javax.swing.JTextField();
        MessageInvoice = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(106, 135, 157));
        jLabel2.setText("Student ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        SID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDActionPerformed(evt);
            }
        });
        add(SID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 140, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(106, 135, 157));
        jLabel3.setText("Registed Curse");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        CName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNameActionPerformed(evt);
            }
        });
        add(CName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 140, -1));
        add(Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 220, 90));

        Activatebtn.setFont(new java.awt.Font("Britannic Bold", 0, 11)); // NOI18N
        Activatebtn.setForeground(new java.awt.Color(106, 135, 157));
        Activatebtn.setText("Activate");
        Activatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActivatebtnActionPerformed(evt);
            }
        });
        add(Activatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(106, 135, 157));
        jLabel4.setText("Course ID");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        CID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CIDActionPerformed(evt);
            }
        });
        add(CID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 140, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(106, 135, 157));
        jLabel5.setText("Price");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        CPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPriceActionPerformed(evt);
            }
        });
        add(CPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 140, -1));

        MessageInvoice.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        MessageInvoice.setForeground(new java.awt.Color(255, 0, 0));
        add(MessageInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 74, 180, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Beshoy sameh\\Desktop\\Project al 5ames\\GUI PHOTOS\\Admin\\add-delete course.jpg")); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void SIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDActionPerformed

    private void CNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNameActionPerformed
MyException e=new MyException();
    private void ActivatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActivatebtnActionPerformed
        // TODO add your handling code here:
        SID.setText(e.CheckPositive(SID.getText()));
        CID.setText(e.CheckPositive(CID.getText()));
        CPrice.setText(e.CheckPositive(CPrice.getText()));
        //CName.setText(e.CheckPositive(CName.getText()));
        if(!SID.getText().equals("") && !CName.getText().equals("") && !CID.equals("")&&!CPrice.equals("")){
            Student x = new Student();
            Student y = new Student();
            y = x.Search(Integer.parseInt(SID.getText()));
            y.Active(CName.getText());
            Metrail m =new Metrail();
            m.MetrailMinus(CName.getText());
            Attendence a=new Attendence();
            a.setCname(CName.getText());
            a.setSname(y.getFNname()+y.getLName());
            a.setCid(Integer.parseInt(CID.getText()));
            a.setSid(Integer.parseInt(SID.getText()));
            Grade z =new Grade();
            z.setCname(CName.getText());
            z.setSname(y.getFNname()+y.getLName());
            z.setCid(Integer.parseInt(CID.getText()));
            z.setSid(Integer.parseInt(SID.getText()));
            
            Invoice I = new Invoice(Integer.parseInt(SID.getText()) ,Integer.parseInt(CID.getText()) ,y.getFNname()+y.getLName() ,CID.getText() , Float.parseFloat(CPrice.getText()) );   
            
            Message.setText("Done");
            resetPanelData();
            
        }
        
    }//GEN-LAST:event_ActivatebtnActionPerformed

    private void CIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CIDActionPerformed

    private void CPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPriceActionPerformed
 protected void resetPanelData() {
        SID.setText("");
        CName.setText("");
        CPrice.setText("");
        CID.setText("");
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Activatebtn;
    private javax.swing.JTextField CID;
    private javax.swing.JTextField CName;
    private javax.swing.JTextField CPrice;
    private javax.swing.JLabel Message;
    private javax.swing.JLabel MessageInvoice;
    private javax.swing.JTextField SID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
