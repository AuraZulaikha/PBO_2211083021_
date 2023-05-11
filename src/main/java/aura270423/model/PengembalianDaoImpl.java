/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura270423.model;
import java.util.*;
/**
 *
 * @author ACER
 */
public class PengembalianDaoImpl implements PengembalianDao {
    
    List<Pengembalian> data = new ArrayList<>();
    
    public void save(Pengembalian pengembalian){
        data.add(pengembalian);
    }
    public void update(int idx, Pengembalian pengembalian){
        data.set(idx, pengembalian);
    }
    public void delete(int idx){
        data.remove(idx);
    }
    public Pengembalian getPengembalian(int idx){
        return data.get(idx);
    }
    public List<Pengembalian> getAllPengembalian(){
        return data;
    }
}
