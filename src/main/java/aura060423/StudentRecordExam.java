/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura060423;

/**
 *
 * @author ACER
 */
public class StudentRecordExam {
    public static void main(String [] args){
        StudentRecord anna = new StudentRecord("Anna","Padang"); 
        anna.print("");
        
        System.out.println("Jumlah Record     : "+StudentRecord.getstudentCount());
    }
}
