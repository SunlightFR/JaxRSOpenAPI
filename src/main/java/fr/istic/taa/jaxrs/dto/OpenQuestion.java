package fr.istic.taa.jaxrs.dto;

import jakarta.persistence.Entity;

@Entity
public class OpenQuestion extends Question{
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    String answer;
}
