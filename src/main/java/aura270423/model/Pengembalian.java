/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura270423.model;

/**
 *
 * @author ACER
 */
public class Pengembalian {
    
    private Peminjaman peminjaman;
    private String tglPengembalian;
    private int terlambat;
    private double denda;

    public Peminjaman getPeminjaman() {
        return peminjaman;
    }

    public void setPeminjaman(Peminjaman peminjaman) {
        this.peminjaman = peminjaman;
    }
    
    public String getTglPengembalian(){
        return tglPengembalian;
    }
    
    public void setTglPengembalian(String tglPengembalian){
        this.tglPengembalian=tglPengembalian;
    }
    
    public int getTerlambat(){
        String tglKembali = peminjaman.getTglkembali();
        String tglPengembalian = this.tglPengembalian;
        
        return terlambat;
    }
    
    public double getDenda(){
        denda = terlambat * 500;
        return denda;
    }
}
