/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aura240523.dao;
import aura240523.model.Peminjaman;
import java.util.List;
import java.sql.SQLException;
/**
 *
 * @author ACER
 */
public interface PeminjamanDao {
    void insert (Peminjaman peminjaman) throws SQLException;
    void update(Peminjaman peminjaman)throws SQLException;
    void delete(Peminjaman peminjaman)throws SQLException;
    Peminjaman getPeminjaman(String nobp, String kodeBuku, String tglPinjam)throws SQLException;
    List<Peminjaman> getAll()throws SQLException;
}
