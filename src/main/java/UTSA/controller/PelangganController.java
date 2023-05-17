/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSA.controller;
import UTSA.view.*;
import UTSA.model.*;
import javax.swing.*;
import java.util.List;
import javax.swing.table.*;
/**
 *
 * @author ACER
 */
public class PelangganController {
    private FormPelanggan formPelanggan;
    private Pelanggan pelanggan;
    private PelangganDao pelangganDao;
    
    public PelangganController(FormPelanggan formPelanggan){
        this.formPelanggan = formPelanggan ;
        pelangganDao= new PelangganDaoImpl();
    }
    
    public void bersihForm(){
        formPelanggan.getTxtKodePelanggan().setText("");
        formPelanggan.getTxtNama().setText("");
        formPelanggan.getTxtMeterBulanIni().setText("");
        formPelanggan.getTxtMeterBulanLalu().setText("");
        formPelanggan.getTxtTarif().setText("");
        formPelanggan.getTxtDiskon().setText("");
    }
    
    public void savePelanggan(){
        pelanggan = new Pelanggan();
        pelanggan.setKodePelanggan(formPelanggan.getTxtKodePelanggan().getText());
        pelanggan.setNama(formPelanggan.getTxtNama().getText());
        pelanggan.setMeterBulanIni(formPelanggan.getTxtMeterBulanIni().getText());
        pelanggan.setMeterBulanLalu(formPelanggan.getTxtMeterBulanLalu().getText());
        pelanggan.setTarif(formPelanggan.getTxtTarif().getText());
        pelanggan.setDiskon(formPelanggan.getTxtDiskon().getText());
        pelangganDao.save(pelanggan);
        JOptionPane.showMessageDialog(formPelanggan, "Insert ok ");
    }
    
    public void updatePelanggan(){
        int index = formPelanggan.getTblPelanggan().getSelectedRow();
        pelanggan.setKodePelanggan(formPelanggan.getTxtKodePelanggan().getText());
        pelanggan.setNama(formPelanggan.getTxtNama().getText());
        pelanggan.setMeterBulanIni(formPelanggan.getTxtMeterBulanIni().getText());
        pelanggan.setMeterBulanLalu(formPelanggan.getTxtMeterBulanLalu().getText());
        pelanggan.setTarif(formPelanggan.getTxtTarif().getText());
        pelanggan.setDiskon(formPelanggan.getTxtDiskon().getText());
        pelangganDao.update(index,pelanggan);
        JOptionPane.showMessageDialog(formPelanggan, "Update ok ");
    }
    
    public void delete(){
        int index = formPelanggan.getTblPelanggan().getSelectedRow();
        pelangganDao.delete(index);
         JOptionPane.showMessageDialog(formPelanggan, "Delete ok ");
    }
    
    public void getPelanggan(){
        int index = formPelanggan.getTblPelanggan().getSelectedRow();
        pelanggan = pelangganDao.getPelanggan(index);
        if(pelanggan != null ){
            formPelanggan.getTxtKodePelanggan().setText(pelanggan.getKodePelanggan());
            formPelanggan.getTxtNama().setText(pelanggan.getNama());
            formPelanggan.getTxtMeterBulanIni().setText(pelanggan.getMeterBulanIni());
            formPelanggan.getTxtMeterBulanLalu().setText(pelanggan.getMeterBulanLalu());
            formPelanggan.getTxtTarif().setText(pelanggan.getTarif());
            formPelanggan.getTxtDiskon().setText(pelanggan.getDiskon());
        }
    }
    
    public void tampil(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formPelanggan.getTblPelanggan().getModel();
        tabelModel.setRowCount(0);
        List<Pelanggan> list = pelangganDao.getAllPelanggan();
        for (Pelanggan pelanggan1 : list){
            Object row[]= {
                pelanggan1.getKodePelanggan(),
                pelanggan1.getNama(),
                pelanggan1.getMeterBulanIni(),
                pelanggan1.getMeterBulanLalu(),
                pelanggan1.getTarif(),
                pelanggan1.getDiskon()
            };
            tabelModel.addRow(row);
        }
    }
}
