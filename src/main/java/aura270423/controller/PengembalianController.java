/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura270423.controller;
import javax.swing.table.DefaultTableModel;
import aura270423.view.FormPengembalian;
import aura270423.model.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class PengembalianController {
    FormPengembalian formPengembalian;
    Pengembalian pengembalian;
    Peminjaman peminjaman;
    PengembalianDao pengembalianDao;
    PeminjamanDao peminjamanDao;
        private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

    public PengembalianController(FormPengembalian formPengembalian ) {
        this.formPengembalian = formPengembalian;
        pengembalianDao = new PengembalianDaoImpl();
        peminjamanDao = new PeminjamanDaoImpl();
    }
    
    public void clearForm(){
        formPengembalian.getTxtNobp().setText("");
        formPengembalian.getTxtNama().setText("");
        formPengembalian.getTxtTglKembali().setText("");
        formPengembalian.getTxtTglDikembalikan().setText("");
        formPengembalian.getTxtTerlambat().setText("");
        formPengembalian.getTxtDenda().setText("");
    }
    
    public void tampilDataPeminjaman(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formPengembalian.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAllPeminjaman();
        for(Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getAnggota().getKodeAnggota(),
                peminjaman.getBuku().getKodeBuku(),
                peminjaman.getTglpinjam(),
                peminjaman.getTglkembali()
            };
            tabelModel.addRow(data);
        }
    }
    
//    tambahan
    public void getPeminjaman(){
        int index = formPengembalian.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            formPengembalian.getTxtNobp()
                    .setText(peminjaman.getAnggota().getKodeAnggota());
            formPengembalian.getTxtNama()
                    .setText(peminjaman.getAnggota().getNamaAnggota());
            formPengembalian.getTxtTglKembali()
                    .setText(peminjaman.getTglkembali());
        }
    }
    
    public void getTglSekarang(){
        Date date = new Date();
        String tglskrg = formatter.format(date);
        formPengembalian.getTxtTglDikembalikan().setText(tglskrg);
    }
    
    public void hitungDenda(){
        if (formPengembalian.getTxtTglKembali().getText().isEmpty() || formPengembalian.getTxtTglDikembalikan().getText().isEmpty()) {
            JOptionPane.showMessageDialog(formPengembalian, "Isi tanggal dengan benar");
        } else {
            try {
                String kembali = formPengembalian.getTxtTglKembali().getText().toString();
                String dikembalikan = formPengembalian.getTxtTglDikembalikan().getText().toString();
                Date tglkembali = formatter.parse(kembali);
                Date tgldikembalikan = formatter.parse(dikembalikan);
                long selisih = tgldikembalikan.getTime()- tglkembali.getTime();
                selisih = selisih / (24 * 60 * 60 * 1000);
                int denda = 500 * (int) selisih;
                formPengembalian.getTxtTerlambat().setText(""+selisih+" hari");
                formPengembalian.getTxtDenda().setText("Rp. "+denda+"");
            } catch (Exception e) {
            }
        }
    }
    
    public void savePengembalian(){
       
    }
    
//        public void bersihForm(){
//        formPeminjaman.getTxtTglpinjam().setText("");
//        formPeminjaman.getTxtTglkembali().setText("");
//    }
//        
//         public void tampil(){
//        DefaultTableModel tabelModel =
//                (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
//        tabelModel.setRowCount(0);
//        java.util.List<Peminjaman> list = peminjamanDao.getAllPeminjaman();
//        for(Peminjaman peminjaman : list){
//            Object[] data = {
//                peminjaman.getAnggota().getKodeAnggota(),
//                peminjaman.getBuku().getKodeBuku(),
//                peminjaman.getTglpinjam(),
//                peminjaman.getTglkembali()
//            };
//            tabelModel.addRow(data);
//        }
//    }
}
