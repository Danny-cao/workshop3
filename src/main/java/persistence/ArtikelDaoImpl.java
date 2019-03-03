package persistence;

import java.util.ArrayList;

import model.Artikel;

public class ArtikelDaoImpl implements ArtikelDao {

    @Override
    public ArrayList<Artikel> findAll() {
    	
        Artikel artikel1 = new Artikel("schoenen", 2);
        Artikel artikel2 = new Artikel("brood", 3);
        Artikel artikel3 = new Artikel("cola", 1);
        
        ArrayList list = new ArrayList<>();
        list.add(artikel1);
        list.add(artikel2);
        list.add(artikel3);
        
        return list;
    }

    @Override
    public Artikel save(Artikel artikel) {
        
    	System.out.println(artikel.toString());
    	
    	return artikel;
    }
    
    // update artikel ....
    
    // verwijder een artikel ....
}
