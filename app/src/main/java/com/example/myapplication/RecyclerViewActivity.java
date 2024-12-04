package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.Model.Model;
import com.example.myapplication.Adapter.RecyclerViewAdapter;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] title = getResources().getStringArray(R.array.tech_array);
        String[] subtitle ={
                "Harry Potter and the Philosopher's Stone","Harry Potter and the Chamber of Secrets",
                "Harry Potter and the Prisoner of Azkaban","Harry Potter and the Goblet of Fire",
                "Harry Potter and the Order of the Phoenix", "Harry Potter and the Half-Blood Prince",
                "Harry Potter and the Deathly Hallows: Part 1", "Harry Potter and the Deathly Hallows: Part 2"
        };
        Integer[] imgid= {R.drawable.hp1, R.drawable.hp2, R.drawable.hp3, R.drawable.hp4,
                R.drawable.hp5, R.drawable.hp6, R.drawable.hp7, R.drawable.hp7_1};
        ArrayList<Model> data = new ArrayList<>();

        for (int i = 0; i<title.length; i++){
            Model obj = new Model();
            obj.setTitle(title[i]);
            obj.setSubtitle(subtitle[i]);
            obj.setImageId(imgid[i]);
            data.add(obj);
        }

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(data, getApplicationContext());

        recyclerView.setAdapter(adapter);
    }
}