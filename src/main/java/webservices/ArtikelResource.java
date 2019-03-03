package webservices;


import model.Artikel;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/artikel")
public class ArtikelResource {

    @GET
    @Produces("application/json")
    public Response findArtikel(){
        Artikel artikel = new Artikel("test", 2);
        return Response.ok(artikel).build();
    }

    @POST
    @Produces("application/json")
    public Response saveArtikel(){

        return Response.ok().build();
    }
}
