/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NIOKE
 */
public class config {
    public static Connection conn;
    public static Connection koneksi(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost/toko_buku_compleks", "root", "");
            System.out.println("koneksi Berhasil");            
        } catch (SQLException e) {
            System.err.println("Koneksi Gagal!!" + e.getMessage());
        }
        return conn;        
    }   
    public static void main(String[] args) {
        koneksi();
    }
}
