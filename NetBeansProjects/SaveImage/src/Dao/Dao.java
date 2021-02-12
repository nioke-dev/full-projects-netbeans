/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Domain.Domain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer Pc
 */
public class Dao {
 Connection connection;
    PreparedStatement preparedStatement;
    
    public void setConnection(Connection connection){
        this.connection=connection;
    }
    
    public void save(Domain Domain) throws SQLException{
            preparedStatement=connection.prepareStatement("insert into book(title,image) values(?,?)");
            preparedStatement.setString(1, Domain.getTitle());
            preparedStatement.setString(2, Domain.getImage());
            preparedStatement.executeUpdate();        
    }
    
    public Domain findOne(Integer id) throws SQLException{
        Domain book=new Domain();
        
        preparedStatement=connection.prepareStatement("SELECT * from book where id=?");
        preparedStatement.setInt(1, id);
        ResultSet rs=preparedStatement.executeQuery();
                    
        while(rs.next()){
            book.setId(rs.getInt("id"));
            book.setTitle(rs.getString("title"));
            book.setImage(rs.getString("image"));
        }
        return book;
    }
    
    public List<Domain> findAll() throws SQLException{
        List<Domain> listOfBook=new ArrayList<Domain>();
                     
        preparedStatement=connection.prepareStatement("select * from book");
        ResultSet rs=preparedStatement.executeQuery();
            
        while(rs.next()){
            Domain book=new Domain();
            book.setId(rs.getInt("id"));
            book.setTitle(rs.getString("title"));
            book.setImage(rs.getString("image"));
            listOfBook.add(book);
        }
        return listOfBook;
    }    
}
