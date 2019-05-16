/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Produk;
import java.sql.Statement;
/**
 *
 * @author FDLY
 */
public class ExecuteProduk {
    ConnectionManager conMan = new ConnectionManager();
    
    public String InsertProduk (Produk pr){
        String query ="INSERT INTO produk (id_produk, nama_produk,harga_produk, stok)Values(?,?,?,?)";       
        Connection conn = conMan.Logon();
        System.out.println("cek");
        String Respon;
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, pr.getKode());
            pstm.setString(2, pr.getNama());
            pstm.setString(3, pr.getHarga());
            pstm.setString(4, pr.getStok());
            pstm.executeUpdate();
            pr.toString();
            Respon="Insert Sukses";
        } catch (SQLException ex) {
            Respon="Insert Gagal";
            Logger.getLogger(ExecuteProduk.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
        return Respon;
    }
    
    public String UpdateProduk(Produk pr){
        String hasil="";
        String query ="update produk SET nama_produk='"+pr.getNama()+"',harga_produk='"+pr.getHarga()+"',Stok='"+pr.getStok()+"'where id_produk='"+pr.getKode()+"'";
        
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
    
        public String cariProduk (String id, String pr){
        String hasil ="";
        String query="select * from produk where '"+id+"' = '"+pr+"' ";
        Connection conn = conMan.Logon();
        System.out.println("Masuk");
        try {
            Statement stm = conn.createStatement();
            stm.executeQuery(query);
            hasil="Berhasil";
        } catch (SQLException ex) {
            hasil="Gagal";
            Logger.getLogger(ExecuteProduk.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
        return hasil;  
        }

        public String deleteProduk(String pr){
        String hasil ="";
        String query="delete from produk where id_produk='"+pr+"'";
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
