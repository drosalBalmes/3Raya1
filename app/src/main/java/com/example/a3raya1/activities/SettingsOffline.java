package com.example.a3raya1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.a3raya1.R;
import com.example.a3raya1.objects.User;

public class SettingsOffline extends AppCompatActivity {
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_offline);
        if(getIntent().getExtras() != null) {
            user = (User) getIntent().getSerializableExtra("user");
        }
    }

    public void toPlaySetOf(View view){
        Intent intent = new Intent(SettingsOffline.this,Play.class);
        intent.putExtra("user",user);
        startActivity(intent);
    }
}