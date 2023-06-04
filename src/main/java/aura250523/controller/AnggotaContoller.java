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
        view.getTxtNobp().setEditable(true);
        view.getTxtNobp().setText("");
        view.getTxtNama().setText("");
        view.getTxtAlamat().setText("");
        view.getCboJenisKelamin().removeAllItems();
        view.getCboJenisKelamin().addItem("L");
        view.getCboJenisKelamin().addItem("P");
        view.getBtnInsert().setEnabled(true);
        view.getBtnUpdate().setEnabled(false);
        view.getBtnDelete().setEnabled(false);
    }
    
    public void saveAnggota() throws SQLException{
        model = new Anggota();
        model.setNobp(view.getTxtNobp().getText());
        model.setNama(view.getTxtNama().getText());
        model.setAlamat(view.getTxtAlamat().getText());
        model.setJenisKelamin(view.getCboJenisKelamin().getSelectedItem().toString());
        dao.insert(model);
        JOptionPane.showMessageDialog(view, "Insert ok ");
    }
       
    public void tampil() throws SQLException{
        DefaultTableModel tabelModel = (DefaultTableModel) view.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = dao.getAll();
        if (list != null){
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
    
    public void getAnggota() {
        view.getTxtNobp().setEditable(false);
        view.getBtnInsert().setEnabled(false);
        view.getBtnUpdate().setEnabled(true);
        view.getBtnDelete().setEnabled(true);
        try {
            String nobp = view.getTblAnggota().getValueAt(view.getTblAnggota().getSelectedRow(), 0).toString();
            model = dao.getAnggota(nobp);
            if(model != null){
                view.getTxtNobp().setText(model.getNobp());
                view.getTxtNama().setText(model.getNama());
                view.getTxtAlamat().setText(model.getAlamat());
                view.getCboJenisKelamin().setSelectedItem(model.getJenisKelamin());
            }
        } catch (SQLException ex ){
        }
    }
    
    public void update () throws SQLException{
        model = new Anggota();
        model.setNobp(view.getTxtNobp().getText());
        model.setNama(view.getTxtNama().getText());
        model.setAlamat(view.getTxtAlamat().getText());
        model.setJenisKelamin(view.getCboJenisKelamin().getSelectedItem().toString());
        dao.update(model);
        JOptionPane.showMessageDialog(view, "Update ok ");
    }
    
    public void delete () throws SQLException{
        String nobp = view.getTxtNobp().getText().toString();
        dao.delete(nobp);
        JOptionPane.showMessageDialog(view, "Delete ok ");
    }
}
       
