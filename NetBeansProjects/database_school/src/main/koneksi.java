/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


/**
 *
 * @author NIOKE
 */
public class koneksi {
    private static Connection conn;
    public static Connection koneksi(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/school", "root", "");
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
