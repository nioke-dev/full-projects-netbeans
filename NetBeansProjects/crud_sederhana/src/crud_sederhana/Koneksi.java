
package crud_sederhana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection conn;
    public static Connection koneksi() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost/sekolah2", "root", "");
            System.out.println("koneksi berhasil");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return conn;
    }
    
    public static void main(String[] args) {
        koneksi();
    }
}
