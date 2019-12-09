/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerges hanna FCI-H
 */
public class DBConnection {
    private static String URL = "jdbc:sqlserver://localhost;database=pharmacy;integratedSecurity=true;";
    public void makeConnection()
    {
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(URL); 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
