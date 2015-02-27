/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestFull;

import Model.Player;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author Alex
 */
@Path("api")
public class RestStudy {

    static List<Player> players = new ArrayList();
    
    @Context
    private UriInfo context;
    
    /**
     * Creates a new instance of RestStudy
     */
    public RestStudy() {
        if (players.isEmpty()) {            
            
            players.add(new Player(0, "James Rodriguez", "Columbia"));
            players.add(new Player(1, "Thomas Mueller", "Germany"));
            players.add(new Player(2, "Messi", "Argentina"));
            players.add(new Player(3, "Neymar", "Brazil"));
            players.add(new Player(4, "van Persie", "Netherlands"));
        }
    }

    /**
     * Retrieves representation of an instance of RestFull.RestStudy
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    @Path("/AllPlayerNames")
    public String getAllPlayers() {
        Gson gson = new Gson();
        String playersJson = gson.toJson(players);
        return playersJson;
    }

    /**
     * PUT method for updating or creating an instance of RestStudy
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
