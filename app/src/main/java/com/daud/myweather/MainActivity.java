package com.daud.myweather;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavView = findViewById(R.id.bottomNavView);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new  HomeFragment()).commit();

        bottomNavView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new  HomeFragment()).commit();
            }

            return true;
        });
    }
}