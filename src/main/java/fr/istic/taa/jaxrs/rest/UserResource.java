package fr.istic.taa.jaxrs.rest;

import fr.istic.taa.jaxrs.dao.impl.UserDao;
import fr.istic.taa.jaxrs.dto.User;
import jakarta.ws.rs.*;

@Path("user")
@Produces({"application/json", "application/xml"})
public class UserResource {
    private UserDao userDao;

    public UserResource(){
        this.userDao = new UserDao();
    }
    @GET
    @Path("/{userId}")
    public User getUserById(@PathParam("userId") Long userId) {
        return userDao.findOne(userId);
    }

    @POST
    @Consumes("application/xml")
    public void doPost(User user){
        userDao.save(user);
    }
}
