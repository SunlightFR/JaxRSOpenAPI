package fr.istic.taa.jaxrs.rest;

import fr.istic.taa.jaxrs.dao.impl.UserDao;
import fr.istic.taa.jaxrs.dto.User;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.ws.rs.*;

@Path("user")
@Produces({"application/json", "application/xml"})
public class UserResource {
    private UserDao userDao;

    public UserResource(){
        this.userDao = new UserDao();
    }

    @Operation(summary = "Get a user by ID", description = "Retourne les informations de l'utilisateur correspondant à l'ID fourni.")
    @GET
    @Path("/{userId}")
    public User getUserById(@PathParam("userId") Long userId) {
        return userDao.findOne(userId);
    }

    @Operation(summary = "Post a user", description = "Enregistre un utilisateur dans la base de données.")
    @POST
    @Consumes("application/xml")
    public void doPost(User user){
        userDao.save(user);
    }
}
