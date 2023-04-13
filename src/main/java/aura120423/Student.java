/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura120423;

/**
 *
 * @author ACER
 */
public class Student extends Person { 
    
    public Student(){ 
        super("Budi","Padang");
        super.name = "Aura";
        super.address = "Padang";
        System.out.println("Inside Student:Constructor"); 
    //beberapa kode di sini 
    } 
    
    @Override 
    public String getName(){ 
        System.out.println("getName Student");
        return name; 
    } 
    
    public static void main(String [] args){
        Student student = new Student();
        student.setName("Ali");
        student.name = "Aura";
        student.setAddress("Arab");
        student.address = "Padang";
    }
}
