/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOdatamovie;
import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOImplement.datamovieimplement;
/**
 *
 * @author ACER
 */
public class datamovieDAO implements datamovieimplement{
    Connection connection;
    
    final String select = "SELECT * FROM movie";
    
    public datamovieDAO(){
        connection = connector.connection();
    }

    @Override
    public void insert(datamovie b) {
 try (PreparedStatement ps = connection.prepareStatement("INSERT INTO movie (judul, alur, penokohan, akting, nilai) VALUES (?, ?, ?, ?, ?)")) {
            ps.setString(1, b.getJudul());
            ps.setDouble(2, b.getAlur());
            ps.setDouble(3, b.getPenokohan());
            ps.setDouble(4, b.getAkting());
            ps.setDouble(5, b.getNilai());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(); 
        }
    }   
    
    @Override
    public void update(datamovie b) {
 try (PreparedStatement ps = connection.prepareStatement("UPDATE movie SET alur=?, penokohan=?, akting=?, nilai=? WHERE judul=?")) {
            ps.setDouble(1, b.getAlur());
            ps.setDouble(2, b.getPenokohan());
            ps.setDouble(3, b.getAkting());
            ps.setDouble(4, b.getNilai());
            ps.setString(5, b.getJudul());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(); 
        }
    }    

    @Override
    public void delete(String judul) {
        try (PreparedStatement ps = connection.prepareStatement("DELETE FROM movie WHERE judul=?")) {
            ps.setString(1, judul);
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(); 
        }
    }

    @Override
     public List<datamovie> getAll() {
        List<datamovie> db = new ArrayList<>();
        try (Statement st = connection.createStatement(); ResultSet rs = st.executeQuery(select)) {
            while (rs.next()) {
                datamovie mo = new datamovie();
                mo.setJudul(rs.getString("judul"));
                mo.setAlur(rs.getDouble("alur"));
                mo.setPenokohan(rs.getDouble("penokohan"));
                mo.setAkting(rs.getDouble("akting"));
                mo.setNilai(rs.getDouble("nilai"));
                db.add(mo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return db;
    }
}
