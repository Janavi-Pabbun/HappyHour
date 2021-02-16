package com.example.meraapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.botnav);
        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavmethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new dashboard()).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavmethod=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment=null;
            switch(item.getItemId())
            {

                case R.id.dashboard:
                    fragment=new dashboard();
                    break;
                case R.id.quiz:
                    fragment=new quiz();
                    break;
                case R.id.music:
                    fragment=new newTabFragment();
                    break;







            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
            return true;
        }
    };
}
