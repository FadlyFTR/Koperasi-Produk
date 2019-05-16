/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.ConnectionManager;
import Model.Pembelian;
import Model.Produk;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FDLY
 */
public class BeliProduk {
    ConnectionManager conMan = new ConnectionManager();
    
     public String deleteProduk(String pr){
        String hasil ="";
        String query="delete from detail where id_produk='"+pr+"'";
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
     
    public String InsertProduk (Pembelian beli){
        String query ="INSERT INTO detail (id_produk, jumlah)Values(?,?)";       
        Connection conn = conMan.Logon();
        System.out.println("cek");
        String Respon;
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, beli.getId_produk());
            pstm.setString(2, beli.getJumlah());
            pstm.executeUpdate();
            Respon="Insert Sukses";
        } catch (SQLException ex) {
            Respon="Insert Gagal";
            Logger.getLogger(ExecuteProduk.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
        return Respon;
    }
}
