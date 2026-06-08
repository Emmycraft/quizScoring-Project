package com.quiz.score.AppRunner;

import com.quiz.score.questionServices.Quizzer;
import com.quiz.score.scoreObtained.scoreFetcher;

public class ApplicationRun {
    public static void main(String[] args) {
        Quizzer runQuiz=new Quizzer();
        scoreFetcher userScoreCall=new scoreFetcher(runQuiz.getQuizList(),runQuiz.getUserAnswer());
        runQuiz.addQuestion();
        runQuiz.quesRead();
userScoreCall.theScore();





    //calling the scorefetcher class which implements score using aggregation
        }
}
