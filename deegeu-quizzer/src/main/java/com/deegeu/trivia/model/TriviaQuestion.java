package com.deegeu.trivia.model;

import java.util.Date;
import java.util.Objects;

public final class TriviaQuestion {

    private final long id;
    private final String question;
    private final String answerA;
    private final String answerB;
    private final String answerC;
    private final String answerD;
    private final String correctAnswer;
    private final String hint;
    private final Date lastUpdated;

    public TriviaQuestion(long id, String question, String answerA, String answerB, String answerC, String answerD, String correctAnswer, String hint, Date lastUpdated) {
        this.id = id;
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;
        this.hint = hint;
        this.lastUpdated = new Date(lastUpdated.getTime());
    }

    public long getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswerA() {
        return answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getHint() {
        return hint;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final TriviaQuestion other = (TriviaQuestion) obj;
        
        if (this.id != other.id) {
            return false;
        }
        
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        
        if (!Objects.equals(this.answerA, other.answerA)) {
            return false;
        }
        
        if (!Objects.equals(this.answerB, other.answerB)) {
            return false;
        }
        
        if (!Objects.equals(this.answerC, other.answerC)) {
            return false;
        }
        
        if (!Objects.equals(this.answerD, other.answerD)) {
            return false;
        }
        
        if (!Objects.equals(this.correctAnswer, other.correctAnswer)) {
            return false;
        }
        
        if (!Objects.equals(this.hint, other.hint)) {
            return false;
        }
        
        if (!Objects.equals(this.lastUpdated, other.lastUpdated)) {
            return false;
        }

        return true;

    }

    @Override
    public int hashCode() {

        int hash = 7;
        hash = 71 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 71 * hash + Objects.hashCode(this.question);
        hash = 71 * hash + Objects.hashCode(this.answerA);
        hash = 71 * hash + Objects.hashCode(this.answerB);
        hash = 71 * hash + Objects.hashCode(this.answerC);
        hash = 71 * hash + Objects.hashCode(this.answerD);
        hash = 71 * hash + Objects.hashCode(this.correctAnswer);
        hash = 71 * hash + Objects.hashCode(this.hint);
        hash = 71 * hash + Objects.hashCode(this.lastUpdated);
        return hash;
    }
}
