/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_kalkulator;

/**
 *
 * @author NIOKE
 */
public class program_kalkulator extends javax.swing.JFrame {

    /**
     * Creates new form program_kalkulator
     */
    public program_kalkulator() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_niliaA = new javax.swing.JTextField();
        txt_niliaiB = new javax.swing.JTextField();
        btn_hitung = new javax.swing.JButton();
        label_hasil = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nilai_hasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("PROGRAM KALKULATOR");

        jLabel2.setText("Nilai  A ");

        jLabel3.setText("Nilai B");

        txt_niliaiB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_niliaiBActionPerformed(evt);
            }
        });

        btn_hitung.setText("Hitung");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });

        label_hasil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_hasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_hasil.setText("Hasil");

        jLabel4.setText("hasil");

        nilai_hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai_hasilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_niliaA)
                            .addComponent(txt_niliaiB)
                            .addComponent(nilai_hasil, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btn_hitung)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_niliaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_niliaiB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nilai_hasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(btn_hitung)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        // TODO add your handling code here:
        int nilaiA = Integer.valueOf(txt_niliaA.getText());
        int nilaiB  = Integer.valueOf(txt_niliaiB.getText());
        
        int hasil = nilaiA + nilaiB;
        
        //tampilkan hasil pada label
//        label_hasil.setText(String.valueOf(nilai_hasil));
          nilai_hasil.setText(String.valueOf(hasil));
          
          
          
//klik 2x pada btnHitung untuk menambahkan method handler untuk event click.
//
//Kemudian isi kode method-nya seperti ini:
//
//private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {             
//    int nilaiA = Integer.valueOf(txtNilaiA.getText());
//    int nilaiB = Integer.valueOf(txtNilaiB.getText());
//    int hasil = nilaiA + nilaiB;
//    
//    // tampilkan hasil ke label
//    labelHasil.setText(String.valueOf(hasil));
//} 
//Penjelasan:
//
//Pertama kita membuat vairabel nilaiA, nilaiB, dan hasil dengan tipe int (Integer).
//
//Variabel nilaiA kita ambil nilainya dari txtNilaiA. Karena teks dari txtNilaiA bertipe String, maka kita harus mengubahnya menjadi integer agar dapat disimpan di dalam variabel nilaiA.
//
//Kita menggunakan method Integer.valueOf() untuk mengubah string menjadi integer.
//
//Kita juga melakukan hal yang sama pada variabel nilaiB.
//
//Berikutnya pada variabel hasil, kita isi dengan hasil penjumlahan dari nilaiA dan nilaiB.
//
//Terakhir, kita tampilkan hasilnya ke dalam labelHasil.
//
//Karena method setText() hanya menerima parameter berupa string, maka kita harus ubah lagi tipe data dari variabel hasil menjadi string dengan method String.valueOf().
//
//Sekarang coba eksekusi programnya dengan klik kanan pada file Kalkulator.java, lalu pilih Run File.              
                
    }//GEN-LAST:event_btn_hitungActionPerformed

    private void txt_niliaiBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_niliaiBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_niliaiBActionPerformed

    private void nilai_hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai_hasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai_hasilActionPerformed

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
            java.util.logging.Logger.getLogger(program_kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(program_kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(program_kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(program_kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new program_kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel label_hasil;
    private javax.swing.JTextField nilai_hasil;
    private javax.swing.JTextField txt_niliaA;
    private javax.swing.JTextField txt_niliaiB;
    // End of variables declaration//GEN-END:variables
}
