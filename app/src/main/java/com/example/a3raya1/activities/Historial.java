package com.example.a3raya1.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.a3raya1.ListAdapter;
import com.example.a3raya1.ListElement;
import com.example.a3raya1.R;

import java.util.ArrayList;
import java.util.List;

public class Historial extends AppCompatActivity {

    List<ListElement> elementList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);


        init();
    }

    public void init(){
        elementList = new ArrayList<>();
        elementList.add(new ListElement( "Hidibeis vs MPengu","Win"));
        elementList.add(new ListElement("Hidibeis vs AdriNM","Lose"));
        elementList.add(new ListElement("Hidibeis vs Souljiee","Win"));
        elementList.add(new ListElement("Hidibeis vs 8A","Win"));
        elementList.add(new ListElement("Hidibeis vs Swinger","Win"));
        elementList.add(new ListElement("Hidibeis vs Bot 3","Win"));
        elementList.add(new ListElement("Hidibeis vs Bot 2","Win"));
        elementList.add(new ListElement("Hidibeis vs Bot 1","Win"));


        ListAdapter listAdapter = new ListAdapter(elementList,this);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}