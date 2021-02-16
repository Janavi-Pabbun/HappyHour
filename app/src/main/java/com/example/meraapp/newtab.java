package com.example.meraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class newtab extends AppCompatActivity {
private ArrayList<Music>arrayList;
private  customMusicAdapter adapter;
private ListView songList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newtab);
        songList=(ListView)findViewById(R.id.songList);
        arrayList=new ArrayList<>();
        arrayList.add(new Music("I guess I just Feel \n Like",R.raw.guess));
        arrayList.add(new Music("Kal ho na ho",R.raw.kal));
        arrayList.add(new Music("Love Yourself",R.raw.love));
        arrayList.add(new Music("Here comes the \n Sun",R.raw.sun));
        arrayList.add(new Music("Love you Zindagi",R.raw.luv));
        adapter=new customMusicAdapter(this,R.layout.music_item,arrayList);
        songList.setAdapter(adapter);



    }
}
