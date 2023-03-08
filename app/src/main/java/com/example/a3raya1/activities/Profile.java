package com.example.a3raya1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.a3raya1.R;
import com.example.a3raya1.objects.User;

import java.util.ArrayList;
import java.util.List;

public class Profile extends AppCompatActivity {
    User user;
    List<String> data;
    TextView tv;
    TextView tvtest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        tv = findViewById(R.id.user);
        tvtest = findViewById(R.id.tester);
        if(getIntent().getExtras() != null) {
            user = (User) getIntent().getSerializableExtra("user");
        }
        data = new ArrayList<>();
        tv.setText(user.getUsername());
        data.add("Partidas jugadas: " + user.getpJugadas() + "\n \n");
        data.add("Partidas Ganadas: " + user.getpGanadass() + "\n \n");
        data.add("Partidas Perdidas: " + user.getpPerdidas() + "\n \n");
        data.add("Porcentaje de victorias: " + user.getWinRate() + "%\n \n");
        data.add("Puntuación clasificatoria: " + user.getElo());

        StringBuilder stringBuilder = new StringBuilder("");
        for (String s: data) {
            stringBuilder.append(s);
        }

        tvtest.setText(stringBuilder);
    }


    public void toFriends(View view){
        Intent intent = new Intent(Profile.this,FriendList.class);
        startActivity(intent);
    }

    public void toInventario(View view){
        Intent intent = new Intent(Profile.this,Inventory.class);
        startActivity(intent);
    }
}