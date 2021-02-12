
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author The Coders
 */
public class Koneksi {
    private static Connection conn;
    public static Connection koneksi(){
        try{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());       
        conn = DriverManager.getConnection("jdbc:mysql://localhost/db_ppdb", "root", "");
        System.out.println("koneksi Berhasil");        
        }catch(SQLException e){
            System.err.println("koneksi Gagal");
        }
        return conn;
    }
    public static void main(String[] args) {
        koneksi();
    }
    
}
