package controller;
import java.util.List;
import DAOdatamovie.datamovieDAO;
import DAOImplement.datamovieimplement;
import model.*;
import view.MainView;

public class datamoviecontroller {
    MainView frame;
    datamovieimplement impldatamovie;
    List<datamovie> db;

    public datamoviecontroller(MainView frame) {
        this.frame = frame;
        impldatamovie = new datamovieDAO();
        db = impldatamovie.getAll();
    }

    public void isitabel() {
        db = impldatamovie.getAll();
        modeltabeldatamovie mm = new modeltabeldatamovie(db);
        frame.getTabelDatamovie().setModel(mm);
    }

    public void update(String judul, double alur, double penokohan, double akting, double nilai) {
        
    }

    public void clear() {
        
    }

    public void insert(String judul, double alur, double penokohan, double akting, double nilai) {
        
    }

    public void delete(String judul) {
    
    }
}
