/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "order", catalog = "koperasiproduk", schema = "")
@NamedQueries({
    @NamedQuery(name = "Order1.findAll", query = "SELECT o FROM Order1 o"),
    @NamedQuery(name = "Order1.findByIdOrder", query = "SELECT o FROM Order1 o WHERE o.idOrder = :idOrder"),
    @NamedQuery(name = "Order1.findByIdCust", query = "SELECT o FROM Order1 o WHERE o.idCust = :idCust"),
    @NamedQuery(name = "Order1.findByTglOrder", query = "SELECT o FROM Order1 o WHERE o.tglOrder = :tglOrder"),
    @NamedQuery(name = "Order1.findByStatus", query = "SELECT o FROM Order1 o WHERE o.status = :status")})
public class Order1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_order")
    private Integer idOrder;
    @Basic(optional = false)
    @Column(name = "id_cust")
    private int idCust;
    @Basic(optional = false)
    @Column(name = "tgl_order")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tglOrder;
    @Basic(optional = false)
    @Column(name = "Status")
    private String status;

    public Order1() {
    }

    public Order1(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Order1(Integer idOrder, int idCust, Date tglOrder, String status) {
        this.idOrder = idOrder;
        this.idCust = idCust;
        this.tglOrder = tglOrder;
        this.status = status;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        Integer oldIdOrder = this.idOrder;
        this.idOrder = idOrder;
        changeSupport.firePropertyChange("idOrder", oldIdOrder, idOrder);
    }

    public int getIdCust() {
        return idCust;
    }

    public void setIdCust(int idCust) {
        int oldIdCust = this.idCust;
        this.idCust = idCust;
        changeSupport.firePropertyChange("idCust", oldIdCust, idCust);
    }

    public Date getTglOrder() {
        return tglOrder;
    }

    public void setTglOrder(Date tglOrder) {
        Date oldTglOrder = this.tglOrder;
        this.tglOrder = tglOrder;
        changeSupport.firePropertyChange("tglOrder", oldTglOrder, tglOrder);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrder != null ? idOrder.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Order1)) {
            return false;
        }
        Order1 other = (Order1) object;
        if ((this.idOrder == null && other.idOrder != null) || (this.idOrder != null && !this.idOrder.equals(other.idOrder))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GUI.Order1[ idOrder=" + idOrder + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
