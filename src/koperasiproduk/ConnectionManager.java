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
    private String Username="root";
    private String Password="";
    
    public Connection Logon(){
        try{
            conn = DriverManager.getConnection(url,Username,Password);
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
