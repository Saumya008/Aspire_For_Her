package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Blogs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blogs);
        CardView c1,c2,c3,c4;
        c1=(CardView)findViewById(R.id.c11);
        c2=(CardView)findViewById(R.id.c22);
        c3=(CardView)findViewById(R.id.c33);
        c4=(CardView)findViewById(R.id.c44);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://medium.com/aspire-for-her/neerspires-be-yourself-f569a92dfadb?id=com.example.myapplication2";
                Intent i1 = new Intent(Intent.ACTION_VIEW);
                i1.setData(Uri.parse(url));
                startActivity(i1);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://medium.com/aspire-for-her/women-in-espionage-f73b99f566a4?id=com.example.myapplication2";
                Intent i2 = new Intent(Intent.ACTION_VIEW);
                i2.setData(Uri.parse(url));
                startActivity(i2);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://medium.com/aspire-for-her/are-you-visualising-your-goal-8e9dfc3b4524?id=com.example.myapplication2";
                Intent i3 = new Intent(Intent.ACTION_VIEW);
                i3.setData(Uri.parse(url));
                startActivity(i3);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://medium.com/aspire-for-her/mind-the-gap-493002028361?id=com.example.myapplication2";
                Intent i4 = new Intent(Intent.ACTION_VIEW);
                i4.setData(Uri.parse(url));
                startActivity(i4);
            }
        });
    }
}