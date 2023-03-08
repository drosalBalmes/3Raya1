package com.example.a3raya1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.a3raya1.R;
import com.example.a3raya1.objects.User;

public class WinActivity extends AppCompatActivity {
    User user;
    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
        textView = findViewById(R.id.text_ganar);

        if(getIntent().getExtras() != null) {
            user = (User) getIntent().getSerializableExtra("user");
        }
        textView.setText(user.getUsername() + " GANA!");
    }


    public void playAgain(View view){
        Intent intent = new Intent(WinActivity.this, Play.class);
        startActivity(intent);
    }

    public void toMenu3(View view){
        Intent intent = new Intent(WinActivity.this,Menu.class);
        startActivity(intent);
    }
}