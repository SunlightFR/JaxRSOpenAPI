package fr.istic.taa.jaxrs.rest;

import fr.istic.taa.jaxrs.dao.impl.GameDao;
import fr.istic.taa.jaxrs.dto.Game;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("game")
public class GameResource {

    @GET
    public Game getGameById(Long id){
        return new GameDao().findOne(id);
    }

    @POST
    public void doPost(Game game){
        new GameDao().save(game);
    }
}
