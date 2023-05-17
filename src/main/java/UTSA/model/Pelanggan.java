/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSA.model;

/**
 *
 * @author ACER
 */
public class Pelanggan {
    private String kodePelanggan;
    private String nama;
    private String meterBulanIni;
    private String meterBulanLalu;
    private String tarif;
    private String diskon;
    
    public Pelanggan(){
        
    }
    
    public Pelanggan(String kodePelanggan, String nama, String meterBulanIni, String meterBulanLalu, String tarif, String diskon){
        this.kodePelanggan = kodePelanggan;
        this.nama = nama;
        this.meterBulanIni = meterBulanIni;
        this.meterBulanLalu = meterBulanLalu;
        this.tarif = tarif;
        this.diskon = diskon;
    }
    
    public String getKodePelanggan(){
        return kodePelanggan;      
    }
    public void setKodePelanggan (String kodePelanggan ){
        this.kodePelanggan = kodePelanggan;
    }
    
    public String getNama(){
        return nama; 
    }
    public void setNama (String nama){
        this.nama = nama ;
    }
    
    public String getMeterBulanIni(){
        return meterBulanIni;
    }
    public void setMeterBulanIni(String meterBulanIni){
        this.meterBulanIni = meterBulanIni;
    } 
    
    public String getMeterBulanLalu(){
        return meterBulanLalu;
    }
    public void setMeterBulanLalu (String meterBulanLalu){
        this.meterBulanLalu= meterBulanLalu;
    }
    public String getTarif(){
        return tarif;
    }
    public void setTarif(String tarif){
        this.tarif = tarif;
    }
    public String getDiskon(){
        return diskon;
    }
    public void setDiskon(String diskon){
        this.diskon = diskon;
    }
}
