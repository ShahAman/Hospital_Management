/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.3
 */
package hospital_managent;

import java.sql.*;
import javax.swing.*;
public class JavaConnect {
     Connection conn=null;
    
    public static Connection dbConnector(){
    
        try{
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:sqlite:‪‪‪‪HMsqlite.sqlite");
       
   //  JOptionPane.showMessageDialog(null,"Connection Succesful");
        return conn;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
    }
    
}
