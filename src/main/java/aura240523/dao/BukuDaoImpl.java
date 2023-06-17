/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura240523.dao;
import java.sql.*;
import aura240523.model.Buku;
import java.util.*;
/**
 *
 * @author ACER
 */
public class BukuDaoImpl implements BukuDao {
    Connection connection;
    public BukuDaoImpl(Connection connection){
        this.connection = connection;
    }
    
    public void insert(Buku buku)throws SQLException{
        String sql = "Insert into buku values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodeBuku());
        ps.setString(2, buku.getJudulBuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.executeUpdate();
    }
    
    public void update(Buku buku)throws SQLException{
        String sql="Update buku set judulBuku=?, pengarang=?, penerbit=? where kodeBuku=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,buku.getJudulBuku());
        ps.setString(2, buku.getPengarang());
        ps.setString(3, buku.getPenerbit());
        ps.setString(4, buku.getKodeBuku());
        ps.executeUpdate();
    }
    
    public void delete(String kodeBuku)throws SQLException{
        String sql="delete from buku where kodeBuku=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeBuku);
        ps.executeUpdate();
    }
    
    public Buku getBuku(String kodeBuku)throws SQLException{
        String sql="Select * from buku where kodeBuku=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeBuku);
        ResultSet rs = ps.executeQuery();
        Buku buku = null;
        if(rs.next()){
            buku = new Buku();
            buku.setKodeBuku(rs.getString(1));
            buku.setJudulBuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
        }
        return buku;
    }
    public List<Buku> getAll() throws SQLException {
        String sql="Select * from buku ";
        PreparedStatement ps = connection.prepareStatement(sql);
        Buku buku = null;
        ResultSet rs = ps.executeQuery();
        List <Buku> list = new ArrayList<>();
        while (rs.next()){
            buku = new Buku();
            buku.setKodeBuku(rs.getString(1));
            buku.setJudulBuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            list.add(buku);
        }
        return list;
    }
}
