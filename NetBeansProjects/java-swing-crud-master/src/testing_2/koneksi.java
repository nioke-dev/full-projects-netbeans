/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing_2;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author The Coders
 */
public class koneksi {
    private static Connection conn;
    public static Connection koneksi(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            DriverManager.getConnection("jdbc:mysql://localhost/test_img", "root", "");
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public static void main(String[] args) {
        koneksi();
    }
}
