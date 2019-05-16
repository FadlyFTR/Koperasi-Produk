/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

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
 * @author HP
 */
@Entity
@Table(name = "produk", catalog = "koperasiproduk", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produk.findAll", query = "SELECT p FROM Produk p"),
    @NamedQuery(name = "Produk.findByIdProduk", query = "SELECT p FROM Produk p WHERE p.idProduk = :idProduk"),
    @NamedQuery(name = "Produk.findByNamaProduk", query = "SELECT p FROM Produk p WHERE p.namaProduk = :namaProduk"),
    @NamedQuery(name = "Produk.findByHargaProduk", query = "SELECT p FROM Produk p WHERE p.hargaProduk = :hargaProduk"),
    @NamedQuery(name = "Produk.findByStok", query = "SELECT p FROM Produk p WHERE p.stok = :stok")})
public class Produk implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_produk")
    private String idProduk;
    @Basic(optional = false)
    @Column(name = "nama_produk")
    private String namaProduk;
    @Basic(optional = false)
    @Column(name = "harga_produk")
    private int hargaProduk;
    @Column(name = "Stok")
    private Integer stok;

    public Produk() {
    }

    public Produk(String idProduk) {
        this.idProduk = idProduk;
    }

    public Produk(String idProduk, String namaProduk, int hargaProduk) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
    }

    public String getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(String idProduk) {
        String oldIdProduk = this.idProduk;
        this.idProduk = idProduk;
        changeSupport.firePropertyChange("idProduk", oldIdProduk, idProduk);
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        String oldNamaProduk = this.namaProduk;
        this.namaProduk = namaProduk;
        changeSupport.firePropertyChange("namaProduk", oldNamaProduk, namaProduk);
    }

    public int getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(int hargaProduk) {
        int oldHargaProduk = this.hargaProduk;
        this.hargaProduk = hargaProduk;
        changeSupport.firePropertyChange("hargaProduk", oldHargaProduk, hargaProduk);
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
        hash += (idProduk != null ? idProduk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produk)) {
            return false;
        }
        Produk other = (Produk) object;
        if ((this.idProduk == null && other.idProduk != null) || (this.idProduk != null && !this.idProduk.equals(other.idProduk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GUI.Produk[ idProduk=" + idProduk + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
