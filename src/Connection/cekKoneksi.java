/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import koperasiproduk.ConnectionManager;
import java.sql.Connection;

/**
 *
 * @author FDLY
 */
public class cekKoneksi {
    public static void main(String[] args) {
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
        System.out.println("CEK");
    }
}
