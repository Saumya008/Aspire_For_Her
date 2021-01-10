package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton b1,b2,b3,b4,b5;
        Button b;
        b1 =(ImageButton)findViewById(R.id.ib1);
        b2 =(ImageButton)findViewById(R.id.ib2);
        b3 =(ImageButton)findViewById(R.id.ib3);
        b4 =(ImageButton)findViewById(R.id.ib4);
        b5 =(ImageButton)findViewById(R.id.ib5);
        b=(Button)findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 =new Intent(getApplicationContext(),About_Us.class);
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 =new Intent(getApplicationContext(),Events.class);
                startActivity(i2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 =new Intent(getApplicationContext(),Explore.class);
                startActivity(i1);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 =new Intent(getApplicationContext(),Blogs.class);
                startActivity(i1);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 =new Intent(getApplicationContext(),Connect.class);
                startActivity(i3);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 =new Intent(getApplicationContext(),Sign_Up.class);
                startActivity(i1);
            }
        });
    }
}