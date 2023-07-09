/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura250523.controller;

import aura240523.dao.AnggotaDao;
import aura240523.dao.AnggotaDaoImpl;
import aura240523.dao.BukuDao;
import aura240523.dao.BukuDaoImpl;
import aura240523.dao.PeminjamanDao;
import aura240523.dao.PeminjamanDaoImpl;
import aura240523.dao.PengembalianDao;
import aura240523.dao.PengembalianDaoImpl;
import aura240523.model.Anggota;
import aura240523.model.Buku;
import aura240523.model.Peminjaman;
import aura240523.model.Pengembalian;
import aura250523.database.DatabaseHelper;
import aura250523.view.FormPengembalian;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class PengembalianController {
    FormPengembalian formPengembalian;
    PengembalianDao pengembalianDao;
    PeminjamanDao peminjamanDao;
    AnggotaDao anggotaDao;
    BukuDao bukuDao;
    Connection connection;
    Pengembalian pengembalian;
    
    public PengembalianController (FormPengembalian formPengembalian){
        try {
            this.formPengembalian = formPengembalian;
            connection = DatabaseHelper.getConnection();
            pengembalianDao = new PengembalianDaoImpl(connection);
            peminjamanDao = new PeminjamanDaoImpl(connection);
            anggotaDao = new AnggotaDaoImpl(connection);
            bukuDao = new BukuDaoImpl(connection);
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex); 
       }
    }
    
    public void clearForm(){
    formPengembalian.getTxtDenda().setText("");
    formPengembalian.getTxtTerlambat().setText("");
    formPengembalian.getTxtTglDikembalikan().setText("");
    formPengembalian.getTxtTglPinjam().setText("");
    }
    
    public void isiComboAnggota(){
        try {
            formPengembalian.getCboNobp().removeAllItems();
            List<Anggota> list = anggotaDao.getAll();
            for (Anggota anggota : list)
                formPengembalian.getCboNobp()
                        .addItem(anggota.getNobp()+"-"+anggota.getNama());
        } catch (Exception e) {
        }
    }// blum siap
    
    public void Insert(){
        try {
            pengembalian = new Pengembalian();
            pengembalian.setNobp((formPengembalian.getCboNobp()
                    .getSelectedItem().toString().split("-")[0]));
            pengembalian.setKodeBuku((formPengembalian.getCboKodeBuku()
                    .getSelectedItem().toString().split("-")[0]));
            pengembalian.setTglPinjam(formPengembalian.getTxtTglPinjam().getText());
            pengembalian.setTglDikembalikan(formPengembalian.getTxtTglDikembalikan().getText());
            pengembalian.setTerlambat(Integer.parseInt(formPengembalian.getTxtTerlambat().getText()));
            pengembalian.setDenda(Double.parseDouble(formPengembalian.getTxtDenda().getText()));
            pengembalianDao.insert(pengembalian);
            JOptionPane.showMessageDialog(formPengembalian, "Pengembalian Ok");
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getPengembalian(){
        try {
            pengembalian = new Pengembalian();
            String nobp  = formPengembalian.getTblPengembalian()
                    .getValueAt(formPengembalian.getTblPengembalian().getSelectedRow(), 0).toString();
            String kodebuku = formPengembalian.getTblPengembalian()
                    .getValueAt(formPengembalian.getTblPengembalian().getSelectedRow(), 2).toString();
            String tglpinjam = formPengembalian.getTblPengembalian()
                    .getValueAt(formPengembalian.getTblPengembalian().getSelectedRow(), 4).toString();
            Peminjaman peminjaman = peminjamanDao.getPeminjaman(nobp, kodebuku, tglpinjam);
            Anggota anggota = anggotaDao.getAnggota(peminjaman.getAnggota().getNobp());
            formPengembalian.getCboNobp()
                    .setSelectedItem(anggota.getNobp()+"-"+anggota.getNama());
            Buku buku = bukuDao.getBuku(peminjaman.getBuku().getKodebuku());
            formPengembalian.getCboKodeBuku()
                    .setSelectedItem(buku.getKodeBuku()+"-"+buku.getJudulBuku());
            formPengembalian.getTxtTglPinjam().setText(peminjaman.getTglPinjam());
            formPengembalian.getTxtTglDikembalikan().setText(peminjaman.getTglPinjam());
        } catch (Exception e) {
        }
    }
}