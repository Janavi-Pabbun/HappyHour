package com.example.meraapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class quizActivity1 extends AppCompatActivity {
    private QuestionLibrary1 questionLibrary1 = new QuestionLibrary1();

    private TextView QuestionView1, Questionno;
    private Button Buttonchoice11;
    private Button Buttonchoice22;
    private Button Buttonchoice33;
    private Button Buttonchoice44;
    private String Answer1;
    private int Score1 = 0;
    private int QuestionNumber1 = 0;
    private int number = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);


        QuestionView1 = (TextView) findViewById(R.id.question1);
        Questionno = (TextView) findViewById(R.id.questionno);
        Buttonchoice11 = (Button) findViewById(R.id.choice11);
        Buttonchoice22 = (Button) findViewById(R.id.choice22);
        Buttonchoice33 = (Button) findViewById(R.id.choice33);
        Buttonchoice44 = (Button) findViewById(R.id.choice44);

        updateQuestion1();



        Buttonchoice11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Buttonchoice11.getText() == Answer1) {


                    if (QuestionNumber1 == questionLibrary1.Questions1.length) {
                        Intent intent1 = new Intent(quizActivity1.this, ResultActivity1.class);
                        Bundle bundle1 = new Bundle();
                        bundle1.putInt("Final Score", Score1);
                        intent1.putExtras(bundle1);
                        quizActivity1.this.finish();
                        startActivity(intent1);
                    } else {


                        updateQuestion1();
                    }
                } else {

                    if (QuestionNumber1 == questionLibrary1.Questions1.length) {
                        Intent intent1 = new Intent(quizActivity1.this, ResultActivity1.class);
                        Bundle bundle1 = new Bundle();
                        bundle1.putInt("Final Score", Score1);
                        intent1.putExtras(bundle1);
                        quizActivity1.this.finish();
                        startActivity(intent1);
                    } else {


                        updateQuestion1();
                    }

                }

            }
        });

        Buttonchoice22.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  if (Buttonchoice22.getText() == Answer1) {

                                                      if (QuestionNumber1 == questionLibrary1.Questions1.length) {
                                                          Intent intent1 = new Intent(quizActivity1.this, ResultActivity1.class);
                                                          Bundle bundle1 = new Bundle();
                                                          bundle1.putInt("Final Score", Score1);
                                                          intent1.putExtras(bundle1);
                                                          quizActivity1.this.finish();
                                                          startActivity(intent1);
                                                      } else {


                                                          updateQuestion1();
                                                      }
                                                  } else {
                                                      Score1++;

                                                      if (QuestionNumber1 == questionLibrary1.Questions1.length) {
                                                          Intent intent1 = new Intent(quizActivity1.this, ResultActivity1.class);
                                                          Bundle bundle1 = new Bundle();
                                                          bundle1.putInt("Final Score", Score1);
                                                          intent1.putExtras(bundle1);
                                                          quizActivity1.this.finish();
                                                          startActivity(intent1);
                                                      } else {


                                                          updateQuestion1();
                                                      }

                                                  }


                                              }
                                          }
        );

        Buttonchoice33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Buttonchoice33.getText() == Answer1) {
                    Score1 = Score1 + 2;

                    if (QuestionNumber1 == questionLibrary1.Questions1.length) {
                        Intent intent1 = new Intent(quizActivity1.this, ResultActivity1.class);
                        Bundle bundle1 = new Bundle();
                        bundle1.putInt("Final Score", Score1);
                        intent1.putExtras(bundle1);
                        quizActivity1.this.finish();
                        startActivity(intent1);
                    } else {


                        updateQuestion1();
                    }
                } else {
                    Score1 = Score1 + 2;

                    if (QuestionNumber1 == questionLibrary1.Questions1.length) {
                        Intent intent1 = new Intent(quizActivity1.this, ResultActivity1.class);
                        Bundle bundle1 = new Bundle();
                        bundle1.putInt("Final Score", Score1);
                        intent1.putExtras(bundle1);
                        quizActivity1.this.finish();
                        startActivity(intent1);
                    } else {


                        updateQuestion1();
                    }
                }

            }

        });

        Buttonchoice44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Buttonchoice44.getText() == Answer1) {
                    Score1 = Score1 + 3;

                    if (QuestionNumber1 == questionLibrary1.Questions1.length) {
                        Intent intent1 = new Intent(quizActivity1.this, ResultActivity1.class);
                        Bundle bundle1 = new Bundle();
                        bundle1.putInt("Final Score", Score1);
                        intent1.putExtras(bundle1);
                        quizActivity1.this.finish();
                        startActivity(intent1);
                    } else {


                        updateQuestion1();

                    }
                } else {
                    if (QuestionNumber1 == questionLibrary1.Questions1.length) {
                        Intent intent1 = new Intent(quizActivity1.this, ResultActivity1.class);
                        Bundle bundle1 = new Bundle();
                        bundle1.putInt("Final Score", Score1);
                        intent1.putExtras(bundle1);
                        quizActivity1.this.finish();
                        startActivity(intent1);
                    } else {


                        updateQuestion1();

                    }
                }
            }
        });

    }

    private void updateQuestion1() {
        QuestionView1.setText(questionLibrary1.getQuestion1(QuestionNumber1));
        Buttonchoice11.setText(questionLibrary1.getchoice11(QuestionNumber1));
        Buttonchoice22.setText(questionLibrary1.getchoice22(QuestionNumber1));
        Buttonchoice33.setText(questionLibrary1.getchoice33(QuestionNumber1));
        Buttonchoice44.setText(questionLibrary1.getchoice44(QuestionNumber1));


        Answer1 = questionLibrary1.getcorrectAnswer1(QuestionNumber1);
        QuestionNumber1++;
        Questionno.setText(QuestionNumber1 + "\t" + "of" + "\t" + questionLibrary1.Questions1.length);

    }


}