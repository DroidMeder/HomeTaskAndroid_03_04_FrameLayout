package com.example.hometaskandroid_03_04_framelayout;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new BlankFragment()).commit();
    }

}