/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NIOKE
 */
public class User_Peminjaman extends javax.swing.JFrame {

    /**
     * Creates new form user
     */
    private Connection conn;
    private ResultSet rs;
    private Statement st;
    private DefaultTableModel model;
    private PreparedStatement ps;
    public User_Peminjaman() {
        initComponents();
        conn = koneksi.koneksi();
        iniTable();
        getDataTable();
    }
    private void iniTable(){
        model = new DefaultTableModel();
        tabel_user.setModel(model);
        model.addColumn("ISBN");
        model.addColumn("JUDUL");
        model.addColumn("PENERBIT");
        model.addColumn("JUMLAH");        
    }
    private void getDataTable(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            String sql = "select * from buku";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {                
                Object[] o = new Object[4];
                o[0] = rs.getString("isbn");
                o[1] = rs.getString("judul");
                o[2] = rs.getString("penerbit");
                o[3] = rs.getString("jumlah");
                model.addRow(o);
            }
        } catch (Exception e) {
        }
    }
    private void reset(){
        txt_isbn.setText("");
        txt_judul.setText("");
        txt_penerbit.setText("");        
        txt_TanggalPinjam.setText("");
        txt_jumlah.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_user = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_isbn = new javax.swing.JLabel();
        lbl_judul = new javax.swing.JLabel();
        lbl_penerbit = new javax.swing.JLabel();
        lbl_jumlah = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_isbn = new javax.swing.JTextField();
        txt_TanggalPinjam = new javax.swing.JTextField();
        txt_jumlah = new javax.swing.JTextField();
        btn_pinjam = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_judul = new javax.swing.JTextField();
        txt_penerbit = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELAMAT DATANG USER");

        tabel_user.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_user);

        jLabel2.setText("ISBN = ");

        jLabel3.setText("JUDUL = ");

        jLabel4.setText("PENERBIT = ");

        jLabel5.setText("JUMLAH = ");

        lbl_isbn.setText("-");

        lbl_judul.setText("-");

        lbl_penerbit.setText("-");

        lbl_jumlah.setText("-");

        jLabel6.setText("ISBN");

        jLabel7.setText("TAGGAL PINJAM");

        jLabel9.setText("JUMLAH");

        txt_isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_isbnActionPerformed(evt);
            }
        });

        btn_pinjam.setText("PINJAM");
        btn_pinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pinjamActionPerformed(evt);
            }
        });

        jLabel11.setText("JUDUL");

        jLabel12.setText("PENERBIT");

        btn_home.setText("HOME");
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_judul))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_isbn)))
                                .addGap(230, 230, 230)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_penerbit)
                                    .addComponent(lbl_jumlah))
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(btn_pinjam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_home))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_TanggalPinjam)
                                    .addComponent(txt_jumlah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_isbn)
                                    .addComponent(txt_judul)
                                    .addComponent(txt_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_isbn)
                    .addComponent(jLabel4)
                    .addComponent(lbl_penerbit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_judul)
                    .addComponent(jLabel5)
                    .addComponent(lbl_jumlah))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_TanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pinjam)
                    .addComponent(btn_home))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabel_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_userMouseClicked
        int baris  = tabel_user.getSelectedRow();
        String isbn = model.getValueAt(baris, 0).toString();
        try {
            // TODO add your handling code here:
            String sql = "select * from buku where isbn = '" + isbn + "'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                lbl_isbn.setText(rs.getString("isbn"));
                lbl_judul.setText(rs.getString("judul"));
                lbl_penerbit.setText(rs.getString("penerbit"));
                lbl_jumlah.setText(rs.getString("jumlah"));
                txt_isbn.setText(rs.getString("isbn"));      
                txt_judul.setText(rs.getString("judul"));
                txt_penerbit.setText(rs.getString("penerbit"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(User_Peminjaman.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_tabel_userMouseClicked

    private void txt_isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_isbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_isbnActionPerformed

    private void btn_pinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pinjamActionPerformed
       
            // TODO add your handling code here:
            String isbn = txt_isbn.getText();
            String tanggal_pinjam = txt_TanggalPinjam.getText();            
            String jumlah = txt_jumlah.getText();
            String judul  = txt_judul.getText();
            String penerbit  = txt_penerbit.getText();
                conn = koneksi.koneksi();
                String sql = "insert into peminjaman (isbn_id, tgl_pinjam, jumlah_peminjaman, judul, penerbit) values (?,?,?,?,?)";
                try {                                                          
                    ps = conn.prepareStatement(sql); 
                    ps.setString(1, isbn);
                    ps.setString(2, tanggal_pinjam);                    
                    ps.setString(3, jumlah);
                    ps.setString(4, judul);
                    ps.setString(5, penerbit);                    
                    ps.executeUpdate();
                    getDataTable();
                    JOptionPane.showMessageDialog(null, "Pinjam Buku Berhasil");
                    reset();
                    try {
                        String sql2 = "insert into history_pinjam (isbn_id, tgl_pinjam, jumlah_peminjaman, judul, penerbit) values (?,?,?,?,?)";
                        PreparedStatement pst = conn.prepareStatement(sql2); 
                        pst.setString(1, isbn);
                        pst.setString(2, tanggal_pinjam);                    
                        pst.setString(3, jumlah);                        
                        pst.setString(4, judul);
                        pst.setString(5, penerbit);                    
                        pst.executeUpdate();
                        getDataTable();
                        JOptionPane.showMessageDialog(null, "Data Berhasil Direkap");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Pinjam Buku Gagal" + e.getMessage());
                }                            
    }//GEN-LAST:event_btn_pinjamActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        new USER().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_homeActionPerformed

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
            java.util.logging.Logger.getLogger(User_Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Peminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_pinjam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_isbn;
    private javax.swing.JLabel lbl_judul;
    private javax.swing.JLabel lbl_jumlah;
    private javax.swing.JLabel lbl_penerbit;
    private javax.swing.JTable tabel_user;
    private javax.swing.JTextField txt_TanggalPinjam;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_judul;
    private javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_penerbit;
    // End of variables declaration//GEN-END:variables
}
