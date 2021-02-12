
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
   private static Connection conn;
    public static Connection getConnection(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost/kantor", "root", "");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
    public static void main(String[] args) {
        getConnection();        
    }
    
}
