/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Phuoc Vinh
 */
public class Connect {
    
    public Connection getConnection()
    {
       Connection conn = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://Localhost:1433;databaseName=QL_SINHVIEN","sa","123");
            if(conn != null)
            {
                System.out.println("ket noi thanh cong!");  
            }
            
        }catch(Exception ex)
        {
            System.out.println(ex.toString());
            
        }
        return conn;
        
    }
    
}
