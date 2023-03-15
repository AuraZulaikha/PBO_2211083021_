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
public class Latihan2GetInputReader {
    public static void main (String [] args ){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
        int a;
        int b;
        int c;
        int avg; //rata-rata
        
        try {
            System.out.print("Entri Number 1 : ");
            a = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri Number 2 : ");
            b = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri Number 3 : ");
            c = Integer.parseInt(dataIn.readLine());
            avg = (a+b+c)/3;
            System.out.println("Average is : "+avg);
        }catch(Exception ex){
        }
    }
}
