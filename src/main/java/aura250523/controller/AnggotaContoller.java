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
}
