/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura080323;
//LATIHAN 3 MODUL 4
/**
 *
 * @author ACER
 */
public class Latihan3 {
    public static void main (String [] args ){
        int number1 = 10,number2 = 23,number3 = 5;
        int max;
        
        System.out.println("Number 1 = "+number1);
        System.out.println("Number 2 = "+number2);
        System.out.println("Number 3 = "+number3);
        
        // mencari nilai tertinggi dengan operator kondisi
        max =(number2>=number1)?number2:number1;
        max =(number3>=max)?number3:max;
        System.out.println("Nilai terbersar adalah  "+max);
    }
}
