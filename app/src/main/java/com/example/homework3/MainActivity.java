package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.DoubleAdder;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvNotes;
    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvNotes = findViewById(R.id.rv_notes);
        rvNotes.setLayoutManager(new LinearLayoutManager(this));
        List<String> list = new ArrayList<>();
        adapter = new RecyclerAdapter(list,this);
        list.add("Програмирования");
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        list.add("Groovy" );
        rvNotes.setAdapter(adapter);
    }
}