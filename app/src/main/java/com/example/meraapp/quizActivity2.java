package com.example.meraapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class quizActivity2 extends AppCompatActivity {
    private QuestionLibrary2 questionLibrary = new QuestionLibrary2();

    private TextView QuestionView,Questionno;
    private Button Buttonchoice1;
    private Button Buttonchoice2;
    private Button Buttonchoice3;
    private Button Buttonchoice4;
    private String Answer;
    private int Score = 0;
    private int QuestionNumber = 0;
    private int number=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);


        QuestionView = (TextView) findViewById(R.id.question);
        Questionno = (TextView) findViewById(R.id.questionno);
        Buttonchoice1 = (Button) findViewById(R.id.choice1);
        Buttonchoice2 = (Button) findViewById(R.id.choice2);
        Buttonchoice3 = (Button) findViewById(R.id.choice3);
        Buttonchoice4 = (Button) findViewById(R.id.choice4);

        updateQuestion();

        Buttonchoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Buttonchoice1.getText() == Answer) {


                    if (QuestionNumber == questionLibrary.Questions.length) {
                        Intent intent = new Intent(quizActivity2.this, ResultActivity2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("Final Score", Score);
                        intent.putExtras(bundle);
                        quizActivity2.this.finish();
                        startActivity(intent);
                    } else {


                        updateQuestion();
                    }
                }
                else{

                    if (QuestionNumber == questionLibrary.Questions.length) {
                        Intent intent = new Intent(quizActivity2.this, ResultActivity2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("Final Score", Score);
                        intent.putExtras(bundle);
                        quizActivity2.this.finish();
                        startActivity(intent);
                    } else {


                        updateQuestion();
                    }

                }

            }
        });
        Buttonchoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Buttonchoice2.getText() == Answer) {

                    if (QuestionNumber == questionLibrary.Questions.length) {
                        Intent intent = new Intent(quizActivity2.this, ResultActivity2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("Final Score", Score);
                        intent.putExtras(bundle);
                        quizActivity2.this.finish();
                        startActivity(intent);
                    } else {


                        updateQuestion();
                    }
                }
                else {
                    Score++;

                    if (QuestionNumber == questionLibrary.Questions.length) {
                        Intent intent = new Intent(quizActivity2.this, ResultActivity2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("Final Score", Score);
                        intent.putExtras(bundle);
                        quizActivity2.this.finish();
                        startActivity(intent);
                    } else {


                        updateQuestion();
                    }

                }


                }
            }
        );
        Buttonchoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Buttonchoice3.getText() == Answer) {
                    Score=Score+2;

                                        if (QuestionNumber == questionLibrary.Questions.length) {
                        Intent intent = new Intent(quizActivity2.this, ResultActivity2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("Final Score", Score);
                        intent.putExtras(bundle);
                        quizActivity2.this.finish();
                        startActivity(intent);
                    } else {


                        updateQuestion();
                    }
                }
                else{
                    Score=Score+2;

                    if (QuestionNumber == questionLibrary.Questions.length) {
                        Intent intent = new Intent(quizActivity2.this, ResultActivity2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("Final Score", Score);
                        intent.putExtras(bundle);
                        quizActivity2.this.finish();
                        startActivity(intent);
                    } else {


                        updateQuestion();
                    }}

        }

        });
        Buttonchoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Buttonchoice4.getText() == Answer) {
                    Score=Score+3;

                    if (QuestionNumber == questionLibrary.Questions.length) {
                        Intent intent = new Intent(quizActivity2.this, ResultActivity2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("Final Score", Score);
                        intent.putExtras(bundle);
                        quizActivity2.this.finish();
                        startActivity(intent);
                    } else {


                        updateQuestion();
                    }
                } else {
                    if (QuestionNumber == questionLibrary.Questions.length) {
                        Intent intent = new Intent(quizActivity2.this, ResultActivity2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("Final Score", Score);
                        intent.putExtras(bundle);
                        quizActivity2.this.finish();
                        startActivity(intent);
                    } else {


                        updateQuestion();
                    }
                }
            }
        });

    }

    private void updateQuestion() {
        QuestionView.setText(questionLibrary.getQuestion(QuestionNumber));
        Buttonchoice1.setText(questionLibrary.getchoice1(QuestionNumber));
        Buttonchoice2.setText(questionLibrary.getchoice2(QuestionNumber));
        Buttonchoice3.setText(questionLibrary.getchoice3(QuestionNumber));
        Buttonchoice4.setText(questionLibrary.getchoice4(QuestionNumber));


        Answer = questionLibrary.getcorrectAnswer(QuestionNumber);
QuestionNumber++;
        Questionno.setText(QuestionNumber + "\t" + "of" + "\t" + questionLibrary.Questions.length);
    }
}