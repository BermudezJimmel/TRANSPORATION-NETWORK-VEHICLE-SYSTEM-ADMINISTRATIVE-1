/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package documentmanagement;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DID", "KIND OF DOC.", "DATE OF SUB.", "Title 4", "Title 5", "Title 6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
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
        jScrollPane2.setViewportView(tbl);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 950, 330));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("REPORTS OF DOCUMENTS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 330, 50));

        print.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 100, 40));

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DONE", "UNDONE" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 130, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void tblAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblAncestorAdded
        // TODO add your handling code here:
        Update_table();

    }//GEN-LAST:event_tblAncestorAdded

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:
        int row=tbl.getSelectedRow();
        String value=(tbl.getModel().getValueAt(row, 3).toString());
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+value);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
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
        if(tmp=="DONE"){
            try{
                String sql="select * from reqdocument where status='DONE'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                tbl.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if(tmp=="UNDONE"){
            try{
                String sql="select * from reqdocument where status='UNDONE'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                tbl.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }         // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton print;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
private void Update_table(){

        try{
           
           String sql;
            sql = "select * from reqdocument";
           pst=conn.prepareStatement(sql);
           
           rs = pst.executeQuery();
           tbl.setModel(DbUtils.resultSetToTableModel(rs));
          }
            catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           }

}
}