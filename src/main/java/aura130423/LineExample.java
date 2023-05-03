/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura130423;

/**
 *
 * @author ACER
 */
public class LineExample {
    
    public static void main (String [] args ){
        Relation myInteger = new MyInteger();
        Relation myDouble = new MyDouble();
        boolean hasilInt = myInteger.isGreater(5,6);
        boolean hasilDbl = myDouble.isGreater(6.4,2.2);
        System.out.println("Hasil Integer "+ hasilInt);
        System.out.println("Hasil Double "+ hasilDbl);
        
        Relation myline = new Line();
        Line line1 = new Line(2, 5, 2, 7);
        Line line2 = new Line(2, 5, 2, 2);
        boolean lineA_lineB = myline.isGreater(line1,line2);
        System.out.println("Line A > Line B "+lineA_lineB);
    } 
}