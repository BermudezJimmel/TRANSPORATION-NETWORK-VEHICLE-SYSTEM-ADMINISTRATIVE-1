/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legalmanagement;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author jimmelbermudez7
 */
public class reports extends javax.swing.JPanel {
Connection conn = null;
ResultSet rs = null;
PreparedStatement pst = null; 

    /**
     * Creates new form reports
     */
    public reports() {
        initComponents();
        conn = databaseconn.ConnecrDb();
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        print = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("REPORTS OF LEGALS CASES");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CID", "LNAME", "FNAME", "MI", "GENDER", "ADDRESS", "WTC", "ROC", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);
        if (tbl.getColumnModel().getColumnCount() > 0) {
            tbl.getColumnModel().getColumn(0).setResizable(false);
            tbl.getColumnModel().getColumn(1).setResizable(false);
            tbl.getColumnModel().getColumn(3).setResizable(false);
            tbl.getColumnModel().getColumn(4).setResizable(false);
            tbl.getColumnModel().getColumn(5).setResizable(false);
            tbl.getColumnModel().getColumn(6).setResizable(false);
            tbl.getColumnModel().getColumn(7).setResizable(false);
            tbl.getColumnModel().getColumn(8).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 950, 330));

        print.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 100, 40));

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVE", "INACTIVE" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 130, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void tblAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblAncestorAdded
        // TODO add your handling code here:
        try{

            String sql;
            sql = "select * from complaints";
            pst=conn.prepareStatement(sql);

            rs = pst.executeQuery();
            tbl.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tblAncestorAdded

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tblMouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        try {
            boolean complete = tbl.print();

            if (complete){
                JOptionPane.showMessageDialog(null,"Done printing","Information",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Printing!","Printer",JOptionPane.ERROR_MESSAGE);
            }
        }catch (PrinterException e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_printActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        String tmp =combo.getSelectedItem().toString();
        if(tmp=="ACTIVE"){
            try{
                String sql="select CID,LNAME,FNAME,GENDER,WTC,WTCID,ROC,STATUS from complaints where STATUS='"+tmp+"'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                tbl.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if(tmp=="INACTIVE"){
            try{
                String sql="select CID,LNAME,FNAME,GENDER,WTC,WTCID,ROC,STATUS from complaints where STATUS='"+tmp+"'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                tbl.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton print;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables

}