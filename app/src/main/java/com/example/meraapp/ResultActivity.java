package com.example.meraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView Grade,FinalScore,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        FinalScore=(TextView)findViewById(R.id.finalScore);
        Grade=(TextView)findViewById(R.id.grade);
        result=(TextView)findViewById(R.id.result);
        Bundle bundle=getIntent().getExtras();
        int score=bundle.getInt("Final Score");
        FinalScore.setText("You scored \t\t"+score);
        if(score>15&&score<=21)
        {
            result.setText("Severe stress");
            Grade.setText("You results indicate that you are experiencing symptoms of severe stress.Based on your answers, these symptoms seem to be greatly interfering with your relationshpis and  the tasks of everyday life.These results  do not mean that you have anxiety,but we recommend you start a conversation with a mental health professional. ");
        }
        if(score>10&&score<15)
        {
            result.setText("Mild stress");
            Grade.setText("Your results indicate that you are experiencing mild stress");
        }
        if(score>1&&score<9)
        {
            result.setText("Minimal stress");
            Grade.setText("Your results indicate that you have no,or very few symtoms of stress");
        }

    }
}
