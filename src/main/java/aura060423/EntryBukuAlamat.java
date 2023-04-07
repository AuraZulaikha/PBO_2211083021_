/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura060423;

/**
 *
 * @author ACER
 */
public class EntryBukuAlamat {
    private String Nama;
    private String Alamat;
    private String Telepon;
    private String Email;
    
    public EntryBukuAlamat(){
        EntryBukuCount++;
    }
     public EntryBukuAlamat(String temp){ 
        this.Nama = temp; 
        this.Alamat = temp;
        this.Telepon = temp;
        this.Email = temp;
        EntryBukuCount++;
    } 
    
    public EntryBukuAlamat(String Nama, String Alamat, String Telepon, String Email){ 
        this.Nama = Nama; 
        this.Alamat = Alamat;
        this.Telepon = Telepon; 
        this.Email = Email;
        
        EntryBukuCount++;
    } 
    private static int EntryBukuCount;
    
    public String getNama(){
        return Nama;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public String getAlamat(){
        return Alamat;
    }
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    public String getTelepon(){
        return Telepon; 
    }
    public void setTelepon(String Telepon){
        this.Telepon = Telepon;
    }
    public String getEmail(){
        return Email; 
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
   
    public static int  getEntryBukuCount(){
        return EntryBukuCount;
        
    }
    public void print( String temp ){ 
        System.out.println("Nama             : " + Nama); 
        System.out.println("Alamat           : " + Alamat); 
        System.out.println("Nomor Telepon    : " + Telepon); 
        System.out.println("Alamat E-Mail    : " + Email); 
    } 
}