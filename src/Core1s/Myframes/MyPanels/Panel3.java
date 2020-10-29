/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core1s.Myframes.MyPanels;

import facilityreservation.facilityreservation;
import facilityreservation.monitoring;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import facilityreservation.reports;
import facilityreservation.registration;

/**
 *
 * @author jimmelbermudez7
 */
public class Panel3 extends javax.swing.JPanel {
GridBagLayout layout=new GridBagLayout();
     registration x1;
     facilityreservation x2;
     monitoring x3;
     reports x4;
    /**
     * Creates new form Panel3
     */
    public Panel3() {
        initComponents();
        x1=new registration();
        x2=new facilityreservation();
        x3=new monitoring();
        x4=new reports();
        
        DynamicPanel3.setLayout(layout);
        GridBagConstraints c=new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        DynamicPanel3.add(x1,c);
        c.gridx=0;
        c.gridy=0;
        DynamicPanel3.add(x2,c);
        c.gridx=0;
        c.gridy=0;
        DynamicPanel3.add(x3,c);
        c.gridx=0;
        c.gridy=0;
        DynamicPanel3.add(x4,c);
        x1.setVisible(false);
        x2.setVisible(false);
        x3.setVisible(false);
        x4.setVisible(false);
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
        btnfreports = new javax.swing.JButton();
        btnfreservation = new javax.swing.JButton();
        btnfmonitoring = new javax.swing.JButton();
        DynamicPanel3 = new javax.swing.JPanel();
        btnfregistration = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 410));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnfreports.setBackground(new java.awt.Color(255, 255, 255));
        btnfreports.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnfreports.setForeground(new java.awt.Color(0, 102, 0));
        btnfreports.setText("REPORTS");
        btnfreports.setToolTipText("");
        btnfreports.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnfreports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfreportsActionPerformed(evt);
            }
        });
        jPanel1.add(btnfreports, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 161, 29));

        btnfreservation.setBackground(new java.awt.Color(255, 255, 255));
        btnfreservation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnfreservation.setForeground(new java.awt.Color(0, 102, 0));
        btnfreservation.setText("RESERVATION");
        btnfreservation.setToolTipText("");
        btnfreservation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnfreservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfreservationActionPerformed(evt);
            }
        });
        jPanel1.add(btnfreservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 160, 29));

        btnfmonitoring.setBackground(new java.awt.Color(255, 255, 255));
        btnfmonitoring.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnfmonitoring.setForeground(new java.awt.Color(0, 102, 0));
        btnfmonitoring.setText("MONITORING");
        btnfmonitoring.setToolTipText("");
        btnfmonitoring.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnfmonitoring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfmonitoringActionPerformed(evt);
            }
        });
        jPanel1.add(btnfmonitoring, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 160, 29));

        DynamicPanel3.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout DynamicPanel3Layout = new javax.swing.GroupLayout(DynamicPanel3);
        DynamicPanel3.setLayout(DynamicPanel3Layout);
        DynamicPanel3Layout.setHorizontalGroup(
            DynamicPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        DynamicPanel3Layout.setVerticalGroup(
            DynamicPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(DynamicPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 950, 400));

        btnfregistration.setBackground(new java.awt.Color(255, 255, 255));
        btnfregistration.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnfregistration.setForeground(new java.awt.Color(0, 102, 0));
        btnfregistration.setText("REGISTRATION");
        btnfregistration.setToolTipText("");
        btnfregistration.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnfregistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfregistrationActionPerformed(evt);
            }
        });
        jPanel1.add(btnfregistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 161, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void btnfreportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfreportsActionPerformed
        // TODO add your handling code here:
        x1.setVisible(false);
        x2.setVisible(false);
        x3.setVisible(false);
        x4.setVisible(true);

    }//GEN-LAST:event_btnfreportsActionPerformed

    private void btnfreservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfreservationActionPerformed
        // TODO add your handling code here:
        x1.setVisible(false);
        x2.setVisible(true);
        x3.setVisible(false);
        x4.setVisible(false);

    }//GEN-LAST:event_btnfreservationActionPerformed

    private void btnfregistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfregistrationActionPerformed
        // TODO add your handling code here:

        x1.setVisible(true);
        x2.setVisible(false);
        x3.setVisible(false);
        x4.setVisible(false);

    }//GEN-LAST:event_btnfregistrationActionPerformed

    private void btnfmonitoringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfmonitoringActionPerformed
        // TODO add your handling code here:
        x1.setVisible(false);
        x2.setVisible(false);
        x3.setVisible(true);
        x4.setVisible(false);

    }//GEN-LAST:event_btnfmonitoringActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel3;
    private javax.swing.JButton btnfmonitoring;
    private javax.swing.JButton btnfregistration;
    private javax.swing.JButton btnfreports;
    private javax.swing.JButton btnfreservation;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
