/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * laptbpd.java
 *
 * Created on May 31, 2016, 11:58:11 AM
 */

package dispenda;
import koneksi.koneksi;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import java.lang.*;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.table.TableColumn;
import javax.swing.table.*;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date; 
/**
 *
 * @author Agung
 */
public class laptbpd extends javax.swing.JFrame {
Connection c;
JasperReport JasRep;
JasperPrint JasPri;
Map<String, Object> param = new HashMap<String, Object>();
JasperDesign JasDes;
    ResultSet r;
    Statement s;
 private Statement cn;
    private Connection conn;  
    /** Creates new form laptbpd */
    public laptbpd() {
        initComponents();
        tampil();
        lebarKolom();
        koneksi();
    }

    public void tampil(){
DefaultTableModel tabelnyo = new DefaultTableModel();
tabelnyo.addColumn("no_bukti");
tabelnyo.addColumn("tanggal");
tabelnyo.addColumn("npwpd_4");
tabelnyo.addColumn("nama_badan");
tabelnyo.addColumn("alamat");
tabelnyo.addColumn("pembayaran");
tabelnyo.addColumn("kode_rek");
tabelnyo.addColumn("jumlah");

try{
koneksi();
String sql = "Select * from tb_tb order by no_bukti asc";
ResultSet rs = cn.executeQuery(sql);
while (rs.next())
{
tabelnyo.addRow(new Object[]{
rs.getString(1),
rs.getString(2),
rs.getString(3),
rs.getString(4),
rs.getString(5),
rs.getString(6),
rs.getString(7),
rs.getString(8),
});
}
tb_tb.setModel(tabelnyo);

}catch (Exception e){
JOptionPane.showMessageDialog(null, "Ada Kesalahan");
}
}
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_tb = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tb = new javax.swing.JTextField();
        s4 = new javax.swing.JButton();
        p4 = new javax.swing.JButton();
        h6 = new javax.swing.JButton();
        bck = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dispenda/KOP.jpg"))); // NOI18N

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tb_tb.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tb_tb);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Laporan Tanda Bukti Pembayaran Pajak Daerah ");

        s4.setBackground(new java.awt.Color(0, 0, 102));
        s4.setIcon(new javax.swing.ImageIcon("E:\\Angger\\KULIAH\\Gambar Icon\\s1.png")); // NOI18N
        s4.setBorderPainted(false);
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });

        p4.setBackground(new java.awt.Color(0, 0, 102));
        p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dispenda/p1.png"))); // NOI18N
        p4.setBorderPainted(false);
        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4ActionPerformed(evt);
            }
        });

        h6.setBackground(new java.awt.Color(0, 0, 102));
        h6.setIcon(new javax.swing.ImageIcon("E:\\Angger\\KULIAH\\Gambar Icon\\h1.png")); // NOI18N
        h6.setBorderPainted(false);
        h6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h6ActionPerformed(evt);
            }
        });

        bck.setBackground(new java.awt.Color(0, 0, 102));
        bck.setIcon(new javax.swing.ImageIcon("E:\\Angger\\KULIAH\\Gambar Icon\\b2.png")); // NOI18N
        bck.setBorderPainted(false);
        bck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Reklame Permanen");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 946, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(639, Short.MAX_VALUE)
                .add(tb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 203, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(10, 10, 10)
                .add(s4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(h6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(bck, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 686, Short.MAX_VALUE)
                .add(p4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
                .addContainerGap())
            .add(jPanel1Layout.createSequentialGroup()
                .add(168, 168, 168)
                .add(jLabel2)
                .addContainerGap(227, Short.MAX_VALUE))
            .add(jPanel1Layout.createSequentialGroup()
                .add(351, 351, 351)
                .add(jLabel3)
                .addContainerGap(376, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(jLabel1)
                .add(18, 18, 18)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 19, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, s4)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, tb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(11, 11, 11)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 245, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(p4)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, bck, 0, 0, Short.MAX_VALUE)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, h6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void h6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h6ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_h6ActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tabelnyo = new DefaultTableModel();
tabelnyo.addColumn("no_bukti");
tabelnyo.addColumn("tanggal");
tabelnyo.addColumn("npwpd_4");
tabelnyo.addColumn("nama_badan");
tabelnyo.addColumn("alamat");
tabelnyo.addColumn("pembayaran");
tabelnyo.addColumn("kode_rek");
tabelnyo.addColumn("jumlah");

try{
koneksi();
String sql = "select * from tb_tb where no_bukti like '%"+tb.getText()+"%'";
    ResultSet rs = cn.executeQuery(sql);
while (rs.next())
{
tabelnyo.addRow(new Object[]{
rs.getString(1),
rs.getString(2),
rs.getString(3),
rs.getString(4),
rs.getString(5),
rs.getString(6),
rs.getString(7),
rs.getString(8),
});
}
tb_tb.setModel(tabelnyo);

}catch (Exception e){
JOptionPane.showMessageDialog(null, "Ada Kesalahan");
}
    }//GEN-LAST:event_s4ActionPerformed

    private void bckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckActionPerformed
        // TODO add your handling code here:
        new tbpd().setVisible(true);
    }//GEN-LAST:event_bckActionPerformed

    private void p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4ActionPerformed
        // TODO add your handling code here:
         try {
            // parameter
            String parameterNama = tb.getText();
                
            //set parameters
            //Map param = new HashMap();
            param.put("no_bukti", parameterNama);
                
            File file = new File("src/Report/tb.jrxml");
            JasDes = JRXmlLoader.load(file);
            //param.clear();%
            JasRep = JasperCompileManager.compileReport(JasDes);
            JasPri = JasperFillManager.fillReport(JasRep, param, conn);
            JasperViewer.viewReport(JasPri, false); 
            
        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_p4ActionPerformed

     public void lebarKolom(){ 
        TableColumn column;
        tb_tb.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = tb_tb.getColumnModel().getColumn(0); 
        column.setPreferredWidth(100);
        column = tb_tb.getColumnModel().getColumn(1); 
        column.setPreferredWidth(150); 
        column = tb_tb.getColumnModel().getColumn(2); 
        column.setPreferredWidth(200); 
        column = tb_tb.getColumnModel().getColumn(3); 
        column.setPreferredWidth(200);
        column = tb_tb.getColumnModel().getColumn(4); 
        column.setPreferredWidth(200);
        column = tb_tb.getColumnModel().getColumn(5); 
        column.setPreferredWidth(175);
        column = tb_tb.getColumnModel().getColumn(6); 
        column.setPreferredWidth(150);
        column = tb_tb.getColumnModel().getColumn(7); 
        column.setPreferredWidth(190);
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laptbpd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bck;
    private javax.swing.JButton h6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton p4;
    private javax.swing.JButton s4;
    private javax.swing.JTextField tb;
    private javax.swing.JTable tb_tb;
    // End of variables declaration//GEN-END:variables
public void koneksi(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dispenda","root","");
        cn = conn.createStatement();
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,"koneksi gagal..");
        System.out.println(e.getMessage());
        }
}
}
