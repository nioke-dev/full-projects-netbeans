/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_3;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author NIOKE
 */
public class koneksi {
    public static Connection conn;
    public static Connection koneksi(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost/latihan_update", "root", "");
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            System.err.println("koneksi gagal" + e.getMessage());
        }
        return conn;
    }
    public static void main(String[] args) {
        koneksi();
    }
}
