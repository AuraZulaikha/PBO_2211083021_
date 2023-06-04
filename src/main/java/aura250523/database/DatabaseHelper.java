/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aura250523.database;

import aura240523.dao.AnggotaDao;
import aura240523.dao.AnggotaDaoImpl;
import aura240523.model.Anggota;
import java.sql.Connection;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class DatabaseHelper {
    private static Connection connection;
    public  static Connection getConnection() throws SQLException{
        if(connection == null){
            MysqlDataSource dataSource = new MysqlDataSource();

            dataSource.setUrl("jdbc:mysql://localhost/pbo_aurazulaikha");
            dataSource.setUser("root");
            dataSource.setPassword("");
            
            connection = dataSource.getConnection();
        }
        return connection;
    }
    public static void main(String [] args ){
        try {
            connection = DatabaseHelper.getConnection();
            Anggota anggota = new Anggota ();
            anggota.setNobp("98312111");
            anggota.setNama("Ali");
            anggota.setAlamat("Paris");
            anggota.setJenisKelamin("L");
            AnggotaDao dao = new AnggotaDaoImpl(connection);
            dao.insert(anggota);
            JOptionPane.showMessageDialog(null, "Entri Ok");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
