/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura150323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;
// LATIHAN 1 MODUL 6
/**
 *
 * @author ACER
 */
public class Latihan1_Nilai {
    public static void main(String [] args ) throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
        int a ;
        int b;
        int c;
        int avg =0 ;
        String face;
        
        try {
            System.out.print("Entri Nilai ujian 1 : ");
            a = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri Nilai ujian 2 : ");
            b = Integer.parseInt(dataIn.readLine());
            System.out.print("Entri Nilai ujian 3 : ");
            c = Integer.parseInt(dataIn.readLine());
            avg = (a+b+c)/3;
            
        }catch(IOException e){
            System.out.println("Error ");
            e.printStackTrace();
        }   
        if (avg < 60 )
            face = ":-(";
        else 
            face = ":-)";
        
        System.out.print("Rata = "+avg+face);
        
        String inputA = JOptionPane.showInputDialog("Nilai ujian 1 : ");
        String inputB = JOptionPane.showInputDialog("Nilai ujian 2 : ");
        String inputC = JOptionPane.showInputDialog("Nilai ujian 3 : ");
        
        a = Integer.parseInt(inputA);
        b = Integer.parseInt(inputB);
        c = Integer.parseInt(inputC);
        
        avg = (a+b+c)/3;
        
        String average = "Your Average is "+avg+face;
        JOptionPane.showInputDialog(null, average);
    }
}