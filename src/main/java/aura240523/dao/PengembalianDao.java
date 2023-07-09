/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aura240523.dao;

import aura240523.model.Pengembalian;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface PengembalianDao {
    void insert (Pengembalian pengembalian ) throws SQLException;
    void update( Pengembalian pengembalian )throws SQLException;
    void delete(Pengembalian pengembalian )throws SQLException;
    Pengembalian getPengembalian (String nobp, String kodeBuku, String tglPinjam)throws SQLException;
    List<Pengembalian> getAll()throws SQLException;
    int selisihTanggal(String tgl1, String tgl2) throws SQLException;
}
