/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aekkawat
 */
public class HelloWorld {
    public  String getText() throws SQLException{
        String text = "" ;
        
        Connection conn = ConnectionBuilder.getConnection();
        
        Statement stat = conn.createStatement();
        
        ResultSet rs = stat.executeQuery("select text from helloworld where id = 1 ;");
        
        if (rs.next()) {
            text = rs.getString("text"); //"text" is name column
        }
        return text ; 
    }
    
  
 
    

    
        
        
}
