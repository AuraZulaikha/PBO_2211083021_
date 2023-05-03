/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura130423;

/**
 *
 * @author ACER
 */
public class Lingkaran implements Relation{
    private double r; 
    
    public Lingkaran (double r){ 
        this.r =  r;
    }
    
    public Lingkaran(){
        
    }
     public boolean isGreater( Object a, Object b){ 
        double aLen = ((Line)a).getLength(); 
        double bLen = ((Line)b).getLength(); 
        return (aLen > bLen); 
    } 
 
    public boolean isLess( Object a, Object b){ 
        double aLen = ((Line)a).getLength(); 
        double bLen = ((Line)b).getLength(); 
        return (aLen < bLen); 
 
    } 
 
    public boolean isEqual( Object a, Object b){ 
        double aLen = ((Line)a).getLength(); 
        double bLen = ((Line)b).getLength(); 
        return (aLen == bLen); 
    }
}
