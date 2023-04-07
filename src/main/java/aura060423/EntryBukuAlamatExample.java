/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura060423;

/**
 *
 * @author ACER
 */
public class EntryBukuAlamatExample {
    public static void main(String [] args){
        EntryBukuAlamat anna = new EntryBukuAlamat("Anna","Padang","0812123455","anna@gmail.com");
        
        anna.print("");
       
        System.out.println("Jumlah Record    : "+ EntryBukuAlamat.getEntryBukuCount());
    }
}
