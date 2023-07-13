/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author DELL
 */

public class connect {
       
    static Connection con;
    public static Connection connect() throws ClassNotFoundException, SQLException
    {
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-K0JBMP71\\SQLEXPRESS01:62638;databaseName=CustomerModule", 
                    "sayed", "1359");
         return con;
    }

    
}
