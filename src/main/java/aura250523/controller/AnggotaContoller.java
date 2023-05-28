/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura250523.controller;

import aura240523.dao.AnggotaDao;
import aura240523.dao.AnggotaDaoImpl;
import aura240523.model.Anggota;
import aura250523.database.DatabaseHelper;
import aura250523.view.FormAnggota;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class AnggotaContoller {
    FormAnggota view;
    Anggota model;
    AnggotaDao dao;
    public AnggotaContoller(FormAnggota view){
        this.view = view;
        try {
            dao = new AnggotaDaoImpl(DatabaseHelper.getConnection());
        } catch (Exception ex) {
        }
    }
    
    public void clearForm(){
        view.getTxtNobp().setText("");
        view.getTxtNama().setText("");
        view.getTxtAlamat().setText("");
        view.getCboJenisKelamin().removeAllItems();
        view.getCboJenisKelamin().addItem("L");
        view.getCboJenisKelamin().addItem("P");
    }
    
       public void saveAnggota() throws SQLException{
        model = new Anggota();
        model.setNobp(view.getTxtNobp().getText());
        model.setNama(view.getTxtNama().getText());
        model.setAlamat(view.getTxtAlamat().getText());
        model.setJenisKelamin(view.getCboJenisKelamin()
                .getSelectedItem().toString());
        dao.insert(model);
           JOptionPane.showMessageDialog(view, "Insert ok ");
//           tampil();
    }
       
       public void tampil() throws SQLException{
           DefaultTableModel tabelModel =
                (DefaultTableModel) view.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
           List<Anggota> list = dao.getAll();
        for (Anggota anggota1 : list){
            Object row[]= {
                anggota1.getNobp(),
                anggota1.getNama(),
                anggota1.getAlamat(),
                anggota1.getJenisKelamin()
            };
            tabelModel.addRow(row);
        }
    }
}
