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
import aura240523.model.Anggota;
import aura240523.model.Buku;
import aura240523.model.Peminjaman;
import aura250523.database.DatabaseHelper;
import aura250523.view.FormPeminjaman;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class PeminjamanController {
    FormPeminjaman formPeminjaman;
    Peminjaman peminjaman;
    PeminjamanDao peminjamanDao;
    AnggotaDao anggotaDao;
    BukuDao bukuDao;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        try{
            this.formPeminjaman = formPeminjaman;
            peminjamanDao = new PeminjamanDaoImpl(DatabaseHelper.getConnection());
            anggotaDao = new AnggotaDaoImpl(DatabaseHelper.getConnection());
            bukuDao = new BukuDaoImpl(DatabaseHelper.getConnection());
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(formPeminjaman, "erornya ini : " +ex);
        } 
    }
    
    
    public void clearForm(){
        formPeminjaman.getBtnInsert().setEnabled(true);
        formPeminjaman.getBtnUpdate().setEnabled(false);
        formPeminjaman.getBtnDelete().setEnabled(false);
        formPeminjaman.getCboNobp().setEnabled(true);
        formPeminjaman.getCboKodeBuku().setEnabled(true);
        formPeminjaman.getTxtTglPinjam().setEditable(true);
        loadCmbBox();
        formPeminjaman.getTxtTglPinjam().setText("");
        formPeminjaman.getTxtTglKembali().setText("");
    }
    
    public void loadCmbBox(){
       try {
            formPeminjaman.getCboNobp().removeAllItems();
            formPeminjaman.getCboKodeBuku().removeAllItems();
            List<Anggota> list = anggotaDao.getAll();
            for (Anggota anggota : list) {
                formPeminjaman.getCboNobp().addItem(anggota.getNobp() + " - " + anggota.getNama());
            }
            List<Buku> listbuku = bukuDao.getAll();
            for (Buku buku : listbuku ){
                formPeminjaman.getCboKodeBuku().addItem(buku.getKodeBuku() + " - " + buku.getJudulBuku());
            }
        } catch (SQLException ex) {
        }
       
    }
    
    public void insert(){
        try {
            peminjaman = new Peminjaman();
            peminjaman.setNobp(formPeminjaman.getCboNobp()
                    .getSelectedItem().toString().split(" - ")[0]);
            peminjaman.setKodeBuku(formPeminjaman.getCboKodeBuku()
                        .getSelectedItem().toString().split(" - ")[0]);
            peminjaman.setTglPinjam(formPeminjaman.getTxtTglPinjam().getText());
            peminjaman.setTglKembali(formPeminjaman.getTxtTglKembali().getText());
            peminjamanDao.insert(peminjaman);
            JOptionPane.showMessageDialog(formPeminjaman, "Entri Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formPeminjaman, "Opps : "+ex);
        }
    }
    
    public void getPeminjaman() {
        formPeminjaman.getBtnInsert().setEnabled(false);
        formPeminjaman.getBtnUpdate().setEnabled(true);
        formPeminjaman.getBtnDelete().setEnabled(true);
        formPeminjaman.getCboNobp().setEnabled(false);
        formPeminjaman.getCboKodeBuku().setEnabled(false);
        formPeminjaman.getTxtTglPinjam().setEditable(false);
        try {
            String nobp = formPeminjaman.getTblPeminjaman()
                    .getValueAt(formPeminjaman.getTblPeminjaman().getSelectedRow(), 0).toString();
            String kodeBuku = formPeminjaman.getTblPeminjaman()
                    .getValueAt(formPeminjaman.getTblPeminjaman().getSelectedRow(), 2).toString();
            String tglPinjam = formPeminjaman.getTblPeminjaman()
                    .getValueAt(formPeminjaman.getTblPeminjaman().getSelectedRow(), 4).toString();
            
            peminjaman = peminjamanDao.getPeminjaman(nobp, kodeBuku, tglPinjam);
            Anggota anggota = anggotaDao.getAnggota(peminjaman.getNobp());
            Buku buku = bukuDao.getBuku(peminjaman.getKodeBuku());
            formPeminjaman.getCboNobp()
                    .setSelectedItem(anggota.getNobp()+" - "+anggota.getNama());
            formPeminjaman.getCboKodeBuku()
                    .setSelectedItem(buku.getKodeBuku()+" - "+buku.getJudulBuku());
            formPeminjaman.getTxtTglPinjam().setText(peminjaman.getTglPinjam());
            formPeminjaman.getTxtTglKembali().setText(peminjaman.getTglKembali());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formPeminjaman, "Opps : "+ex);
        }
    }
    
    public void tampil() throws SQLException{
        DefaultTableModel tabelModel = (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        List<Peminjaman> list = peminjamanDao.getAll();
        if (list != null){
            for (Peminjaman peminjaman : list) {
                Anggota anggota = anggotaDao.getAnggota(peminjaman.getNobp());
                Buku buku = bukuDao.getBuku(peminjaman.getKodeBuku());
                Object[] row = {
                    peminjaman.getNobp(),
                    anggota.getNama(),
                    peminjaman.getKodeBuku(),
                    buku.getJudulBuku(),
                    peminjaman.getTglPinjam(),
                    peminjaman.getTglKembali()
                };
                tabelModel.addRow(row);
            }
        }
    }
    
    public void update() {
        try {
            peminjaman.setNobp(formPeminjaman.getCboNobp().getSelectedItem().toString().split(" - ")[0]);
            peminjaman.setKodeBuku(formPeminjaman.getCboKodeBuku().getSelectedItem().toString().split(" - ")[0]);
            peminjaman.setTglPinjam(formPeminjaman.getTxtTglPinjam().getText());
            peminjaman.setTglKembali(formPeminjaman.getTxtTglKembali().getText());
            peminjamanDao.update(peminjaman);
            JOptionPane.showMessageDialog(formPeminjaman, "Entri Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formPeminjaman, "Opps : "+ex);
        }
    }
    
    public void delete() {
        try {
            peminjamanDao.delete(peminjaman);
            JOptionPane.showMessageDialog(formPeminjaman, "Delete Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formPeminjaman, "Opps : "+ex);
        }
    }
}