package com.quiz.score.question;

import java.util.ArrayList;
import java.util.List;

public class ProjectQuestion {
    private String questionId;
    private String theQuestion;
    private String answer;
    private List<String> options=new ArrayList<>();
    //adding the constructor

    public ProjectQuestion(String questionId, String theQuestion, String answer, List<String> options) {
        this.questionId = questionId;
        this.theQuestion = theQuestion;
        this.answer = answer;
        this.options = options;
    }


    public String getQuestionId() {
        return questionId;
    }

    public String getTheQuestion() {
        return theQuestion;
    }

    public String getAnswer() {
        return answer;
    }

    public List<String> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "ProjectQuestion{" +
                "questionId='" + questionId + '\'' +
                ", theQuestion='" + theQuestion + '\'' +
                ", answer='" + answer + '\'' +
                ", options=" + options +
                '}';
    }
}
