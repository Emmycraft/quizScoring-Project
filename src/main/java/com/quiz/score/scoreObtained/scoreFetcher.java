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



    public void theScore(){
      //creating an object only works for functional interface


        userScoreObtained scoreResult=()->{
            int theStuScore=0;
            for(int j=0;j<studentList.size();j++){
                ProjectQuestion stuList=studentList.get(j);
                String stuAns=studentAnswer.get(j);
                if(stuList.getAnswer().equalsIgnoreCase(stuAns)){
                    System.out.println(" option "+j+" is correct");
                    theStuScore++;
                }
                else{
                    System.out.println("wrong answer");
                }

            }
            System.out.println("your score is "+theStuScore);
        };

scoreResult.scoreObtained();

  };


}
