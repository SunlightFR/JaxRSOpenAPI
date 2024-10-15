package fr.istic.taa.jaxrs.rest;

import fr.istic.taa.jaxrs.dao.impl.GameDao;
import fr.istic.taa.jaxrs.dto.Game;
import jakarta.ws.rs.*;

@Path("game")
@Produces({"application/json"})
public class GameResource {
    private GameDao gameDao;

    public GameResource() {
        gameDao = new GameDao();
    }

    @GET
    @Path("/{gameId}")
    public Game getGameById(@PathParam("gameId") Long gameId){
        return gameDao.findOne(gameId);
    }

    @POST
    public void doPost(Game game){
        gameDao.save(game);
    }
}
