package webservices;

import java.util.ArrayList;

import model.Artikel;
import persistence.ArtikelDao;
import persistence.ArtikelDaoImpl;

public class ArtikelService {

    private ArtikelDao adao = new ArtikelDaoImpl();


    public ArrayList<Artikel> find(){
        return adao.findAll();
    }

    public Artikel save(Artikel artikel){
        return adao.save(artikel);
    }
    
    // update artikel ....
    
    // verwijder een artikel ....
}
