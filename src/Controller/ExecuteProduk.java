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
/**
 *
 * @author FDLY
 */
public class ExecuteProduk {
    ConnectionManager conMan = new ConnectionManager();
    
    public String InsertProduk (Produk pr){
        String query ="INSERT INTO koperasiproduk (id_produk, nama_produk, harga_produk)Values(?,?,?)";       
        Connection conn = conMan.Logon();
        System.out.println("cek");
        String Respon;
        try {
            System.out.println("cek");
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, pr.getKode());
            System.out.println("cek");
            pstm.setString(2, pr.getNama());
            System.out.println("cek");
            pstm.setString(3, pr.getHarga());
            System.out.println("cek");
//          pstm.setString(4, pr.getStok());
            pstm.executeQuery();
            Respon="Insert Sukses";
        } catch (SQLException ex) {
            Respon="Insert Gagal";
            Logger.getLogger(ExecuteProduk.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.Logoff();
        return Respon;
    }
}
