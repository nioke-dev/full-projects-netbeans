
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class main_view extends javax.swing.JFrame {

    /**
     * Creates new form main_view
     */
    private Connection conn;
    private Statement st;
    private ResultSet rs;
    private DefaultTableModel model;
    public main_view(String param) {
        initComponents();
        conn = Koneksi.koneksi();
        txtNoUN.setText(param);
        getAccountInfo();
        iniTable();
        
    }
    private void getAccountInfo(){
        try {
            String no_un = txtNoUN.getText();            
            String sql = "select * from register where no_un = '" + no_un +"'";            
            st = conn.createStatement();
            rs = st.executeQuery(sql);            
            if (rs.next()) {
               txtUsername.setText(rs.getString("name"));
               txtGender.setText(rs.getString("gender"));
               txtSchoolOrigin.setText(rs.getString("school_origin"));
               txtTTL.setText(rs.getString("birth_date"));
               txtReligion.setText(rs.getString("religion"));
               txtAddress.setText(rs.getString("address"));
               //exam
               Double bindo = Double.parseDouble(rs.getString("bindo"));                                
               Double mtk = Double.parseDouble(rs.getString("mtk"));                                
               Double ipa = Double.parseDouble(rs.getString("ipa"));                                
               Double bing = Double.parseDouble(rs.getString("bing"));                                
               txtEx1.setText(Double.toString(bindo));
               txtEx2.setText(Double.toString(mtk));
               txtEx3.setText(Double.toString(bing));
               txtEx4.setText(Double.toString(ipa));
               total();
               Rata_Rata();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
    private void total(){                                        
        try {
            String no_un = txtNoUN.getText();            
            String sql = "select * from register where no_un = '" + no_un +"'";            
            st = conn.createStatement();
            rs = st.executeQuery(sql);            
            if (rs.next()) {
                Double bindo = Double.parseDouble(rs.getString("bindo"));                                
                Double mtk = Double.parseDouble(rs.getString("mtk"));                                
                Double ipa = Double.parseDouble(rs.getString("ipa"));                                
                Double bing = Double.parseDouble(rs.getString("bing"));                                
               Double total = bindo + mtk + bing + ipa;                              
               txtTotal.setText(Double.toString(total));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
    private void Rata_Rata(){                                        
        try {
            String no_un = txtNoUN.getText();            
            String sql = "select * from register where no_un = '" + no_un +"'";            
            st = conn.createStatement();
            rs = st.executeQuery(sql);            
            if (rs.next()) {
                Double bindo = Double.parseDouble(rs.getString("bindo"));                
                Double mtk = Double.parseDouble(rs.getString("mtk"));                                
                Double ipa = Double.parseDouble(rs.getString("ipa"));                                
                Double bing = Double.parseDouble(rs.getString("bing"));                                
                Double total = bindo + mtk + bing + ipa ;                              
                Double Rata = total / 4 ;                              
                txt_RataRata.setText(Double.toString(Rata));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }    
    }
    private void iniTable(){
        model = new DefaultTableModel();
        tblSelection.setModel(model);
        model.addColumn("No Pendaftaran");
        model.addColumn("No Un Pendafatar");
        model.addColumn("Nama Pendaftar");
        model.addColumn("Rata Rata Nilai UN");
        model.addColumn("Jurusan Pendaftaran");        
        model.addColumn("Status");        
    }
    private void getDataTable(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try {
            String sql = "select * from pendaftaran";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {                
                Object[] o = new Object[5];
                o[0] = rs.getString("no_pendaftaran");
                o[1] = rs.getString("no_un_pendaftar");
                o[2] = rs.getString("nama_pendaftar");
                o[3] = rs.getString("nilai_ppdb");
                o[4] = rs.getString("Jurusan_pendaftaran");                
                model.addRow(o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
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
        lblMenu1 = new javax.swing.JLabel();
        lblMenu2 = new javax.swing.JLabel();
        lblMenu3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelContent = new javax.swing.JPanel();
        panelContent1 = new javax.swing.JPanel();
        pnlContentTopbar1 = new javax.swing.JPanel();
        lblContentTitle4 = new javax.swing.JLabel();
        lblTop = new javax.swing.JPanel();
        txtNoUN = new javax.swing.JLabel();
        txtUsername = new javax.swing.JLabel();
        btnLogout = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblContentTitle5 = new javax.swing.JLabel();
        txtGender = new javax.swing.JLabel();
        lblContentTitle9 = new javax.swing.JLabel();
        txtTTL = new javax.swing.JLabel();
        lblContentTitle11 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JLabel();
        lblContentTitle15 = new javax.swing.JLabel();
        txtSchoolOrigin = new javax.swing.JLabel();
        lblContentTitle17 = new javax.swing.JLabel();
        txtReligion = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblContentTitle19 = new javax.swing.JLabel();
        txtEx1 = new javax.swing.JLabel();
        lblContentTitle21 = new javax.swing.JLabel();
        txtEx2 = new javax.swing.JLabel();
        lblContentTitle23 = new javax.swing.JLabel();
        txtEx3 = new javax.swing.JLabel();
        lblContentTitle25 = new javax.swing.JLabel();
        txtEx4 = new javax.swing.JLabel();
        lblContentTitle29 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        lblContentTitle30 = new javax.swing.JLabel();
        txt_RataRata = new javax.swing.JLabel();
        panelContent2 = new javax.swing.JPanel();
        pnlSelectSekolah = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        btnSelectAdd = new javax.swing.JButton();
        cbSelectMajor = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtJurusanSelected = new javax.swing.JLabel();
        txtStatusSelected = new javax.swing.JLabel();
        panelContent3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        cbSelectionMajor = new javax.swing.JComboBox<>();
        btn_cari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSelection = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        lblMenu1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblMenu1.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu1.setText("   Akun Saya");
        lblMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenu1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenu1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenu1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMenu1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblMenu1MouseReleased(evt);
            }
        });

        lblMenu2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblMenu2.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu2.setText("   Pilih Jurusan");
        lblMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenu2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenu2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenu2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMenu2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblMenu2MouseReleased(evt);
            }
        });

        lblMenu3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblMenu3.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu3.setText("   Seleksi");
        lblMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenu3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenu3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenu3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMenu3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addGap(116, 116, 116)
                .addComponent(lblMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 538));

        panelContent.setBackground(new java.awt.Color(255, 255, 255));
        panelContent.setLayout(new java.awt.CardLayout());

        panelContent1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContentTopbar1.setBackground(new java.awt.Color(3, 4, 94));

        lblContentTitle4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblContentTitle4.setForeground(new java.awt.Color(255, 255, 255));
        lblContentTitle4.setText("Akun Saya");

        javax.swing.GroupLayout pnlContentTopbar1Layout = new javax.swing.GroupLayout(pnlContentTopbar1);
        pnlContentTopbar1.setLayout(pnlContentTopbar1Layout);
        pnlContentTopbar1Layout.setHorizontalGroup(
            pnlContentTopbar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentTopbar1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblContentTitle4, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(445, 445, 445))
        );
        pnlContentTopbar1Layout.setVerticalGroup(
            pnlContentTopbar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentTopbar1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblContentTitle4)
                .addContainerGap())
        );

        panelContent1.add(pnlContentTopbar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        lblTop.setBackground(new java.awt.Color(0, 119, 182));

        txtNoUN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNoUN.setForeground(new java.awt.Color(255, 255, 255));
        txtNoUN.setText("txtNoUN");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setText("txtUsername");

        btnLogout.setBackground(new java.awt.Color(255, 51, 51));

        lblLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnLogoutLayout = new javax.swing.GroupLayout(btnLogout);
        btnLogout.setLayout(btnLogoutLayout);
        btnLogoutLayout.setHorizontalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogoutLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
        );
        btnLogoutLayout.setVerticalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout lblTopLayout = new javax.swing.GroupLayout(lblTop);
        lblTop.setLayout(lblTopLayout);
        lblTopLayout.setHorizontalGroup(
            lblTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTopLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(lblTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoUN, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 121, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        lblTopLayout.setVerticalGroup(
            lblTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblTopLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(lblTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lblTopLayout.createSequentialGroup()
                        .addComponent(txtUsername)
                        .addGap(2, 2, 2)
                        .addComponent(txtNoUN)))
                .addGap(14, 14, 14))
        );

        panelContent1.add(lblTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lblContentTitle5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblContentTitle5.setText("Jenis Kelamin");

        txtGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGender.setText("txtGender");

        lblContentTitle9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblContentTitle9.setText("Tanggal Lahir");

        txtTTL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTTL.setText("txtTTL");

        lblContentTitle11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblContentTitle11.setText("Alamat");

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtAddress.setText("txtAddress");
        txtAddress.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblContentTitle15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblContentTitle15.setText("Asal Sekolah");

        txtSchoolOrigin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSchoolOrigin.setText("txtSchoolOrigin");

        lblContentTitle17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblContentTitle17.setText("Agama");

        txtReligion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtReligion.setText("txtReligion");

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.setMinimumSize(new java.awt.Dimension(2, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblContentTitle19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblContentTitle19.setText("Bahasa Indonesia");

        txtEx1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEx1.setText("txtEx1");

        lblContentTitle21.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblContentTitle21.setText("Matematika");

        txtEx2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEx2.setText("txtEx2");

        lblContentTitle23.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblContentTitle23.setText("Bahasa Inggris");

        txtEx3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEx3.setText("txtEx3");

        lblContentTitle25.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblContentTitle25.setText("Ilmu Pengetahuan Alam");

        txtEx4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEx4.setText("txtEx4");

        lblContentTitle29.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblContentTitle29.setText("Total :");

        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTotal.setText("txtTotal");

        lblContentTitle30.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblContentTitle30.setText("Rata - Rata :");

        txt_RataRata.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_RataRata.setText("txtRata");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblContentTitle11, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContentTitle9, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblContentTitle5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTTL, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblContentTitle15, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(lblContentTitle17, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtSchoolOrigin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtReligion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblContentTitle19, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEx1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblContentTitle21, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEx2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblContentTitle23, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEx3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblContentTitle25, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEx4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(lblContentTitle30)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_RataRata, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblContentTitle29, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblContentTitle19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEx1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblContentTitle21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEx2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblContentTitle23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEx3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblContentTitle25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEx4)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContentTitle30)
                            .addComponent(txt_RataRata))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContentTitle29)
                            .addComponent(txtTotal))
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblContentTitle5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGender)
                                .addGap(18, 18, 18)
                                .addComponent(lblContentTitle9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTTL))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblContentTitle15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSchoolOrigin)
                                .addGap(18, 18, 18)
                                .addComponent(lblContentTitle17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtReligion)))
                        .addGap(18, 18, 18)
                        .addComponent(lblContentTitle11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(79, 79, 79)))
                .addContainerGap())
        );

        panelContent1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 740, 410));

        panelContent.add(panelContent1, "card2");

        pnlSelectSekolah.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(0, 119, 182));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        btnSelectAdd.setText("Pilih");
        btnSelectAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelectAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSelectAddMouseEntered(evt);
            }
        });
        btnSelectAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectAddActionPerformed(evt);
            }
        });

        cbSelectMajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jurusan", "RPL (Rekayasa Perangkat Lunak)", "TITL (Teknik Instalasi Tenaga Listrik)", "TKR (Teknik Kendaraan Ringan)", "TPMI (Teknik Permesinan)", "TB (Tata Busana)" }));
        cbSelectMajor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbSelectMajorMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbSelectMajorMousePressed(evt);
            }
        });
        cbSelectMajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSelectMajorActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Pilihanmu:");

        txtJurusanSelected.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 282, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtJurusanSelected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtStatusSelected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJurusanSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtStatusSelected, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlSelectSekolahLayout = new javax.swing.GroupLayout(pnlSelectSekolah);
        pnlSelectSekolah.setLayout(pnlSelectSekolahLayout);
        pnlSelectSekolahLayout.setHorizontalGroup(
            pnlSelectSekolahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlSelectSekolahLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(cbSelectMajor, 0, 240, Short.MAX_VALUE)
                .addGap(62, 62, 62)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(pnlSelectSekolahLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnSelectAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSelectSekolahLayout.setVerticalGroup(
            pnlSelectSekolahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSelectSekolahLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(pnlSelectSekolahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSelectMajor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(btnSelectAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelContent2Layout = new javax.swing.GroupLayout(panelContent2);
        panelContent2.setLayout(panelContent2Layout);
        panelContent2Layout.setHorizontalGroup(
            panelContent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSelectSekolah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelContent2Layout.setVerticalGroup(
            panelContent2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSelectSekolah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelContent.add(panelContent2, "card3");

        jPanel5.setBackground(new java.awt.Color(0, 119, 182));

        cbSelectionMajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih jurusan", "RPL (Rekayasa Perangkat Lunak)", "TITL (Teknik Instalasi Tenaga Listrik)", "TKR (Teknik Kendaraan Ringan)", "TPMI (Teknik Permesinan)", "TB (Tata Busana)" }));
        cbSelectionMajor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbSelectionMajorMousePressed(evt);
            }
        });
        cbSelectionMajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSelectionMajorActionPerformed(evt);
            }
        });
        cbSelectionMajor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbSelectionMajorKeyReleased(evt);
            }
        });

        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbSelectionMajor, 0, 305, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_cari)
                .addGap(356, 356, 356))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSelectionMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari))
                .addContainerGap())
        );

        tblSelection.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblSelection);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelContent3Layout = new javax.swing.GroupLayout(panelContent3);
        panelContent3.setLayout(panelContent3Layout);
        panelContent3Layout.setHorizontalGroup(
            panelContent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelContent3Layout.setVerticalGroup(
            panelContent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelContent.add(panelContent3, "card4");

        getContentPane().add(panelContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 740, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu1MouseClicked
    //remove panel
    panelContent.removeAll();
    panelContent.repaint();
    panelContent.revalidate();
    //add panel
    panelContent.add(panelContent1);    
    panelContent.repaint();
    panelContent.revalidate();
    }//GEN-LAST:event_lblMenu1MouseClicked

    private void lblMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu1MouseEntered
        
    }//GEN-LAST:event_lblMenu1MouseEntered

    private void lblMenu1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu1MouseExited
                
    }//GEN-LAST:event_lblMenu1MouseExited

    private void lblMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu1MousePressed
        
    }//GEN-LAST:event_lblMenu1MousePressed

    private void lblMenu1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu1MouseReleased
        
    }//GEN-LAST:event_lblMenu1MouseReleased

    private void lblMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu2MouseClicked
    //remove panel
    panelContent.removeAll();
    panelContent.repaint();
    panelContent.revalidate();
    //add panel
    panelContent.add(panelContent2);
    panelContent.repaint();
    panelContent.revalidate();
    }//GEN-LAST:event_lblMenu2MouseClicked

    private void lblMenu2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu2MouseEntered
        
    }//GEN-LAST:event_lblMenu2MouseEntered

    private void lblMenu2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu2MouseExited
        
    }//GEN-LAST:event_lblMenu2MouseExited

    private void lblMenu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu2MousePressed
        
    }//GEN-LAST:event_lblMenu2MousePressed

    private void lblMenu2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu2MouseReleased
        
    }//GEN-LAST:event_lblMenu2MouseReleased

    private void lblMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu3MouseClicked
    //remove panel
    panelContent.removeAll();
    panelContent.repaint();
    panelContent.revalidate();
    //add panel
    panelContent.add(panelContent3);
    panelContent.repaint();
    panelContent.revalidate();
    }//GEN-LAST:event_lblMenu3MouseClicked

    private void lblMenu3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu3MouseEntered
        
    }//GEN-LAST:event_lblMenu3MouseEntered

    private void lblMenu3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu3MouseExited
        
    }//GEN-LAST:event_lblMenu3MouseExited

    private void lblMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenu3MousePressed
        
    }//GEN-LAST:event_lblMenu3MousePressed

    private void btnSelectAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectAddMouseEntered

    }//GEN-LAST:event_btnSelectAddMouseEntered

    private void btnSelectAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectAddActionPerformed
    String No_Un = txtNoUN.getText();
    String Username = txtUsername.getText();    
    String nilai_ppdb = txt_RataRata.getText();
    String Jurusan = cbSelectMajor.getSelectedItem().toString();
        try {
            String sql1 = "select * from pendaftaran where no_un_pendaftar = '"+ No_Un+ "'";
            st = conn.createStatement();
            rs = st.executeQuery(sql1);
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Anda Sudah Memilih Jurusan");
                cbSelectMajor.setSelectedItem("Pilih Jurusan");
                txtJurusanSelected.setText("");
                txtStatusSelected.setText("");
            }else{
                try {            
                        String sql = "insert into pendaftaran (no_un_pendaftar, nama_pendaftar, nilai_ppdb, jurusan_pendaftaran, status) values (?,?,?,?,?)";
                        PreparedStatement pst = conn.prepareStatement(sql);
                        pst.setString(1, No_Un);
                        pst.setString(2, Username);
                        pst.setString(3, nilai_ppdb);
                        pst.setString(4, Jurusan);
                    if (Jurusan.equals("RPL (Rekayasa Perangkat Lunak)")) {
                        if (Double.parseDouble(nilai_ppdb) >= 75.0) {
                            pst.setString(5, "Diterima");
                        }else{
                            pst.setString(5, "Gagal Diterima");
                        }
                    }if (Jurusan.equals("TPMI (Teknik Permesinan)")){
                         if (Double.parseDouble(nilai_ppdb) >= 60.0) {
                            pst.setString(5, "Diterima");
                        }else{
                            pst.setString(5, "Gagal Diterima");
                        }
                    }if (Jurusan.equals("TKR (Teknik Kendaraan Ringan)")){
                         if (Double.parseDouble(nilai_ppdb) >= 65.0) {
                            pst.setString(5, "Diterima");
                        }else{
                            pst.setString(5, "Gagal Diterima");
                        }
                    }if (Jurusan.equals("TITL (Teknik Instalasi Tenaga Listrik)")){
                         if (Double.parseDouble(nilai_ppdb) >= 70.0) {
                            pst.setString(5, "Diterima");
                        }else{
                            pst.setString(5, "Gagal Diterima");
                        }
                    }if (Jurusan.equals("TB (Tata Busana)")){
                         if (Double.parseDouble(nilai_ppdb) >= 67.0) {
                            pst.setString(5, "Diterima");
                        }else{
                            pst.setString(5, "Gagal Diterima");
                        }
                    }
                        pst.executeUpdate();
                        txtJurusanSelected.setText(Jurusan);
                        txtStatusSelected.setText("Sedang Dievaluasi");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }//GEN-LAST:event_btnSelectAddActionPerformed

    private void cbSelectMajorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbSelectMajorMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSelectMajorMousePressed

    private void cbSelectMajorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbSelectMajorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSelectMajorMouseClicked

    private void cbSelectMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSelectMajorActionPerformed

    }//GEN-LAST:event_cbSelectMajorActionPerformed

    private void cbSelectionMajorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbSelectionMajorMousePressed
        cbSelectionMajor.removeItem("Pilih jurusan");
    }//GEN-LAST:event_cbSelectionMajorMousePressed

    private void cbSelectionMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSelectionMajorActionPerformed
        
    }//GEN-LAST:event_cbSelectionMajorActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        
    }//GEN-LAST:event_lblLogoutMouseExited

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void btnSelectAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectAddMouseClicked
        // TODO add your handling code here:
        if (rootPaneCheckingEnabled) {            
        }
    }//GEN-LAST:event_btnSelectAddMouseClicked

    private void cbSelectionMajorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbSelectionMajorKeyReleased
        // TODO add your handling code here:
//            model.getDataVector().removeAllElements();
//             model.fireTableDataChanged();
//                  try {
//                    String sql = "select * from pendaftaran where jurusan_pendaftaran = '" + cbSelectionMajor.getSelectedItem() +"'";
//                    st = conn.createStatement();                            
//                    rs = st.executeQuery(sql);
//                    while (rs.next()) {                
//                        Object[] o = new Object[6];
//                            o[0] = rs.getString("no_pendaftaran");
//                            o[1] = rs.getString("no_un_pendaftar");
//                            o[2] = rs.getString("nama_pendaftar");
//                            o[3] = rs.getString("nilai_ppdb");
//                            o[4] = rs.getString("Jurusan_pendaftaran");                
//                            o[5] = rs.getString("status");                
//                            model.addRow(o);
//                            }
//                        } catch (SQLException e) {
//                            JOptionPane.showMessageDialog(this, e.getMessage());
//                        }
    }//GEN-LAST:event_cbSelectionMajorKeyReleased

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        // TODO add your handling code here:        
             model.getDataVector().removeAllElements();
             model.fireTableDataChanged();
                  try {
                    String sql = "select * from pendaftaran where jurusan_pendaftaran = '" + cbSelectionMajor.getSelectedItem() +"'";
                    st = conn.createStatement();                            
                    rs = st.executeQuery(sql);
                    while (rs.next()) {                
                        Object[] o = new Object[6];
                            o[0] = rs.getString("no_pendaftaran");
                            o[1] = rs.getString("no_un_pendaftar");
                            o[2] = rs.getString("nama_pendaftar");
                            o[3] = rs.getString("nilai_ppdb");
                            o[4] = rs.getString("Jurusan_pendaftaran");                
                            o[5] = rs.getString("status");                
                            model.addRow(o);
                            }
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(this, e.getMessage());
                        }                                  
    }//GEN-LAST:event_btn_cariActionPerformed

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
//            java.util.logging.Logger.getLogger(main_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(main_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(main_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(main_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new main_view().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnLogout;
    private javax.swing.JButton btnSelectAdd;
    private javax.swing.JButton btn_cari;
    private javax.swing.JComboBox<String> cbSelectMajor;
    private javax.swing.JComboBox<String> cbSelectionMajor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblContentTitle11;
    public javax.swing.JLabel lblContentTitle15;
    public javax.swing.JLabel lblContentTitle17;
    public javax.swing.JLabel lblContentTitle19;
    public javax.swing.JLabel lblContentTitle21;
    public javax.swing.JLabel lblContentTitle23;
    public javax.swing.JLabel lblContentTitle25;
    public javax.swing.JLabel lblContentTitle29;
    public javax.swing.JLabel lblContentTitle30;
    public javax.swing.JLabel lblContentTitle4;
    public javax.swing.JLabel lblContentTitle5;
    public javax.swing.JLabel lblContentTitle9;
    public javax.swing.JLabel lblLogout;
    public javax.swing.JLabel lblMenu1;
    public javax.swing.JLabel lblMenu2;
    public javax.swing.JLabel lblMenu3;
    private javax.swing.JPanel lblTop;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelContent1;
    private javax.swing.JPanel panelContent2;
    private javax.swing.JPanel panelContent3;
    private javax.swing.JPanel pnlContentTopbar1;
    private javax.swing.JPanel pnlSelectSekolah;
    private javax.swing.JTable tblSelection;
    public javax.swing.JLabel txtAddress;
    public javax.swing.JLabel txtEx1;
    public javax.swing.JLabel txtEx2;
    public javax.swing.JLabel txtEx3;
    public javax.swing.JLabel txtEx4;
    public javax.swing.JLabel txtGender;
    private javax.swing.JLabel txtJurusanSelected;
    public javax.swing.JLabel txtNoUN;
    public javax.swing.JLabel txtReligion;
    public javax.swing.JLabel txtSchoolOrigin;
    private javax.swing.JLabel txtStatusSelected;
    public javax.swing.JLabel txtTTL;
    public javax.swing.JLabel txtTotal;
    public javax.swing.JLabel txtUsername;
    public javax.swing.JLabel txt_RataRata;
    // End of variables declaration//GEN-END:variables
}
