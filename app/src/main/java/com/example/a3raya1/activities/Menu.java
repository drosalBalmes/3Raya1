package com.example.a3raya1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.example.a3raya1.R;
import com.example.a3raya1.objects.User;

public class Menu extends AppCompatActivity {
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        if(getIntent().getExtras() != null) {
            user = (User) getIntent().getSerializableExtra("user");
            user.setpGanadass(234);
            user.setpJugadas(468);
            user.setpPerdidas(234);
            user.setElo(137);
            user.setWinRate(50);
        }

    }

    public void toShop(View view){
        Intent intent = new Intent(Menu.this, Shop.class);
        startActivity(intent);
    }

    public void toShopCurrency(View view){
        Intent intent = new Intent(Menu.this,ShopCurrency.class);
        startActivity(intent);
    }

    public void toHistorial(View view){
        Intent intent = new Intent(Menu.this, Historial.class);
        startActivity(intent);
    }

    public void toRanking(View view){
        Intent intent = new Intent(Menu.this,Ranking.class);
        startActivity(intent);
    }

    public void toProfile(View view){
        Intent intent = new Intent(Menu.this,Profile.class);
        intent.putExtra("user",user);
        startActivity(intent);
    }

    public void toPlayMenu(View view){
        Intent intent = new Intent(Menu.this,EscogerJuego.class);
        intent.putExtra("user",user);
        startActivity(intent);
    }
}