/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NIOKE
 */
public class koneksi {
    private static Connection conn;
    public static Connection koneksi(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/latihan_update", "root", "");
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
