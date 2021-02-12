/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_and_register;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NIOKE
 */
public class MyConnection {
    private static Connection conn;
    public static Connection Koneksi(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/java_login_register", "root", "");
            System.out.println("koneksi berhasil");
        } catch (SQLException e) {
            System.out.println("koneksi gagal");
        }
        return conn;
    }           
    public static void main(String[] args) {
        Koneksi();
    }
}
