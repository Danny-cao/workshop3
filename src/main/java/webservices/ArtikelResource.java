package webservices;


import model.Artikel;

import java.util.ArrayList;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/artikel")
public class ArtikelResource {

    @GET
    @Produces("application/json")
    public Response findAll(){
    	
        Artikel artikel1 = new Artikel("schoenen", 2);
        Artikel artikel2 = new Artikel("brood", 3);
        Artikel artikel3 = new Artikel("cola", 1);
        
        ArrayList list = new ArrayList<>();
        list.add(artikel1);
        list.add(artikel2);
        list.add(artikel3);
        
        return Response.ok(list).build();
    }

    //Voorbeeld POST functie
    @POST
    @Produces("application/json")
    public Response saveArtikel(@FormParam("naam") String naam, @FormParam("prijs") double prijs){
    	
    	Artikel a = new Artikel(naam, prijs);
    	System.out.println(a.toString());
        return Response.ok(a).build();
        
    }
    
    // update artikel ....
    
    // verwijder een artikel ....
}
