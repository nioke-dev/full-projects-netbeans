/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivan.ppdbonline.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ivanlubuntu
 */
public class C_Config {
    static Connection conn;
    static Statement stmt;
    
    public void config() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db_ppdbapps", "root", "");
            stmt = conn.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static Connection configDB() {
        try {
            String url = "jdbc:mysql://localhost/db_ppdbapps";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("koneksi berhasil");
        } catch (Exception e) {
            System.err.println("Koneksi gagal "+ e.getMessage());
        }
        return conn;
    }
    public static void main(String[] args) {
        configDB();
    }
}
