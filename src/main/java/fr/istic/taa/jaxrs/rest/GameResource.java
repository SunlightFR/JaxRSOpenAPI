package fr.istic.taa.jaxrs.rest;

import fr.istic.taa.jaxrs.dto.Game;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("game")
public class GameResource {

    @GET
    public Game getGameById(Long id){

    }
}
