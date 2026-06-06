package com.quiz.score.questionServices;

import com.quiz.score.question.ProjectQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quizzer implements questionReader, CollectInput {
    String userAnswerOpted;
List<ProjectQuestion> quizList=new ArrayList<>();
//using array list instead of list of to accept list element
    List<String>bankOptions=new ArrayList<>();

    public void setBankOptions(List<String> bankOptions) {
        this.bankOptions = bankOptions;
    }

    //the user answers will be stored as a list
List<String> userAnswer=new ArrayList<>();


public void addQuestion(){
    bankOptions.addAll(List.of("zenith","uba","moniepoint"));
    //implementing setter vividly on the bank options
    //adding a new array list which might be the preferred option if need be
    List<String>newBankOption=new ArrayList<>();
    newBankOption.addAll(List.of("polaris","goldmansach","wellfargo"));
    setBankOptions(newBankOption);
    quizList.add(new ProjectQuestion("ques1","capital of nigeria","Abuja",List.of("Ghana","Abuja","sokoto")));
quizList.add(new ProjectQuestion("ques2","who is the father of java","goosling",List.of("samuel","goosling","peter")));
  quizList.add(new ProjectQuestion("ques3","which is the leading bank","zenith",newBankOption));
  quizList.add(new ProjectQuestion("ques4","how old is nysc","53 years",List.of("34 years","21 years","53 years","10 years")));
  System.out.println(quizList);

}

    public List<ProjectQuestion> getQuizList() {
        return quizList;
    }

    public List<String> getUserAnswer() {
        return userAnswer;
    }

    @Override
    public void scannedInput() {

        Scanner scan=new Scanner(System.in);
        System.out.println("what is your own answer? ");
//cant access in another method, make it a field to be accessible
     //   String userOption=scan.nextLine();
userAnswerOpted =scan.nextLine();
    }

    @Override
    public void quesRead() {
    int i=0;
    for(ProjectQuestion quesPro:quizList){

        System.out.println(quesPro.getTheQuestion());
        System.out.println(quesPro.getOptions());
        scannedInput();
        //getting list capacity for sequential build
        int listCapacity=quizList.size();
        System.out.println(" the list capacity is ="+listCapacity);
       // for(int j=0;j<=ProjectQuestion)
        userAnswer.add(userAnswerOpted);


    }
        System.out.println("user option"+ userAnswer);

    }
}
