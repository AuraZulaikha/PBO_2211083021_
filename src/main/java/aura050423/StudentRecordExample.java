/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura050423;

/**
 *
 * @author ACER
 */
public class StudentRecordExample {
    public static void main (String[] args){
        StudentRecord annaRecord = new StudentRecord ();
        StudentRecord crisRecord = new StudentRecord ();
        
        annaRecord.setName("Anna ");
        annaRecord.setAddress("Padang ");
        annaRecord.setAge(20);
        annaRecord.setmathGrade(90);
        annaRecord.setenglishGrade(88);
        annaRecord.setscienceGrade(92);
        
        // Menampilkan data anna
        System.out.println("=== Data Anna ===");
        System.out.println("Nama              : "+annaRecord.getName());
        System.out.println("Alamat            : "+annaRecord.getAddress());
        System.out.println("Umur              : "+annaRecord.getAge());
        System.out.println("Nilai MTK         : "+annaRecord.getmathGrade());
        System.out.println("Nilai English     : "+annaRecord.getenglishGrade());
        System.out.println("Nilai IPA         : "+annaRecord.getscienceGrade());
        System.out.println("Rerata Nilai      : "+annaRecord.getaverage());
        
        crisRecord.setName("Cris ");
        crisRecord.setAddress("UK ");
        crisRecord.setAge(22);
        crisRecord.setmathGrade(95);
        crisRecord.setenglishGrade(98);
        crisRecord.setscienceGrade(90);
        
         // Menampilkan data cris
        System.out.println("=== Data Cris ===");
        System.out.println("Nama              : "+crisRecord.getName());
        System.out.println("Alamat            : "+crisRecord.getAddress());
        System.out.println("Umur              : "+crisRecord.getAge());
        System.out.println("Nilai MTK         : "+crisRecord.getmathGrade());
        System.out.println("Nilai English     : "+crisRecord.getenglishGrade());
        System.out.println("Nilai IPA         : "+crisRecord.getscienceGrade());
        System.out.println("Rerata Nilai      : "+crisRecord.getaverage());
        
        // Menamilkan data ali
        System.out.println("=== Data Ali===");
        StudentRecord aliRecord = new StudentRecord ();
        aliRecord.setName("Ali ");
        aliRecord.setAddress("Madinah ");
        aliRecord.setAge( 19);
        
        aliRecord.print("");
        aliRecord.print(99,94,91);
        
        System.out.println("Count = "+StudentRecord.getstudentCount());
    }
}