package com.example.a3raya1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.a3raya1.R;

public class ShopCurrency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_currency);
    }

    public void toPay(View view){
        Intent intent = new Intent(ShopCurrency.this,PayCurrency.class);
        startActivity(intent);
    }
}