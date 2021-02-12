
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class konek {
    private static Connection Koneksi;
    public static Connection getConnection(){
        try {
            Koneksi = DriverManager.getConnection("jdbc:mysql://localhost/data_mhs", "root", "");            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Koneksi;
    }
            
    public static void main(String[] args) {
        getConnection();
    }
    
}
