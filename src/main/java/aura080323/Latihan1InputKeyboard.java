/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura080323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author ACER
 */
public class Latihan1InputKeyboard {
    public static void main (String [] args ){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader ( System.in));
        int number = 0;
        char letter = "";
        boolean result = true;
        String str = "";
        
        try {
        System.out.print("Number : ");
        number = Integer.parseInt(dataIn.readLine());
        System.out.print("Letter : ");
        nilai = Integer.parseInt(dataIn.readLine());
        }catch (IOException e){
            System.out.println("Error!");
        }
        System.out.println("Hello "+name+"!");  
        System.out.println("Nilai Matematika : "+nilai);
    }   
}
