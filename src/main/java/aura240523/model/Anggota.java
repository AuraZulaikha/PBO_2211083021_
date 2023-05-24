/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura240523.model;

/**
 *
 * @author ACER
 */
public class Anggota {
    private String nobp;
    private String nama;
    private String alamat;
    private String jenisKelamin;
    
    public Anggota(){
        
    }
    
    public Anggota(String nobp, String nama, String alamat, String jenisKelamin){
        this.nobp = nobp;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNobp() {
        return nobp;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}
