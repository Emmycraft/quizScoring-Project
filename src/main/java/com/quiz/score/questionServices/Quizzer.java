package com.quiz.score.questionServices;

import com.quiz.score.question.ProjectQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quizzer implements questionReader, CollectInput {
List<ProjectQuestion> quizList=new ArrayList<>();
//the user answers will be stored as a list
List<String> userAnswer=new ArrayList<>();

public void addQuestion(){
    quizList.add(new ProjectQuestion("ques1","capital of nigeria","Abuja",List.of("Ghana","Abuja","sokoto")));
quizList.add(new ProjectQuestion("ques2","who is the father of java","goosling",List.of("samuel","goosling","peter")));
    System.out.println(quizList);
}

    @Override
    public void scannedInput() {

        Scanner scan=new Scanner(System.in);
        System.out.println("what is your own answer? ");

        String userOption=scan.nextLine();

    }

    @Override
    public void quesRead() {
    int i=0;
    for(ProjectQuestion quesPro:quizList){

        System.out.println(quesPro.getTheQuestion());
    }

    }
}
