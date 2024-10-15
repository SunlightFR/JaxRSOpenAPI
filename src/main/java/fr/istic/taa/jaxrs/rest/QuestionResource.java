package fr.istic.taa.jaxrs.rest;

import fr.istic.taa.jaxrs.dao.impl.QuestionDao;
import fr.istic.taa.jaxrs.dto.Question;
import jakarta.ws.rs.*;

@Path("question")
@Produces({"application/json"})
public class QuestionResource {
    private QuestionDao questionDao;
    public QuestionResource(){
        this.questionDao = new QuestionDao();
    }

    @GET
    @Path("/{questionId}")
    public Question getQuestionById(@PathParam("questionId") Long questionId){
        return questionDao.findOne(questionId);
    }

    @POST
    @Consumes("application/xml")
    public void doPost(Question question){
        questionDao.save(question);
    }
}
