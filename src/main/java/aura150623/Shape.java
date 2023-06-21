/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura150623;

/**
 *
 * @author ACER
 */
public abstract class Shape { //  latihan modul 11 no 2
    private String name;
    
    Shape(String name) {
        name =name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract float getArea();
    
    }

class Circle extends Shape {
    private int jari2;
    Circle(String name) {
        super(name);
        jari2= 3;
    }
    public float getArea() {
        float area;
        area = (float) (3.14 * jari2 * jari2);
        return area;
    }
}

class Square extends Shape {
    private int sisi;
    Square(String name) {
        super(name);
        sisi = 3;
    }
    public float getArea() {
        int area;
        area = sisi * sisi;
        return area;
    }
}
