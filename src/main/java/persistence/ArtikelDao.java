package persistence;

import model.Artikel;

public interface ArtikelDao {

    Artikel find(String naam);
    Artikel save(Artikel artikel);
}
