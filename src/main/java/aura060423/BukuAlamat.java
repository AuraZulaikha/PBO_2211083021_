/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura060423;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ACER
 */
public class BukuAlamat {
    public static void main (String[] args) throws Exception{
        EntryBukuAlamat data[] = new EntryBukuAlamat[100];
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int pil=0;
        int index=0;
        
        while(pil !=5){
            System.out.println("");
            System.out.println("==============Menu===============");
            System.out.println("1. Entri Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Tampilkan");
            System.out.println("5. Exit");
            System.out.println("");
            System.out.print("Pilih Menu 1-5 : ");
            pil = Integer.parseInt(dataIn.readLine());
            System.out.println("=================================");
            switch(pil){
                case 1 :
                    EntryBukuAlamat temp = new EntryBukuAlamat();
                    System.out.println("         Isilah Data        ");
                    System.out.print("Nama      : ");
                    temp.setNama(dataIn.readLine());
                    System.out.print("Alamat    : ");
                    temp.setAlamat(dataIn.readLine());
                    System.out.print("Telepon   : ");
                    temp.setTelepon(dataIn.readLine());
                    System.out.print("Email     : ");
                    temp.setEmail(dataIn.readLine());
                    System.out.println("");
                    data[index] = temp;
                    index++;
                    break;
                    
                case 2:
                    System.out.println("");
                    System.out.print("Masukkan indeks data yang akan dihapus : ");
                    int idx = Integer.parseInt(dataIn.readLine());
                    if (idx >= 0 && idx < index) {
                        for (int i = idx; i < index - 1; i++) {
                            data[i] = data[i + 1];
                        }
                        index--;
                    } else {
                        System.out.println("Indeks tidak valid");
                    }
                    break;
                    
                case 3:
                    System.out.println("");
                    System.out.print("Masukkan indeks data yang akan diedit : ");
                    int idxEdit = Integer.parseInt(dataIn.readLine());
                    if (idxEdit >= 0 && idxEdit < index) {
                        EntryBukuAlamat dataEdit = data[idxEdit];
                        System.out.print("Nama            : ");
                        dataEdit.setNama(dataIn.readLine());
                        System.out.print("Alamat          : ");
                        dataEdit.setAlamat(dataIn.readLine());
                        System.out.print("Nomor Telepon   : ");
                        dataEdit.setTelepon(dataIn.readLine());
                        System.out.print("Alamat Email    : ");
                        dataEdit.setEmail(dataIn.readLine());
                    } else {
                        System.out.println("Indeks tidak valid");
                    }
                    break;
                         
                case 4:
                    System.out.println("");
                    System.out.println("");
                    System.out.println("=================================");
                    System.out.println("          Tampilan Data           ");
                    System.out.println("");
                    for(int i = 0; i < index; i++) {
                        data[i].print("");
                    }
                    break;
                    default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
            dataIn.close();
    }
}
