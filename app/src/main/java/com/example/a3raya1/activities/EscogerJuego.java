package com.example.a3raya1.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a3raya1.R;
import com.example.a3raya1.objects.User;

public class EscogerJuego extends AppCompatActivity {

    EditText inputJoin;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escoger_juego);
        inputJoin = findViewById(R.id.inputCustom);
        if(getIntent().getExtras() != null) {
            user = (User) getIntent().getSerializableExtra("user");
        }
    }

    public void toPlayChose(View view){
        Intent intent = new Intent(EscogerJuego.this,Play.class);
        intent.putExtra("user",user);
        startActivity(intent);
    }

    public void toSettingsOff(View view){
        Intent intent = new Intent(EscogerJuego.this,SettingsOffline.class);
        intent.putExtra("user",user);
        startActivity(intent);
    }
    public void toCustomLobbyJoin(View view){
        Intent intent = new Intent(EscogerJuego.this,CustomLobby.class);
        intent.putExtra("user",user);
        intent.putExtra("codeCustom",String.valueOf(inputJoin.getText()));
        startActivity(intent);
    }

    public void toCustomLobbyCustom(View view){
        Intent intent = new Intent(EscogerJuego.this,CustomLobby.class);
        intent.putExtra("user",user);
        intent.putExtra("codeCustom","K3LMO");
        startActivity(intent);
    }
}