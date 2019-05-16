/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author HP
 */
public class Pembayaran {
    private String Nama, Email, notelfon, alamat;

    public Pembayaran() {
    }

    public Pembayaran(String Nama, String email , String notelfon, String alamat) {
        this.Nama = Nama;
        this.Email = email;
        this.notelfon = notelfon;
        this.alamat = alamat;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String nama) {
        this.Email = Email;
    }

    public String getNoTelfon() {
        return notelfon;
    }

    public void setNoTelfon(String notelfon) {
        this.notelfon = notelfon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Pembayaran{" + "Nama=" + Nama + ", Email=" + Email + ", notelfon=" + notelfon + ", alamat=" + alamat + '}';
    }
    
}
