package persistence;

import java.util.ArrayList;

import model.Artikel;

public interface ArtikelDao {

    ArrayList<Artikel> findAll();
    Artikel save(Artikel artikel);
    
    // update artikel ....
    
    // verwijder een artikel ....
}
