package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.Adapter.ListAdapter;
import com.example.myapplication.R;
//import com.example.myapplication.main.adapter.CustomAdapterC;
//import com.example.myapplication.main.adapter.TechAdapter;

public class Assignment4 extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_assignment4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        listView = findViewById(R.id.listView);
        String[] title = getResources().getStringArray(R.array.tech_array);
        String[] subtitle ={
                "Harry Potter and the Philosopher's Stone","Harry Potter and the Chamber of Secrets",
                "Harry Potter and the Prisoner of Azkaban","Harry Potter and the Goblet of Fire",
                "Harry Potter and the Order of the Phoenix", "Harry Potter and the Half-Blood Prince",
                "Harry Potter and the Deathly Hallows: Part 1", "Harry Potter and the Deathly Hallows: Part 2"

        };
        Integer[] imgid= {R.drawable.hp1, R.drawable.hp2, R.drawable.hp3, R.drawable.hp4,
                R.drawable.hp5, R.drawable.hp6, R.drawable.hp7,R.drawable.hp7_1};


        ListAdapter adapter = new ListAdapter(this, title, subtitle, imgid);

        listView.setAdapter(adapter);
    }
}