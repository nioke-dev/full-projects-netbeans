/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveimage;

import Service.Service;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import Gui.SaveImage;

/**
 *
 * @author Acer Pc
 */
public class SaveImageClass {

    private static Service Service;
    
    public static Service getService(){
        return Service;
    }

    public static void main(String[] args) throws SQLException {
         MysqlDataSource dataSource=new MysqlDataSource();
            dataSource.setUser("root");
            dataSource.setPassword("");
            dataSource.setServerName("localhost");
            dataSource.setDatabaseName("saveimagedb");
            
            Service=new Service(dataSource);
        new SaveImage().setVisible(true);
    }
}
