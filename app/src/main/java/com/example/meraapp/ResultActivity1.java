package com.example.meraapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity1 extends AppCompatActivity {
    TextView Grade1,FinalScore1,result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);

        FinalScore1=(TextView)findViewById(R.id.finalScore1);
        Grade1=(TextView)findViewById(R.id.grade1);
        result1=(TextView)findViewById(R.id.result1);
        Bundle bundle1=getIntent().getExtras();
        int score1=bundle1.getInt("Final Score");
        FinalScore1.setText("You scored"+ "\t\t" + score1);
        if(score1>15&&score1<=21)
        {
            result1.setText("Severe Anxiety");
            Grade1.setText("You results indicate that you are experiencing symptoms of severe anxiety. ");
        }
        if(score1>10&&score1<15)
        {
            result1.setText("Moderate Anxiety");
            Grade1.setText(" \t \t Your results indicate that you may be experiencing symptoms of moderate anxiety.Based on your answers,living with these symptoms could be causing difficulty managing relationshpis and even the tasks of everyday life.These results  do not mean you have anxiety,but it may be time to start a conversation with a mental health professional."

                    );
        }
        if(score1>1&&score1<9)
        {
            result1.setText("Minimal Anxiety");
            Grade1.setText("Your results indicate that you have no,or very few symtoms of anxiety");
        }

    }
}
