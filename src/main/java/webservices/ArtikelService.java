package webservices;

import model.Artikel;
import persistence.ArtikelDao;
import persistence.ArtikelDaoImpl;

public class ArtikelService {

    private ArtikelDao adao = new ArtikelDaoImpl();


    public Artikel find(String naam){
        return adao.find(naam);
    }

    public Artikel save(Artikel artikel){
        return adao.save(artikel);
    }
}
