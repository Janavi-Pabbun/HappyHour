package com.example.meraapp;

public class QuestionLibrary
{
    public String Questions[]={
            "How often have you been upset because of something unexpected?",
            "How often do you feel unable to control the important things in your life?","How often do you feel nervous and stressed?",
            "How often do you feel confident about handling personal problems?","How often do you feel that things are going well for you?",
            "How often do you feel you can't cope with all the things you have to do?","How often are you able to control the things that irritate you?"

    };
    private String choices[][]={
            {"Never","Rarely","Sometimes","Often"},
            {"Never","Rarely","Sometimes","Often"},
            {"Never","Rarely","Sometimes","Often"},
            {"Never","Rarely","Sometimes","Often"},
            {"Never","Rarely","Sometimes","Often"},{"Never","Rarely","Sometimes","Often"},{"Never","Rarely","Sometimes","Often"},
    };
    private String CorrectAnswers[]={"Nearly every day","Nearly every day","Nearly every day","Nearly every day","Nearly every day","Nearly every day","Nearly every day"};

    public String getQuestion(int a)
    {
        String Question =Questions[a];
        return Question;
    }
    public String getchoice1(int a)
    {
        String choice0 =choices[a][0];
        return choice0;
    }

    public String getchoice2(int a)
    {
        String choice1=choices[a][1];
        return choice1;
    }
    public String getchoice3(int a)
    {
        String choice2 =choices[a][2];
        return choice2;
    }
    public String getchoice4(int a)
    {

        String choice3 =choices[a][3];
        return choice3;
    }
    public String getcorrectAnswer(int a)
    {
        String answer =CorrectAnswers[a];
        return answer;
    }
}
