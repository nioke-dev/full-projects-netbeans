package testing_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class koneksi {
    private static Connection coonn;
    public static Connection koneksi(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            DriverManager.getConnection("jdbc:mysql://localhost/latihan_images", "root", "");
            System.out.println("koneksi berhasil");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return coonn;
    }
    public static void main(String[] args) {
        koneksi();
    }
    
}
