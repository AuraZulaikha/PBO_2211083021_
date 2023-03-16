/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura160323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class latihan2_nomorTerbesar {
    public static void main(String[] args) throws IOException {
        
        int[] angka = new int[10];
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog(null, "Masukkan angka ke-" + (i+1) + ":");
            angka[i] = Integer.parseInt(input);
        }
        
        int terbesar = angka[0];
        
        for (int i = 1; i < 10; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }
        }
        
        JOptionPane.showMessageDialog(null, "Angka terbesar yang dimasukkan adalah " + terbesar);
    }      
}
