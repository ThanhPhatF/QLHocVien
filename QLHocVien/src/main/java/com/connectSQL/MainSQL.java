/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.connectSQL;

import com.connectSQL.MainSQL;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author huyth
 */
public class MainSQL {
     static {
        try {
           Class.forName(SQLServerDriver.class.getName());
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static Connection getConnection(){
        String username = "sa";
        String password = "123";
        
        String url = "jdbc:sqlserver://DESKTOP-SSGE7DE;database=qlkhoahoc;integratedSecurity=false;user=sa;password=123;encrypt=true;trustServerCertificate=true;";        
        
        try {
            return  DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
                
    }
}
