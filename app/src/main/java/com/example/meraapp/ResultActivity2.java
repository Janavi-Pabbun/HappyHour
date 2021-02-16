package com.example.meraapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity2 extends AppCompatActivity {
    TextView Grade,FinalScore,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);

        FinalScore=(TextView)findViewById(R.id.finalScore);
        Grade=(TextView)findViewById(R.id.grade);
        result=(TextView)findViewById(R.id.result);
        Bundle bundle=getIntent().getExtras();
        int score=bundle.getInt("Final Score");
        FinalScore.setText("You scored \t\t"+score);
        if(score>15&&score<=21)
        {
            result.setText("Severe Anxiety");
            Grade.setText("You results indicate that you are experiencing symptoms of severe anxiety. ");
        }
        if(score>10&&score<15)
        {
            result.setText("Mild Anxiety");
            Grade.setText("Your results indicate that you are experiencing mild anxiety");
        }
        if(score>1&&score<9)
        {
            result.setText("Minimal Depression");
            Grade.setText("Your results indicate that you have none,or very few symtoms of Depression.If you notice that your symptoms aren'/t improving,you may want to bring them up with a mental health professional or someone who is supporting you.");
        }

    }
}
