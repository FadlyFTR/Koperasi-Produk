package koperasiproduk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionManager {
    private Connection conn;
    private String driver="com.sql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/koperasiproduk";
    private String user="root";
    private String pass="";
    private com.mysql.jdbc.Connection mysqlconfig;
    
    public Connection Logon(){
        
        try{
           conn = DriverManager.getConnection(url,user,pass);
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//            mysqlconfig=(com.mysql.jdbc.Connection)DriverManager.getConnection(url, user, pass);
           System.out.println("Koneksi Tersedia");
        }catch (SQLException ex){
             System.err.println("koneksi gagal "+ex.getMessage());
        }
        return conn;
    }
    
    public void Logoff(){
        try{
            conn.close();
        }catch (SQLException ex){
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
