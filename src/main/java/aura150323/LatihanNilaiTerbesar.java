/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura150323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author ACER
 */
public class LatihanNilaiTerbesar {
    public static void main (String [] args ){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
        int a,b,c;
        
        try{
            System.out.print("Entri Nilai A : ");
            a = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri Nilai B : ");
            b = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri Nilai C : ");
            c = Integer.parseInt(dataIn.readLine());
            
           int max =0;
           
           if (a>max){
               max = a;
           }
           if (b>max){
               max = b;
           }
           if (c>max ){
               max = c;
           }
           
           System.out.println("Nilai Terbesar : "+max);
           
        }catch (Exception ex ){    
        }
    }  
}
