/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSA.model;
import java.util.*;
/**
 *
 * @author ACER
 */
public class PelangganDaoImpl implements PelangganDao {
     List<Pelanggan> data = new ArrayList();
    
    public PelangganDaoImpl(){
         data.add(new Pelanggan("98141","AJa","10","9","10000","0"));
        data.add(new Pelanggan("98111","Ila","30","9","10000","0.03"));
    }
    public void save(Pelanggan pelanggan){
        data.add(pelanggan);
    }
    public void update(int index, Pelanggan pelanggan){
        data.set(index,pelanggan);
    }
    public void delete (int index){
        data.remove(index);
    }
    public Pelanggan getPelanggan(int index){
        return data.get(index);
    }
    public List<Pelanggan> getAllPelanggan(){
        return data;
    }      
}
