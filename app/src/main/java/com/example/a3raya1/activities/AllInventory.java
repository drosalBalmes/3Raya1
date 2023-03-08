package com.example.a3raya1.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.a3raya1.LayoutManager.ScaleCenterItemLayoutManager;
import com.example.a3raya1.R;
import com.example.a3raya1.adapters.AdapterSkin;
import com.example.a3raya1.objects.Skin;

import java.util.ArrayList;

public class AllInventory extends AppCompatActivity {

    RecyclerView rv1;
    RecyclerView rv2;
    ArrayList<Skin> dataSource;
    ScaleCenterItemLayoutManager linearLayoutManager;
    AdapterSkin adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_inventory);

        rv1 = findViewById(R.id.horizontalRv);
        rv2 = findViewById(R.id.horizontalRv2);

        //First recycler
        dataSource = new ArrayList<>();
        dataSource.add(new Skin("First", R.drawable.ic_launcher_background));
        dataSource.add(new Skin("Luffy", R.drawable.luffy_skin));
        dataSource.add(new Skin("Third", R.drawable.ic_launcher_background));
        dataSource.add(new Skin("xd", R.drawable.ic_launcher_background));

        linearLayoutManager = new ScaleCenterItemLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        adapter = new AdapterSkin(dataSource);
        rv1.setLayoutManager(linearLayoutManager);
        rv1.setAdapter(adapter);


        //Second recycler
        dataSource = new ArrayList<>();
        dataSource.add(new Skin("1",R.drawable.ic_launcher_background));
        dataSource.add(new Skin("2",R.drawable.ic_launcher_background));
        dataSource.add(new Skin("3",R.drawable.ic_launcher_background));
        dataSource.add(new Skin("Luffy",R.drawable.luffy_skin));
        dataSource.add(new Skin("5",R.drawable.ic_launcher_background));

        linearLayoutManager = new ScaleCenterItemLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        adapter = new AdapterSkin(dataSource);
        rv2.setLayoutManager(linearLayoutManager);
        rv2.setAdapter(adapter);
    }
}