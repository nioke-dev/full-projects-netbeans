/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {
    private static Connection conn;
    public static Connection koneksi(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //direktori jdbc to--> class mysql to--> localhost server to--> nama database to--> username to--> password
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sekolah", "root", "");
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            System.err.println("koneksi gagal");
        }
        return conn;
    }
    
    public static void main(String[] args) {
        koneksi();
    }
}
