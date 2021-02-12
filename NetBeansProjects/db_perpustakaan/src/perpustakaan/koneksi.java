/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NIOKE
 */
public class koneksi {
    public static Connection conn;
    public static Connection koneksi(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db_perpustakaan", "root", "");
            System.out.println("koneksi berhasi");
        } catch (SQLException e) {
            System.err.println("konkesi gagal" + e.getMessage());
        }
        return conn;
    }
    public static void main(String[] args) {
        koneksi();
    }
    
}
