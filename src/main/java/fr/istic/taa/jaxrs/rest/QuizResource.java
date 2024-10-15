package fr.istic.taa.jaxrs.rest;

import fr.istic.taa.jaxrs.dao.impl.QuizDao;
import fr.istic.taa.jaxrs.dto.Quiz;
import jakarta.ws.rs.*;

@Path("quiz")
@Produces({"application/json"})
public class QuizResource {
    private QuizDao quizDao;
    public QuizResource(){
        quizDao = new QuizDao();
    }

    @GET
    @Path("/{quizId}")
    public Quiz getQuizById(@PathParam("quizId") Long quizId){
        return quizDao.findOne(quizId);
    }

    @POST
    public void doPost(Quiz q ){
        quizDao.save(q);
    }
}
