/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author M Rafi
 */
public class Produk2 {
    private String Kode, nama, harga, stok;

    public Produk2() {
    }
    
    public Produk2(String Kode, String nama, String harga, String stok) {
        this.Kode = Kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKode() {
        return Kode;
    }

    public void setKode(String Kode) {
        this.Kode = Kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "Produk2{" + "Kode=" + Kode + ", nama=" + nama + ", harga=" + harga + ", stok=" + stok + '}';
    }
    
    
    
}
