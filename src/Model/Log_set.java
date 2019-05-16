/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author FDLY
 */
public class Log_set {
    String nama, id;

    public Log_set() {
    }
    
    public Log_set(String nama) {
        this.nama = nama;
    }

    public Log_set(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "nama=" + nama + ", id=" + id ;
    }
    
    
}
