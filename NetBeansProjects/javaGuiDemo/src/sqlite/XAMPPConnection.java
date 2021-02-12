package sqlite;

//import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

//import javax.swing.*;
//
//public class XAMPPConnection {
//        Connection conn = null;
//        public static Connection dbConnector(){
//            try{
//                Class.forName("org.sqlite.JDBC");
//                Connection conn = DriverManager.getConnection("jdbc:sqlite:‪C:\\Users\\fando\\Documents\\NetBeansProjects\\employeeData.db");
//                JOptionPane.showMessageDialog(null, "Connection succesful");
//                return conn;
//            }catch(Exception e){
//                JOptionPane.showMessageDialog(null, e);
//                return null;
//            }
//        }                   
//}


public class XAMPPConnection {
    private static Connection conn;
    public static Connection connect(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //direktori jdbc to--> class mysql to--> localhost server to--> nama database to--> username to--> password
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/employeedata", "root", "");
            JOptionPane.showMessageDialog(null, "connection succesfull");
            return conn;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
    public static void main(String[] args) {
        connect();
    }
}
