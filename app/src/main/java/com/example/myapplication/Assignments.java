package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Assignments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignments);
        Button a2= findViewById(R.id.a2);
        Button a3= findViewById(R.id.a3);
        Button a4= findViewById(R.id.a4);
        Button a5= findViewById(R.id.a5);
        a2.setOnClickListener(v ->{
            Intent intent = new Intent(Assignments.this, Assignment2.class);
            startActivity(intent);
        });
        a3.setOnClickListener(v ->{
            Intent intent = new Intent(Assignments.this, Assignment3.class);
            startActivity(intent);
        });
        a4.setOnClickListener(v ->{
            Intent intent = new Intent(Assignments.this, Assignment4.class);
            startActivity(intent);
        });
        a5.setOnClickListener(v ->{
            Intent intent = new Intent(Assignments.this, ExpandableListActivity.class);
            startActivity(intent);
        });

    }
}