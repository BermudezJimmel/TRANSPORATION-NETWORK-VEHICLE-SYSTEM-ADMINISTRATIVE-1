/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legalmanagement;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author jimmelbermudez7
 */
public class legaldocument1 extends javax.swing.JPanel {
GridBagLayout layout=new GridBagLayout();
      documents d1;
      legaldocument d2;
    /**
     * Creates new form legaldocument1
     */
    public legaldocument1() {
        initComponents();
         d1=new documents();
        d2=new legaldocument();
        
        
        pnl.setLayout(layout);
        GridBagConstraints c=new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        pnl.add(d1,c);
        c.gridx=0;
        c.gridy=0;
        pnl.add(d2,c);
        d1.setVisible(true);
        d2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl = new javax.swing.JPanel();
        btnllegaldocument = new javax.swing.JButton();
        btnlreports = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        add(pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 950, 330));

        btnllegaldocument.setBackground(new java.awt.Color(255, 255, 255));
        btnllegaldocument.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnllegaldocument.setForeground(new java.awt.Color(0, 102, 0));
        btnllegaldocument.setText("DOCUMENTS");
        btnllegaldocument.setToolTipText("");
        btnllegaldocument.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnllegaldocument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnllegaldocumentActionPerformed(evt);
            }
        });
        add(btnllegaldocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 161, 40));

        btnlreports.setBackground(new java.awt.Color(255, 255, 255));
        btnlreports.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnlreports.setForeground(new java.awt.Color(0, 102, 0));
        btnlreports.setText("APPROVAL");
        btnlreports.setToolTipText("");
        btnlreports.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));
        btnlreports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlreportsActionPerformed(evt);
            }
        });
        add(btnlreports, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 161, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnllegaldocumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnllegaldocumentActionPerformed
        // TODO add your handling code here:
        d1.setVisible(true);
        d2.setVisible(false);
     
    }//GEN-LAST:event_btnllegaldocumentActionPerformed

    private void btnlreportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlreportsActionPerformed
        // TODO add your handling code here:
        d1.setVisible(false);
        d2.setVisible(true);
    }//GEN-LAST:event_btnlreportsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnllegaldocument;
    private javax.swing.JButton btnlreports;
    private javax.swing.JPanel pnl;
    // End of variables declaration//GEN-END:variables
}
