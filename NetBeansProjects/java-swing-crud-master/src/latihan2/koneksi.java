package latihan2;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class koneksi {
    private static Connection conn;
    public static Connection koneksi(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/latihan_update", "root", "");
            System.out.println("koneksi berhasil");            
        } catch (SQLException e) {
            System.err.println("koneksi gagal");            
        }
        return conn;
    } 
    public static void main(String[] args) {
        koneksi();
        
    }
}
