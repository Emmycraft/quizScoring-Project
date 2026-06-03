package com.quiz.score.AppRunner;

import com.quiz.score.questionServices.Quizzer;

public class ApplicationRun {
    public static void main(String[] args) {
        Quizzer runQuiz=new Quizzer();
        runQuiz.addQuestion();
        runQuiz.quesRead();
    }
}
