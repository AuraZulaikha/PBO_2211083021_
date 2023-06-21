/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura150623;

/**
 *
 * @author ACER
 */
public class ExtendStudentRecord extends StudentRecord { // Latihan modul 11 no 1
    private int nilaiPBO;
    private int nilaiJaringan;
    
    public ExtendStudentRecord () {
        super("Aura","Padang",18);
        System.out.println("Inside Student:Constructor"); 
    }
    
    
    @Override
    public String getName(){
        System.out.println("Student: getName"); 
        return name;
    }
    
    @Override
    public String getAddress(){
        System.out.println("Student: getAddress"); 
        return address;
    }
    
    @Override
    public int getAge(){
        System.out.println("Student: getAge"); 
        return age;
    }
    
    public void print() {
        System.out.println("nilai PBO : " + nilaiPBO);
        System.out.println("nilai Jaringan : " + nilaiJaringan);
    }
    
    public void setNilaiPBO(int nilaiPBO) {
        this.nilaiPBO = nilaiPBO;
    }
    
    public void setNilaiJaringan(int nilaiJaringan) {
        this.nilaiJaringan= nilaiJaringan;
    }
    
    
    public static void main(String[] args) {
        ExtendStudentRecord student = new ExtendStudentRecord();
        student.name = "Aura";
        student.address ="Padang";
        student.age = 18;
        
        
        student.setNilaiPBO(96);
        
        student.setNilaiJaringan(97);
        
        System.out.println("Updated information:");
        System.out.println();
        System.out.println("Nama    : "+student.name);
        System.out.println("Address : "+student.address);
        System.out.println("Age     : "+student.age);
        student.print();
    }
}
