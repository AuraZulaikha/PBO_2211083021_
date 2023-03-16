/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura160323;
import java.util.Scanner;
// LATIHAN 1 MODUL 7 MENGGUNAKAN for LOOP
/**
 *
 * @author ACER
 */
public class latihan1_forloop {
     public static void main (String []args ){
        String days [] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        
        Scanner in = new Scanner(System.in);
        
        for(int i=0; i<days.length;i++){
            System.out.println("\t"+days[i]);
        }
    }
}