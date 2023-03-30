/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura300323;

/**
 *
 * @author ACER
 */
public class Aritmatika {
    /* public static void main(String [] args){
        int a = 11;
        System.out.println("a : "+a);
        int b = 12;
        System.out.println("b : "+b);
        Tambah(a,b);
        CekGanjil(a);
        
    }
    public static void Tambah (int a, int b){
        int tambah = a+b;
        System.out.println("a + b = "+tambah);
    }
    public static void CekGanjil (int a){
        if(a % 2 == 1){
            System.out.println("a adalah Angka ganjil");
        } else{
            System.out.println("a adalah Angka Genap");    
        }
    }
    */
        public int tambah(int a, int b)
        {
            return (a+b);
        }
        public boolean cekGanjil(int a)
        {
            return (a%2!=0);
        }
        public static int [] getGanjil(int n){
            int [] ganjil = new int[n];
            int j =0;
            
            for(int i=1;j<n;i+=2)
            {
                ganjil[j]=i;
                j++;
            }
            return ganjil;
        }
        public static int[] getPrima(int m) {
        int[] prima = new int[m];
        int num = 2;
        int count = 0;
        
        while (count < m) {
            if (isPrima(num)) {
                prima[count] = num;
                count++;
            }
            num++;
        }
        return prima;
        }
    
        public static boolean isPrima(int num) {
            if (num <= 1) {
               return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}