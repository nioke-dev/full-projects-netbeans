/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Dao.Dao;
import Domain.Domain;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Acer Pc
 */
public class Service {
 Connection connection;
    Dao Dao;
    
    public Service(MysqlDataSource dataSource) throws SQLException{
        this.connection=dataSource.getConnection();
        Dao=new Dao();
        Dao.setConnection(connection);
    }
    
    public void save(Domain book){
        try{
            connection.setAutoCommit(false);
            Dao.save(book);
            connection.commit();
            connection.setAutoCommit(true);
        } catch(SQLException exception){
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public List<Domain> findAll(){
        try {
            return Dao.findAll();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }    
}
