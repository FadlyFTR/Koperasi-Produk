/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasiproduk;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author FDLY
 */
@Entity
@Table(name = "produk", catalog = "koperasiproduk", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produk.findAll", query = "SELECT p FROM Produk p"),
    @NamedQuery(name = "Produk.findByKode", query = "SELECT p FROM Produk p WHERE p.kode = :kode"),
    @NamedQuery(name = "Produk.findByNama", query = "SELECT p FROM Produk p WHERE p.nama = :nama"),
    @NamedQuery(name = "Produk.findByHarga", query = "SELECT p FROM Produk p WHERE p.harga = :harga"),
    @NamedQuery(name = "Produk.findByStok", query = "SELECT p FROM Produk p WHERE p.stok = :stok")})
public class Produk implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Kode")
    private String kode;
    @Basic(optional = false)
    @Column(name = "Nama")
    private String nama;
    @Column(name = "Harga")
    private Integer harga;
    @Column(name = "Stok")
    private Integer stok;

    public Produk() {
    }

    public Produk(String kode) {
        this.kode = kode;
    }

    public Produk(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        String oldKode = this.kode;
        this.kode = kode;
        changeSupport.firePropertyChange("kode", oldKode, kode);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        Integer oldHarga = this.harga;
        this.harga = harga;
        changeSupport.firePropertyChange("harga", oldHarga, harga);
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        Integer oldStok = this.stok;
        this.stok = stok;
        changeSupport.firePropertyChange("stok", oldStok, stok);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kode != null ? kode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produk)) {
            return false;
        }
        Produk other = (Produk) object;
        if ((this.kode == null && other.kode != null) || (this.kode != null && !this.kode.equals(other.kode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "koperasiproduk.Produk[ kode=" + kode + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
