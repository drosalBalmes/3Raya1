package com.example.a3raya1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a3raya1.R;
import com.example.a3raya1.objects.User;

public class CustomLobby extends AppCompatActivity {
    Button timerbtn;
    int x = 0;
    User user;
    TextView txtUser1;
    TextView txtCodigo;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_lobby);
        txtUser1 = findViewById(R.id.txtUser1);
        txtCodigo = findViewById(R.id.txt_codigo);

        if(getIntent().getExtras() != null) {
            user = (User) getIntent().getSerializableExtra("user");
            txtUser1.setText("" + user.getUsername() + ": W" + user.getpGanadass() + "/" + user.getpPerdidas());
        }
        if (getIntent().getSerializableExtra("codeCustom") != null){
            txtCodigo.setText("Codigo: " + getIntent().getSerializableExtra("codeCustom"));
        }

        timerbtn = findViewById(R.id.timerButtn);

        timerbtn.setOnClickListener(view -> setTimer());
    }


    @SuppressLint("SetTextI18n")
    public void setTimer() {
        x++;
        if (x == 1) {
            timerbtn.setText("Timer: 10Min");
        } else if (x == 2) {
            timerbtn.setText("Timer: 20Min");
        } else if (x == 3) {
            timerbtn.setText("Timer: ∞");
            x = 0;
        }
    }

    public void toPlayCustom(View view){
        Intent intent = new Intent(CustomLobby.this,Play.class);
        intent.putExtra("user",user);
        startActivity(intent);
    }
}