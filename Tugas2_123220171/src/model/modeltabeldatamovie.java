/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author ACER
 */
public class modeltabeldatamovie extends AbstractTableModel{

    List<datamovie> db;
    public modeltabeldatamovie(List<datamovie>db){
        this.db = db;
       
    }
    
    @Override
    public int getRowCount() {
        return db.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 1:
                return "Judul";
            case 2:
                return "Alur";
            case 3:
                return "Penokohan";
            case 4:
                return "Akting";
            case 5:
                return "Nilai";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 1:
                return db.get(row).getJudul();
            case 2:
                return db.get(row).getAlur();
            case 3:
                return db.get(row).getPenokohan();
            case 4:
                return db.get(row).getAkting();
            case 5:
                return db.get(row).getNilai();
            default:
                return null;
        }
    }
    
}
