/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura120423;

/**
 *
 * @author ACER
 */
public class ExtendStudentRecord extends StudentRecord{
    
     public ExtendStudentRecord(){ 
        super(90,92,91) ;
        super.name = "Aura";
        super.address = "Padang";
        super.age = 12;
        System.out.println("Inside Student:Constructor"); 
    //beberapa kode di sini 
    } 
     @Override 
    public String getName(){ 
        System.out.println("getName ExtendStudentRecord");
        return name; 
    } 
    @Override
    public double getmathGrade(){
        return mathGrade; 
    }
    @Override
    public double getenglishGrade(){
        return englishGrade; 
    }
    @Override
    public double getscienceGrade(){
        return scienceGrade; 
    }
    @Override
    public double getaverage(){
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }

    public static void main(String [] args){
        ExtendStudentRecord extendStudentRecord = new ExtendStudentRecord();
        extendStudentRecord.setName("Ali");
        extendStudentRecord.name = "Aura";
        extendStudentRecord.setName("Aura");
        extendStudentRecord.setAddress("Padang");
        
    }
}
