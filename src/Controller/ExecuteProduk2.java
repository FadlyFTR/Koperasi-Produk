/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.ConnectionManager;
import Model.Produk2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author M Rafi
 */
public class ExecuteProduk2 {
   ConnectionManager conMan = new ConnectionManager();
   
   public String InsertProduk2 (Produk2 pr2){
        String query ="INSERT INTO produk (id_produk, nama_produk,harga_produk, stok)Values(?,?,?,?)";       
        Connection conn = conMan.Logon();
        System.out.println("cek");
        String Respon;
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, pr2.getKode());
            pstm.setString(2, pr2.getNama());
            pstm.setString(3, pr2.getHarga());
            pstm.setString(4, pr2.getStok());
            pstm.executeUpdate();
            pr2.toString();
            Respon="Insert Sukses";
        } catch (SQLException ex) {
            Respon="Insert Gagal";
            Logger.getLogger(ExecuteProduk.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
        return Respon;
    }
   
     public String UpdateProduk2(Produk2 pr2){
        String hasil="";
        String query ="update produk SET nama_produk='"+pr2.getNama()+"',harga_produk='"+pr2.getHarga()+"',Stok='"+pr2.getStok()+"'where id_produk='"+pr2.getKode()+"'";
        
        // 
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
        try {
            Statement stm = conn.createStatement();
             stm.executeUpdate(query);
             hasil="Berhasil";
        } catch (SQLException ex) {
            hasil="Gagal";
            Logger.getLogger(ExecuteProduk.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
        return hasil;   
    }
     
     public String deleteProduk2(String pr2){
        String hasil ="";
        String query="delete from produk where id_produk='"+pr2+"'";
        Connection conn = conMan.Logon();
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            hasil="Berhasil";
        } catch (SQLException ex) {
            hasil="Gagal";
            Logger.getLogger(ExecuteProduk.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
        return hasil;  
    }
   
}
