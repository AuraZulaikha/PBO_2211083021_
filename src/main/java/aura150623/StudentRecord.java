/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura150623;


/**
 *
 * @author ACER
 */
public class StudentRecord { // latihan modul 11 no 1
    protected String name; 
    protected String address; 
    protected int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average; 
    
    //area penulisan kode selanjutnya 
    
    private static int studentCount;
    
    public StudentRecord(){
        System.out.println("Inside Person:Constructor"); 
        name = ""; 
        address = ""; 
        age = 0;
    }
    
    public StudentRecord(String name, String address, int age){
        this.name = name; 
        this.address = address; 
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getAge(){
        return age; 
    }
    public void setAge(int age){
        this.age = age;
    }
    public double getmathGrade(){
        return mathGrade; 
    }
    public void setmathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    public double getenglishGrade(){
        return englishGrade; 
    }
    public void setenglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    public double getscienceGrade(){
        return scienceGrade; 
    }
    public void setscienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    public double getaverage(){
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
    public static int  getstudentCount(){
        return studentCount;
        
    }
    public void print( String temp ){ 
        System.out.println("Name              : " + name); 
        System.out.println("Address           : " + address); 
        System.out.println("Age               : " + age); 
    } 
    public void print1(double eGrade, double mGrade, double sGrade) {
        System.out.println("Name              : " + name); 
        System.out.println("Math Grade        : " + mGrade); 
        System.out.println("English Grade     : " + eGrade); 
        System.out.println("Science Grade     : " + sGrade); 
    }  
} 
