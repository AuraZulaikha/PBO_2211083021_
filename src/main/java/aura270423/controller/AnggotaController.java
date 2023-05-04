/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura270423.controller;
import aura270423.view.*;
import aura270423.model.*;
import javax.swing.*;
import java.util.List;
import javax.swing.table.*;
/**
 *
 * @author ACER
 */
public class AnggotaController {
    private FormAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    
    public AnggotaController(FormAnggota formAnggota){
        this.formAnggota = formAnggota ;
        anggotaDao = new AnggotaDaoImpl();
    }
    
    public void bersihForm(){
        formAnggota.getTxtKodeAnggota().setText("");
        formAnggota.getTxtNamaAnggota().setText("");
        formAnggota.getTxtAlamat().setText("");
    }
    
    public void isiCboJenisKelamin(){
        formAnggota.getCboJenisKelamin().removeAllItems();
        formAnggota.getCboJenisKelamin().addItem("L");
        formAnggota.getCboJenisKelamin().addItem("P");
    }
    public void saveAnggota(){
        anggota = new Anggota();
        anggota.setKodeAnggota(formAnggota.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(formAnggota.getTxtNamaAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota.setJeniskelamin(formAnggota.getCboJenisKelamin()
                .getSelectedItem().toString());
        anggotaDao.save(anggota);
        JOptionPane.showMessageDialog(formAnggota, "Insert ok ");
    }
    
    public void updateAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota.setKodeAnggota(formAnggota.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(formAnggota.getTxtNamaAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota.setJeniskelamin(formAnggota.getCboJenisKelamin()
                .getSelectedItem().toString());
        anggotaDao.update(index,anggota);
        JOptionPane.showMessageDialog(formAnggota, "Update ok ");
    }
    
    public void delete(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggotaDao.delete(index);
         JOptionPane.showMessageDialog(formAnggota, "Delete ok ");
    }
    
    public void getAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if(anggota != null ){
            formAnggota.getTxtKodeAnggota().setText(anggota.getKodeAnggota());
            formAnggota.getTxtNamaAnggota().setText(anggota.getNamaAnggota());
            formAnggota.getTxtAlamat().setText(anggota.getAlamat());
            formAnggota.getCboJenisKelamin().setSelectedItem(anggota.getJenisKelamin());
        }
    }
    
    public void tampil(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formAnggota.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = anggotaDao.getAllAnggota();
        for (Anggota anggota1 : list){
            Object row[]= {
                anggota1.getKodeAnggota(),
                anggota1.getNamaAnggota(),
                anggota1.getAlamat(),
                anggota1.getJenisKelamin()
            };
            tabelModel.addRow(row);
        }
    }
}
