package fr.istic.taa.jaxrs.rest;

import fr.istic.taa.jaxrs.dao.impl.UserDao;
import fr.istic.taa.jaxrs.dto.User;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.ws.rs.*;

@Path("user")
@Produces({"application/json", "application/xml"})
public class UserResource {
    @GET
    @Path("/{userId}")
    public User getUserById(@PathParam("userId") Long userId) {
        return new UserDao().findOne(userId);
    }

    @POST
    public void doPost(User user){
        new UserDao().save(user);
    }
}
