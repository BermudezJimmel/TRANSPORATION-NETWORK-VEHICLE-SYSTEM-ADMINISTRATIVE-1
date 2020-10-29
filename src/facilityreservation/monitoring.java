/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facilityreservation;

import java.awt.event.KeyEvent;
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
public class monitoring extends javax.swing.JPanel {
Connection conn = null;
ResultSet rs = null;
PreparedStatement pst = null;
    /**
     * Creates new form monitoring
     */
    public monitoring() {
        initComponents();
        conn = databaseconn.ConnecrDb();
        Update_table();
    }
    private void Update_table(){

        try{
           
           String sql;
            sql = "select VID,FNAME,LNAME,facilityid,facilityname1,eventname,starttime,endtime,startday,endday,status from visitorreg";
           pst=conn.prepareStatement(sql);
           
           rs = pst.executeQuery();
           tbl.setModel(DbUtils.resultSetToTableModel(rs));
          }
            catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           }

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
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_edit = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("RID:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -30, -1, 30));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -30, 110, 30));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "RID", "LNAME", "FNAME", "MI", "GENDER", "PHONE/EMAIL", "DOR"
            }
        ));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 950, 330));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("CHANGE IF:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, 30));

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton1.setText("DONE");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 100, 30));

        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 130, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Req.ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        btn_edit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 90, 30));

        btn_save.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_save.setText("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 90, 30));

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DONE", "UNDONE" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        jPanel1.add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 130, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tblMouseClicked

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE)){
        evt.consume();

}
    }//GEN-LAST:event_jTextField2KeyTyped

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
        // TODO add your handling code here:
        try {

            String sql= "select * from visitorreg where VID=?";

            pst=conn.prepareStatement(sql);
            pst.setString(1, id.getText());

            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("VID");
                id.setText(add1);
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_idKeyReleased

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)|| c==KeyEvent.VK_DELETE)){
            evt.consume();

        }        // TODO add your handling code here:
    }//GEN-LAST:event_idKeyTyped

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbl.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel)tbl.getModel();
        id.setText(model.getValueAt(selectedRow, 0).toString());

    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        try{
            String value1 = id.getText();
            String value2 = app;
            String sql="update visitorreg set status='"+value2+"' where VID='"+value1+"'";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        Update_table();
    }//GEN-LAST:event_btn_saveActionPerformed

    private void tblAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblAncestorAdded
Update_table();        // TODO add your handling code here:
    }//GEN-LAST:event_tblAncestorAdded

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        // TODO add your handling code here:
        app="DONE";
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        String tmp =combo.getSelectedItem().toString();
        if(tmp=="DONE"){
            try{
                String sql="select VID,FNAME,LNAME,facilityid,facilityname1,eventname,starttime,endtime,startday,endday,status from visitorreg where status='DONE'";
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
                String sql="select VID,FNAME,LNAME,facilityid,facilityname1,eventname,starttime,endtime,startday,endday,status from visitorreg where status='NOTDONE'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                tbl.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        } // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
private String app;
}