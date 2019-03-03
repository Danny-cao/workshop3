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
	
	private ArtikelService service = new ArtikelService();

    @GET
    @Produces("application/json")
    public Response findAll(){
    	
        ArrayList<Artikel> artikelen = service.find();
        
        return Response.ok(artikelen).build();
    }

    //Voorbeeld POST functie
    @POST
    @Produces("application/json")
    public Response saveArtikel(@FormParam("naam") String naam, @FormParam("prijs") double prijs){
    	
    	Artikel a = service.save(new Artikel(naam, prijs));
    	
        return Response.ok(a).build();
        
    }
    
    // update artikel ....
    
    // verwijder een artikel ....
}
