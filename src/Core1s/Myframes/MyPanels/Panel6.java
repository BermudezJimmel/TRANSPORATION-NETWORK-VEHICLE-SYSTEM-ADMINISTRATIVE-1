/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core1s.Myframes.MyPanels;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author jimmelbermudez7
 */
public class Panel6 extends javax.swing.JPanel {
Connection conn = null;
ResultSet rs = null;
PreparedStatement pst = null; 
    /**
     * Creates new form Panel6
     */
    public Panel6() {
        initComponents();
        conn = databaseconn.ConnecrDb();
        Update_table();
    }
    private void Update_table(){

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

}
    public void Core1(){
    Thread clock= new Thread(){
    public void run(){
    for(;;){
    Calendar calen = GregorianCalendar.getInstance();
    int AM_PM = calen.get(Calendar.AM_PM);
    
     String tpattern = "hh:mm";
                    SimpleDateFormat tsdf = new SimpleDateFormat(tpattern);
                    time.setText(tsdf.format(new java.util.Date()));
                    
    String [] days = new String [] {"","","","","","",""};
    String day_night = "";
            if (AM_PM==1)
            {day_night ="PM";}
            else
            {day_night = "AM";}
            
            ps.setText(day_night);
  //  time1.setText(hour+":"+mins+":"+secs); 



int mons = calen.get(Calendar.MONTH);
int day = calen.get(Calendar.DAY_OF_MONTH);
int yr = calen.get(Calendar.YEAR);
date.setText(days[calen.get(Calendar.DAY_OF_WEEK)-1]+" "+(mons+1)+"/"+day+"/"+yr);    
    try {
        sleep(1000);
    } catch (InterruptedException ex) {
        
    }
} } };

clock.start();
}
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        ps = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
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
        jScrollPane1.setViewportView(tbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 950, 390));

        ps.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        ps.setText("pm");
        add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 50, 53));

        time.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        time.setText("ooooo");
        add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 90, 56));

        date.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        date.setText("ooooooooooooooooo");
        add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 350, 56));
    }// </editor-fold>//GEN-END:initComponents

    private void tblAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ps;
    private javax.swing.JTable tbl;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}