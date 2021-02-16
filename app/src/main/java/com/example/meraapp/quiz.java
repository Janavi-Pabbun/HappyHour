package com.example.meraapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class quiz extends Fragment {


    public quiz() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_quiz, container, false);

         ImageView please2= view.findViewById(R.id.qbutton);
        please2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(getActivity(),quizActivity1.class);
               startActivity(intent);

            }
        });
        ImageView stress=view.findViewById(R.id.sbutton);
        {
            stress.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(getActivity(),quizActivity.class);
                    startActivity(intent);
                }
            });
        }
        final ImageView quiz2= view.findViewById(R.id.dbutton);
        quiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),quizActivity2.class);
                startActivity(intent);

            }
        });

        return view;
    }
}
