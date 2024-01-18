package com.example.helloworld_2024;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_click (View v) {

        TextView tv_msg = findViewById(R.id.msg);

        Toast.makeText(getApplicationContext(), "This is a simple Toast", Toast.LENGTH_SHORT).show();


        tv_msg.setText("Welcome to CSIT 551");


    }
}