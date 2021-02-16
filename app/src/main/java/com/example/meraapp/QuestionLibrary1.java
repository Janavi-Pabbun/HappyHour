package com.example.meraapp;

public class QuestionLibrary1
{
    public String Questions1[]={
            "Do you experience intense anxiety or worry and find it difficult to control?",
            "   Do worry or anxiety make you feel fatigued or feel irritable?"," Does worry or anxiety interfere with your sleep or ability to concentrate?",
            "Do you experience repetitive and persistent thoughts that are upsetting and unwanted?","Do you experience strong fear that causes panic,shortness of breath,chest pains,a pounding heart,sweating?",
            "DO you ever avoid places or social for fear of this panic?","Do you ever engage in repetitive behaviors to manage your worry?"

    };
    private String choices1[][]={
            {"Never","Rarely","Sometimes","Often"},
            {"Never","Rarely","Sometimes","Often"},
            {"Never","Rarely","Sometimes","Often"},
            {"Never","Rarely","Sometimes","Often"},
            {"Never","Rarely","Sometimes","Often"},{"Never","Rarely","Sometimes","Often"},{"Never","Rarely","Sometimes","Often"},

              };
    private String CorrectAnswers1[]={"Never","Never","Never","Never","Never","Never","Never"};

    public String getQuestion1(int a)
    {
        String Question1 =Questions1[a];
        return Question1;
    }
    public String getchoice11(int a)
    {
        String choice00 =choices1[a][0];
        return choice00;
    }

    public String getchoice22(int a)
    {
        String choice11=choices1[a][1];
        return choice11;
    }
    public String getchoice33(int a)
    {
        String choice22 =choices1[a][2];
        return choice22;
    }
    public String getchoice44(int a)
    {

        String choice33 =choices1[a][3];
        return choice33;
    }
    public String getcorrectAnswer1(int a)
    {
        String answer1 =CorrectAnswers1[a];
        return answer1;
    }
}
