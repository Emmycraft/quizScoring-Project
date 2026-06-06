package com.quiz.score.scoreObtained;

import com.quiz.score.question.ProjectQuestion;

import java.util.List;

public class scoreFetcher  {
    private List<ProjectQuestion>studentList;
    private List<String>studentAnswer;

    public scoreFetcher(List<ProjectQuestion> studentList,List<String>studentAnswer) {
this.studentAnswer=studentAnswer;
        this.studentList = studentList;
    }

    public void scoreGotten(){

        for(ProjectQuestion eachAnswer:studentList){
            System.out.println(eachAnswer+" the scoregotten list");
        }

         //implementing  functional interface
        userScoreObtained myScore=()->{

              //looping throught the list answers for each question at a time

        };
    }


}
