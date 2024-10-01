package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView set_text= findViewById(R.id.set_text);
        Button assignment= findViewById(R.id.assignment);
        assignment.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this, Assignments.class);
            startActivity(intent);
        });
        Button schoolButton = findViewById(R.id.scl);
        schoolButton.setOnClickListener(v -> {
            set_text.setText("School is Barlekha Girls High School");
        });

        Button clgButton = findViewById(R.id.clg);
        clgButton.setOnClickListener(v -> {
            set_text.setText("College is MC College");
        });

        Button uniButton = findViewById(R.id.varsity);
        uniButton.setOnClickListener(v -> {
            set_text.setText("University is Leading University");
        });

        Button address = findViewById(R.id.add);
        address.setOnClickListener(v -> {
            set_text.setText("Address is Amberkhana, Loharpara");
        });

        ImageView pic=findViewById(R.id.my_pic);
        pic.setOnClickListener(v ->{
            Toast.makeText(MainActivity.this, "It's Anindita's picture", Toast.LENGTH_LONG).show();
            pic.setImageResource(R.drawable.new_pic);
        });

    }
}