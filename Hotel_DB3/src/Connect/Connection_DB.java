/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DUY
 */
public class Connection_DB {
    public static Connection getConnect(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=hotel_DB3","sa","1234$");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Connection_DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static ResultSet executeQuery(String sql,Object... params){
        try {
            Connection conn = Connection_DB.getConnect();
            CallableStatement cs = conn.prepareCall(sql);
            if (params.length > 0) {
                int i = 1;
                for (Object param : params) {
                    cs.setObject(i, param);
                    i++;
                }
            }
            return cs.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Connection_DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static int executeUpdate(String sql,Object... params){
        try {
            Connection conn = Connection_DB.getConnect();
            CallableStatement cs = conn.prepareCall(sql);
            if (params.length > 0 && params != null) {
                int i = 1;
                for (Object param : params) {
                    cs.setObject(i, param);
                    i++;
                }
            }
            return cs.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Connection_DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
