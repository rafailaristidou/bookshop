/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package secure;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Raphael
 */
public class MySqlconnect {
    Connection conn=null;
   


    public static Connection dbConnection()    {
        
        try{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        Connection conn=DriverManager.getConnection ("", "", "");
        
        return conn;
        }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
}
    }
}

