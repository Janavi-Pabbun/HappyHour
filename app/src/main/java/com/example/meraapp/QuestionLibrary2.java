package com.example.meraapp;

public class QuestionLibrary2
{
    public String Questions[]={
            "Are you suffering from feelings of sadness,hopelessness or emptiness?",
            " Do you find it hard to find pleasure in activities you used to enjoy?"," Are you lacking energy and motivation?",
            "Are you having trouble getting to sleep and staying asleep?","Have you had thoughts about harming yourself or ending your life?",
            "Do you feel guilty or tearful for no reason?","Do you find yourself avoiding friends and family?"

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
