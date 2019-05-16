/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.ConnectionManager;
import GUI.Login;
import GUI.PengelolaanToko;
import Model.Log_set;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author FDLY
 */
public class LoginSet {
        ConnectionManager conMan = new ConnectionManager();
        PengelolaanToko pt = new PengelolaanToko();
        Login lg = new Login();
        Log_set ls = new Log_set();
        
        public String LoginForm (String user, String pass){
            String hasil ="";
        try {
            String sql = "SELECT * FROM customer WHERE username_cust ='"+user+"' AND password_cust='"+pass+"'";
            Connection conn = conMan.Logon();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if(rs.next()){
                if(user.equals(rs.getString("username_cust")) && pass.equals(rs.getString("password_cust"))){
                    JOptionPane.showMessageDialog(null, "berhasil login");
                    hasil = "Berhasil";
                    pt.setVisible(true);
                    lg.setVisible(false);
                    String id =rs.getString("id_cust");
                    String nama = rs.getString("nama_cust");
                    ls.setId(id);
                    ls.setNama(nama);
                    System.out.println(ls.toString());
                }
            }else{
                    JOptionPane.showMessageDialog(null, "username atau password salah");
                    hasil="Gagal";
                }
        } catch (SQLException ex) {
            hasil="Gagal";
            Logger.getLogger(ExecuteProduk.class.getName()).log(Level.SEVERE, null, ex);
        }
            conMan.Logoff();
            return hasil;
    }
}
