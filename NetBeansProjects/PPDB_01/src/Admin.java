
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author The Coders
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    
    private Connection conn;
    private Statement st;
    private ResultSet rs;
    private DefaultTableModel model1;      
    private DefaultTableModel model2;      
    
    public Admin(String parameter) {
        initComponents();
        conn = Koneksi.koneksi();
        txt_username2.setText(parameter);
        //
        TableModelPendaftaran();
        GetDataModelPendaftaran();
        TableModelRegister();
        GetDataModelRegister();
        
    }           
    private void TableModelPendaftaran(){
        model1 = new DefaultTableModel();
        tabel_pendaftaran.setModel(model1);
        model1.addColumn("No. Pendaftaran");
        model1.addColumn("No. UN Pendaftar");
        model1.addColumn("Nama Pendaftar");
        model1.addColumn("Nilai Rata^");
        model1.addColumn("Jurusan Pendaftaran");
        model1.addColumn("Status");
    }
    private void GetDataModelPendaftaran(){
        model1.getDataVector().removeAllElements();
        model1.fireTableDataChanged();
        try {
            String sql = "select * from pendaftaran";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {                
                Object[] o = new Object[6];
                o[0] = rs.getString("no_pendaftaran");
                o[1] = rs.getString("no_un_pendaftar");
                o[2] = rs.getString("nama_pendaftar");
                o[3] = rs.getString("nilai_ppdb");
                o[4] = rs.getString("jurusan_pendaftaran");
                o[5] = rs.getString("status");
                model1.addRow(o);                        
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }        
    private void ResetPendaftaran(){
        txt_no_pendaftaran.setText("");
        txt_no_un.setText("");
        txt_nama_pendaftar.setText("");
        txt_nilai_rata_rata.setText("");
        cb_jurusan.setSelectedItem("Pilih Jurusan");
        txt_status.setText("");
    }
    private void TableModelRegister(){
        model2 = new DefaultTableModel();
        tabel_register.setModel(model2);
        model2.addColumn("No. Register");
        model2.addColumn("No. Ujian Nasional");
        model2.addColumn("Nama Lengkap");
        model2.addColumn("Jenis Kelamin");
        model2.addColumn("Tanggal Lahir");
        model2.addColumn("Alamat");
        model2.addColumn("Asal Sekolah");
        model2.addColumn("Agama");
        model2.addColumn("B.INDO");
        model2.addColumn("MTK");
        model2.addColumn("IPA");
        model2.addColumn("B.ING");
        model2.addColumn("PASSWORD");
    }
    private void GetDataModelRegister(){
        model2.getDataVector().removeAllElements();
        model2.fireTableDataChanged();
        try {
            String sql = "select * from register";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {                
                Object[] o = new Object[13];                
                o[0] = rs.getString("no_register");
                o[1] = rs.getString("no_un");
                o[2] = rs.getString("name");
                o[3] = rs.getString("gender");
                o[4] = rs.getString("birth_date");
                o[5] = rs.getString("address");
                o[6] = rs.getString("school_origin");
                o[7] = rs.getString("religion");
                o[8] = rs.getString("bindo");
                o[9] = rs.getString("mtk");
                o[10] = rs.getString("ipa");
                o[11] = rs.getString("bing");
                o[12] = rs.getString("password");
                model2.addRow(o);                        
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void refreshRegister(){
        txt_no_register.setText("");
        txt_no_un_pendaftar.setText("");
        txt_nama_lengkap.setText("");
        rb_laki_laki.setSelected(false);
        rb_perempuan.setSelected(false);
        txt_tanggal_lahir.setText("");
        txt_asal_sekolah.setText("");
        txt_agama.setText("");
        txt_alamat.setText("");
        txt_password.setText("");
        txt_exam_bindo.setText("");
        txt_exam_mtk.setText("");
        txt_exam_ipa.setText("");
        txt_exam_bing.setText("");
        buttonGroup1.clearSelection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Home_Panel = new javax.swing.JPanel();
        Home_Layout = new javax.swing.JPanel();
        btn_Crud_Pendaftaran = new javax.swing.JButton();
        btn_Crud_register = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_username2 = new javax.swing.JLabel();
        CRUD_PENDAFTARAN = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_pendaftaran = new javax.swing.JTable();
        btn_create = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        txt_cari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_no_pendaftaran = new javax.swing.JTextField();
        txt_no_un = new javax.swing.JTextField();
        txt_nama_pendaftar = new javax.swing.JTextField();
        txt_nilai_rata_rata = new javax.swing.JTextField();
        txt_status = new javax.swing.JTextField();
        cb_jurusan = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        CRUD_REGISTER = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_register = new javax.swing.JTable();
        btn_create_register = new javax.swing.JButton();
        btn_update_register = new javax.swing.JButton();
        btn_delete_register = new javax.swing.JButton();
        txt_cari_register = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_no_un_pendaftar = new javax.swing.JTextField();
        txt_nama_lengkap = new javax.swing.JTextField();
        txt_tanggal_lahir = new javax.swing.JTextField();
        txt_asal_sekolah = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_agama = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_alamat = new javax.swing.JTextArea();
        rb_laki_laki = new javax.swing.JRadioButton();
        rb_perempuan = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_exam_bindo = new javax.swing.JTextField();
        txt_exam_mtk = new javax.swing.JTextField();
        txt_exam_ipa = new javax.swing.JTextField();
        txt_exam_bing = new javax.swing.JTextField();
        txt_no_register = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Home_Panel.setLayout(new java.awt.CardLayout());

        Home_Layout.setBackground(new java.awt.Color(102, 204, 0));

        btn_Crud_Pendaftaran.setText("CRUD PENDAFTARAN");
        btn_Crud_Pendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Crud_PendaftaranActionPerformed(evt);
            }
        });

        btn_Crud_register.setText("CRUD REGISTER");
        btn_Crud_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Crud_registerActionPerformed(evt);
            }
        });

        jLabel8.setText("SELAMAT DATANG ADMIN");

        txt_username2.setText("txt_username");

        javax.swing.GroupLayout Home_LayoutLayout = new javax.swing.GroupLayout(Home_Layout);
        Home_Layout.setLayout(Home_LayoutLayout);
        Home_LayoutLayout.setHorizontalGroup(
            Home_LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_LayoutLayout.createSequentialGroup()
                .addGroup(Home_LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Home_LayoutLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(btn_Crud_register)
                        .addGap(74, 74, 74)
                        .addComponent(btn_Crud_Pendaftaran))
                    .addGroup(Home_LayoutLayout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jLabel8))
                    .addGroup(Home_LayoutLayout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(txt_username2)))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        Home_LayoutLayout.setVerticalGroup(
            Home_LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_LayoutLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_username2)
                .addGap(202, 202, 202)
                .addGroup(Home_LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Crud_Pendaftaran)
                    .addComponent(btn_Crud_register))
                .addContainerGap(304, Short.MAX_VALUE))
        );

        Home_Panel.add(Home_Layout, "card2");

        CRUD_PENDAFTARAN.setBackground(new java.awt.Color(0, 204, 255));

        tabel_pendaftaran.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_pendaftaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_pendaftaranMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_pendaftaran);

        btn_create.setText("CREATE");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });

        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        txt_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cariKeyReleased(evt);
            }
        });

        jLabel1.setText("No. Pendaftaran :");

        jLabel2.setText("No UN Pendaftar :");

        jLabel3.setText("Nama Pendaftar :");

        jLabel4.setText("Nilai Rata Rata :");

        jLabel5.setText("Jurusan Pendaftaran :");

        jLabel6.setText("Status :");

        cb_jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jurusan", "RPL (Rekayasa Perangkat Lunak)", "TITL (Teknik Instalasi Tenaga Listrik)", "TKR (Teknik Kendaraan Ringan)", "TPMI (Teknik Permesinan)", "TB (Tata Busana)" }));

        jLabel7.setText("Cari :");

        javax.swing.GroupLayout CRUD_PENDAFTARANLayout = new javax.swing.GroupLayout(CRUD_PENDAFTARAN);
        CRUD_PENDAFTARAN.setLayout(CRUD_PENDAFTARANLayout);
        CRUD_PENDAFTARANLayout.setHorizontalGroup(
            CRUD_PENDAFTARANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CRUD_PENDAFTARANLayout.createSequentialGroup()
                .addGroup(CRUD_PENDAFTARANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CRUD_PENDAFTARANLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(CRUD_PENDAFTARANLayout.createSequentialGroup()
                        .addGroup(CRUD_PENDAFTARANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CRUD_PENDAFTARANLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(CRUD_PENDAFTARANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(CRUD_PENDAFTARANLayout.createSequentialGroup()
                                        .addGroup(CRUD_PENDAFTARANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addGroup(CRUD_PENDAFTARANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_no_pendaftaran)
                                            .addComponent(txt_no_un, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_nama_pendaftar, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_nilai_rata_rata, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_status, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cb_jurusan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(CRUD_PENDAFTARANLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(btn_create)
                                .addGap(18, 18, 18)
                                .addComponent(btn_update)
                                .addGap(18, 18, 18)
                                .addComponent(btn_delete)
                                .addGap(78, 78, 78)
                                .addGroup(CRUD_PENDAFTARANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 327, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CRUD_PENDAFTARANLayout.setVerticalGroup(
            CRUD_PENDAFTARANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CRUD_PENDAFTARANLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CRUD_PENDAFTARANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_no_pendaftaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CRUD_PENDAFTARANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_no_un, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CRUD_PENDAFTARANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nama_pendaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CRUD_PENDAFTARANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nilai_rata_rata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CRUD_PENDAFTARANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CRUD_PENDAFTARANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CRUD_PENDAFTARANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_create)
                    .addComponent(btn_update)
                    .addComponent(btn_delete)
                    .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        Home_Panel.add(CRUD_PENDAFTARAN, "card3");

        tabel_register.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_registerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_register);

        btn_create_register.setText("CREATE");
        btn_create_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_registerActionPerformed(evt);
            }
        });

        btn_update_register.setText("UPDATE");
        btn_update_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_registerActionPerformed(evt);
            }
        });

        btn_delete_register.setText("DELETE");
        btn_delete_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_registerActionPerformed(evt);
            }
        });

        txt_cari_register.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cari_registerKeyReleased(evt);
            }
        });

        jLabel9.setText("No UN Pendaftar");

        jLabel10.setText("Nama Lengkap");

        jLabel11.setText("Jenis Kelamin");

        jLabel12.setText("Tanggal Lahir");

        jLabel13.setText("alamat");

        jLabel14.setText("Asal Sekolah");

        jLabel15.setText("Cari :");

        jLabel16.setText("Agama");

        jLabel17.setText("Nilai B. Indo");

        jLabel18.setText("Nilai Mtk");

        jLabel20.setText("Nilai B. Inggris");

        jLabel21.setText("Password ");

        txt_alamat.setColumns(20);
        txt_alamat.setRows(5);
        jScrollPane3.setViewportView(txt_alamat);

        buttonGroup1.add(rb_laki_laki);
        rb_laki_laki.setText("Laki Laki");

        buttonGroup1.add(rb_perempuan);
        rb_perempuan.setText("Perempuan");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Nilai Ujian Nasional");

        jLabel23.setText("Nilai Ipa");

        jLabel19.setText("No. Register");

        javax.swing.GroupLayout CRUD_REGISTERLayout = new javax.swing.GroupLayout(CRUD_REGISTER);
        CRUD_REGISTER.setLayout(CRUD_REGISTERLayout);
        CRUD_REGISTERLayout.setHorizontalGroup(
            CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CRUD_REGISTERLayout.createSequentialGroup()
                .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CRUD_REGISTERLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(CRUD_REGISTERLayout.createSequentialGroup()
                        .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CRUD_REGISTERLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)))
                            .addGroup(CRUD_REGISTERLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_create_register))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CRUD_REGISTERLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel19)))
                        .addGap(18, 18, 18)
                        .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_no_register)
                            .addComponent(txt_no_un_pendaftar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(txt_nama_lengkap)
                            .addComponent(txt_tanggal_lahir)
                            .addGroup(CRUD_REGISTERLayout.createSequentialGroup()
                                .addComponent(rb_laki_laki)
                                .addGap(18, 18, 18)
                                .addComponent(rb_perempuan))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CRUD_REGISTERLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btn_update_register)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_delete_register)))
                        .addGap(42, 42, 42)
                        .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CRUD_REGISTERLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_asal_sekolah, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CRUD_REGISTERLayout.createSequentialGroup()
                                .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel13))
                                    .addGroup(CRUD_REGISTERLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(17, 17, 17)))
                                .addGap(33, 33, 33)
                                .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_password)
                                    .addComponent(txt_agama, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CRUD_REGISTERLayout.createSequentialGroup()
                                .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cari_register, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 42, Short.MAX_VALUE))
                            .addGroup(CRUD_REGISTERLayout.createSequentialGroup()
                                .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_exam_bindo, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(txt_exam_mtk)
                                    .addComponent(txt_exam_ipa)
                                    .addComponent(txt_exam_bing))
                                .addGap(18, 18, 18)))))
                .addContainerGap())
        );
        CRUD_REGISTERLayout.setVerticalGroup(
            CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CRUD_REGISTERLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CRUD_REGISTERLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CRUD_REGISTERLayout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19)
                                .addComponent(txt_no_register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(txt_asal_sekolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)))
                        .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CRUD_REGISTERLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_no_un_pendaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txt_nama_lengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(rb_laki_laki)
                                    .addComponent(rb_perempuan))
                                .addGap(18, 18, 18)
                                .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txt_tanggal_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(CRUD_REGISTERLayout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(CRUD_REGISTERLayout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_exam_bindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17))
                                    .addGap(12, 12, 12)
                                    .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_exam_mtk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_exam_ipa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_exam_bing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20)))))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel15)
                        .addGap(3, 3, 3)
                        .addGroup(CRUD_REGISTERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cari_register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(btn_delete_register)
                            .addComponent(btn_update_register)
                            .addComponent(btn_create_register))
                        .addGap(127, 127, 127))))
        );

        Home_Panel.add(CRUD_REGISTER, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 908, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Home_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Home_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Crud_PendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Crud_PendaftaranActionPerformed
        // TODO add your handling code here:
        Home_Panel.removeAll();        
        Home_Panel.repaint();        
        Home_Panel.revalidate();
        
        Home_Panel.add(CRUD_PENDAFTARAN);
        Home_Panel.repaint();        
        Home_Panel.revalidate();
    }//GEN-LAST:event_btn_Crud_PendaftaranActionPerformed

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "insert into pendaftaran (no_un_pendaftar,nama_pendaftar, nilai_ppdb, jurusan_pendaftaran, status) values(?,?,?,?,?)";            
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, txt_no_un.getText());
            pst.setString(2, txt_nama_pendaftar.getText());
            pst.setString(3, txt_nilai_rata_rata.getText());
            pst.setString(4, cb_jurusan.getSelectedItem().toString());
            pst.setString(5, txt_status.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insert Data Berhasil");
            ResetPendaftaran();
            GetDataModelPendaftaran();                    ;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_createActionPerformed

    private void tabel_pendaftaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_pendaftaranMouseClicked
        // TODO add your handling code here:
        int baris = tabel_pendaftaran.getSelectedRow();
        String no_pendaftaran = model1.getValueAt(baris, 0).toString();
        try {
            String sql = "select * from pendaftaran where no_pendaftaran = '" + no_pendaftaran + "'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txt_no_pendaftaran.setText(rs.getString("no_pendaftaran"));
                txt_no_un.setText(rs.getString("no_un_pendaftar"));
                txt_nama_pendaftar.setText(rs.getString("nama_pendaftar"));
                txt_nilai_rata_rata.setText(rs.getString("nilai_ppdb"));                
                cb_jurusan.setSelectedItem(rs.getString("jurusan_pendaftaran"));                
                txt_status.setText(rs.getString("status"));                
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tabel_pendaftaranMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        String no_pendaftaran = txt_no_pendaftaran.getText();
        try {
            String sql = "delete from pendaftaran where no_pendaftaran = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, no_pendaftaran);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
            GetDataModelPendaftaran();
            ResetPendaftaran();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "update pendaftaran set no_un_pendaftar = ?, nama_pendaftar = ?, nilai_ppdb = ?, jurusan_pendaftaran = ?, status = ? where no_pendaftaran = ?";            
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, txt_no_un.getText());
            pst.setString(2, txt_nama_pendaftar.getText());
            pst.setString(3, txt_nilai_rata_rata.getText());
            pst.setString(4, cb_jurusan.getSelectedItem().toString());
            pst.setString(5, txt_status.getText());
            pst.setString(6, txt_no_pendaftaran.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update Data Berhasil");
            ResetPendaftaran();
            GetDataModelPendaftaran();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void txt_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyReleased
        // TODO add your handling code here:
        model1.getDataVector().removeAllElements();
        model1.fireTableDataChanged();
        String cari = txt_cari.getText();
        try {
            String sql = "select * from pendaftaran where no_pendaftaran LIKE '%" + cari + "%' or no_un_pendaftar LIKE '%" + cari + "%' or nama_pendaftar LIKE '%" + cari + "%' or nilai_ppdb LIKE '%" + cari + "%' or jurusan_pendaftaran LIKE '%" + cari + "%' or status LIKE '%" + cari + "%'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {                
                Object[] o = new Object[6];
                o[0] = rs.getString("no_pendaftaran");
                o[1] = rs.getString("no_un_pendaftar");
                o[2] = rs.getString("nama_pendaftar");
                o[3] = rs.getString("nilai_ppdb");
                o[4] = rs.getString("jurusan_pendaftaran");
                o[5] = rs.getString("status");               
                model1.addRow(o);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_txt_cariKeyReleased

    private void tabel_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_registerMouseClicked
        // TODO add your handling code here:                                                 
        int baris = tabel_register.getSelectedRow();
        String no_register = model2.getValueAt(baris, 0).toString();
        try {
            String sql = "select * from register where no_register = '" + no_register + "'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txt_no_register.setText(rs.getString("no_register"));
                txt_no_un_pendaftar.setText(rs.getString("no_un"));
                txt_nama_lengkap.setText(rs.getString("name"));
                
                
                if (rs.getString("gender").equals("pria")) {
                    
                rb_laki_laki.setSelected(true);
                
                }else{
                    
                rb_perempuan.setSelected(true);
                
                }
                
                
                txt_tanggal_lahir.setText(rs.getString("birth_date"));
                txt_asal_sekolah.setText(rs.getString("school_origin"));
                txt_agama.setText(rs.getString("religion"));
                txt_alamat.setText(rs.getString("address"));
                txt_password.setText(rs.getString("password"));
                txt_exam_bindo.setText(rs.getString("bindo"));
                txt_exam_mtk.setText(rs.getString("mtk"));
                txt_exam_ipa.setText(rs.getString("ipa"));
                txt_exam_bing.setText(rs.getString("bing"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tabel_registerMouseClicked

    private void btn_create_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_registerActionPerformed
        // TODO add your handling code here:
        String gender;
        if(rb_laki_laki.isSelected() == true){
            gender = "Laki - Laki";
        }else{
            gender = "Perempuan";
        }
        try {
            String sql = "insert into register (no_un, name, gender, birth_date, address, school_origin, religion, bindo, mtk, ipa, bing, password) values(?,?,?,?,?,?,?,?,?,?,?,?)";            
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, txt_no_un.getText());
            pst.setString(2, txt_nama_lengkap.getText());
            pst.setString(3, gender);
            pst.setString(4, txt_tanggal_lahir.getText());
            pst.setString(5, txt_alamat.getText());
            pst.setString(6, txt_asal_sekolah.getText());            
            pst.setString(7, txt_agama.getText());            
            pst.setString(8, txt_exam_bindo.getText());            
            pst.setString(9, txt_exam_mtk.getText());            
            pst.setString(10, txt_exam_ipa.getText());            
            pst.setString(11, txt_exam_bing.getText());            
            pst.setString(12, txt_password.getText());            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insert Data Berhasil");
            refreshRegister();                    ;
            GetDataModelRegister();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_create_registerActionPerformed

    private void btn_update_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_registerActionPerformed
        // TODO add your handling code here:
        String gender;
        if(rb_laki_laki.isSelected() == true){
            gender = "Laki - Laki";
        }else{
            gender = "Perempuan";
        }
        try {
            String sql = "update register set no_un = ?, name = ?, gender = ?, birth_date = ?, address = ?, school_origin = ?, religion = ?, bindo = ?, mtk = ?, ipa = ?, bing = ?, password = ? where no_register = ?";
            PreparedStatement pst = conn.prepareStatement(sql);            
            pst.setString(1, txt_no_un.getText());
            pst.setString(2, txt_nama_lengkap.getText());
            pst.setString(3, gender);
            pst.setString(4, txt_tanggal_lahir.getText());
            pst.setString(5, txt_alamat.getText());
            pst.setString(6, txt_asal_sekolah.getText());            
            pst.setString(7, txt_agama.getText());            
            pst.setString(8, txt_exam_bindo.getText());            
            pst.setString(9, txt_exam_mtk.getText());            
            pst.setString(10, txt_exam_ipa.getText());            
            pst.setString(11, txt_exam_bing.getText());            
            pst.setString(12, txt_password.getText());             
            pst.setString(13, txt_no_register.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update Data Berhasil");
            refreshRegister();                    
            GetDataModelRegister();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_update_registerActionPerformed

    private void btn_delete_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_registerActionPerformed
        // TODO add your handling code here:
        String no_register = txt_no_register.getText();
        try {
            String sql = "delete from register where no_register = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, no_register);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
            GetDataModelRegister();
            refreshRegister();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_delete_registerActionPerformed

    private void txt_cari_registerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cari_registerKeyReleased
        // TODO add your handling code here:
        model2.getDataVector().removeAllElements();
        model2.fireTableDataChanged();
        String cari = txt_cari_register.getText();
        try {
            String sql = "select * from register where no_register LIKE '%" + cari + "%' "
                    + "or no_un LIKE '%" + cari + "%' "
                    + "or name LIKE '%" + cari + "%' "
                    + "or gender LIKE '%" + cari + "%' "
                    + "or birth_date LIKE '%" + cari + "%' "
                    + "or address LIKE '%" + cari + "%'"
                    + "or school_origin LIKE '%" + cari + "%'"
                    + "or religion LIKE '%" + cari + "%'"
                    + "or bindo LIKE '%" + cari + "%'"
                    + "or mtk LIKE '%" + cari + "%'"
                    + "or ipa LIKE '%" + cari + "%'"
                    + "or bing LIKE '%" + cari + "%'"
                    + "or password LIKE '%" + cari + "%'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {                                
                Object[] o = new Object[12];
                o[0] = rs.getString("no_un");
                o[1] = rs.getString("name");
                o[2] = rs.getString("gender");
                o[3] = rs.getString("birth_date");
                o[4] = rs.getString("address");
                o[5] = rs.getString("school_origin");
                o[6] = rs.getString("religion");
                o[7] = rs.getString("bindo");
                o[8] = rs.getString("mtk");
                o[9] = rs.getString("ipa");
                o[10] = rs.getString("bing");
                o[11] = rs.getString("password");
                model2.addRow(o);                        
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_txt_cari_registerKeyReleased

    private void btn_Crud_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Crud_registerActionPerformed
        // TODO add your handling code here:
        Home_Panel.removeAll();        
        Home_Panel.repaint();        
        Home_Panel.revalidate();
        
        Home_Panel.add(CRUD_REGISTER);
        Home_Panel.repaint();        
        Home_Panel.revalidate();
    }//GEN-LAST:event_btn_Crud_registerActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Admin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CRUD_PENDAFTARAN;
    private javax.swing.JPanel CRUD_REGISTER;
    private javax.swing.JPanel Home_Layout;
    private javax.swing.JPanel Home_Panel;
    private javax.swing.JButton btn_Crud_Pendaftaran;
    private javax.swing.JButton btn_Crud_register;
    private javax.swing.JButton btn_create;
    private javax.swing.JButton btn_create_register;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_delete_register;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_update_register;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_jurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rb_laki_laki;
    private javax.swing.JRadioButton rb_perempuan;
    private javax.swing.JTable tabel_pendaftaran;
    private javax.swing.JTable tabel_register;
    private javax.swing.JTextField txt_agama;
    private javax.swing.JTextArea txt_alamat;
    private javax.swing.JTextField txt_asal_sekolah;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_cari_register;
    private javax.swing.JTextField txt_exam_bindo;
    private javax.swing.JTextField txt_exam_bing;
    private javax.swing.JTextField txt_exam_ipa;
    private javax.swing.JTextField txt_exam_mtk;
    private javax.swing.JTextField txt_nama_lengkap;
    private javax.swing.JTextField txt_nama_pendaftar;
    private javax.swing.JTextField txt_nilai_rata_rata;
    private javax.swing.JTextField txt_no_pendaftaran;
    private javax.swing.JTextField txt_no_register;
    private javax.swing.JTextField txt_no_un;
    private javax.swing.JTextField txt_no_un_pendaftar;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_tanggal_lahir;
    private javax.swing.JLabel txt_username2;
    // End of variables declaration//GEN-END:variables
}
