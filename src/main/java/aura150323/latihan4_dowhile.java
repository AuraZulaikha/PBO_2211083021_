/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura150323;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class latihan4_dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        System.out.print("Masukkan pangkat: ");
        int pangkat = input.nextInt();

        int hasil = 1;
        int i = 0;
        do {
            hasil = hasil * angka;
            i++;
        } while (i < pangkat);

        System.out.println(angka + " pangkat " + pangkat + " = " + hasil);
    } 
}
