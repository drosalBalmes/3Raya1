package com.example.a3raya1.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.a3raya1.R;
import com.example.a3raya1.objects.User;

public class Play extends AppCompatActivity {
    Boolean torn = true;
    Boolean win = false;
    Drawable trans;
    Drawable drawableUserxx;
    User user1,user2;
    ImageView img01,img02,img03,img04,img05,img06,img07,img08,img09;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        if(getIntent().getExtras() != null) {
            user1 = (User) getIntent().getSerializableExtra("user");
        }else {
            user1 = new User();
            user1.setUsername("Player 1");
        }
        init();
    }


    public void init(){
        user2 = new User();
        user1.setSkin(R.drawable.chwerk);
        user2.setSkin(R.drawable.luffy_skin);
        trans = ContextCompat.getDrawable(this,R.drawable.trans);
        imgInit();
    }

    public void imgInit(){
        img01 = findViewById(R.id.img01);
        img02 = findViewById(R.id.img02);
        img03 = findViewById(R.id.img03);
        img04 = findViewById(R.id.img04);
        img05 = findViewById(R.id.img05);
        img06 = findViewById(R.id.img06);
        img07 = findViewById(R.id.img07);
        img08 = findViewById(R.id.img08);
        img09 = findViewById(R.id.img09);
        img01.setImageDrawable(trans);
        img02.setImageDrawable(trans);
        img03.setImageDrawable(trans);
        img04.setImageDrawable(trans);
        img05.setImageDrawable(trans);
        img06.setImageDrawable(trans);
        img07.setImageDrawable(trans);
        img08.setImageDrawable(trans);
        img09.setImageDrawable(trans);
    }


    public void getView(View view){
            if (torn) {
                drawableUserxx = ContextCompat.getDrawable(this,user1.getSkin());
                juegoMaybe(user1, view,drawableUserxx);
            } else {
                drawableUserxx = ContextCompat.getDrawable(this,user2.getSkin());
                user2.setUsername("Player 2");
                juegoMaybe(user2, view,drawableUserxx);
            }
    }

    public void juegoMaybe(User user, View view,Drawable drawableUser){

        ImageView imageView = (ImageView) view;
        Drawable drawable = imageView.getDrawable();
        if (user.getFichas() > 0) {
            if (drawable.getConstantState().equals(trans.getConstantState())) {
                // La imagen en la ImageView es igual a la imagen en el drawable (vacio)
                imageView.setImageDrawable(drawableUser);
                //imageView.setImageResource(user.getSkin());
                user.setFichas(+1);
                if (calculWin()){
                    Toast.makeText(this, "Win: " + user.getUsername(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Play.this,WinActivity.class);
                    intent.putExtra("user",user);
                    startActivity(intent);
                }
                torn = !torn;
            } else {
                // La imagen en la ImageView es diferente a la imagen en el drawable (vacio)
                Toast.makeText(this, "No se puede poner aqui", Toast.LENGTH_SHORT).show();
            }
        } else {
            quitarFicha(user,imageView,drawableUser);
        }
    }

    //play again{onCreate()}

    public void quitarFicha(User user, ImageView view,Drawable drawableUser){
        Drawable drawable = view.getDrawable();
        if (drawable.getConstantState().equals(drawableUser.getConstantState())){
            view.setImageDrawable(trans);
            //view.setImageResource(R.drawable.trans);
            user.setFichas(-1);
            //juegoMaybe(user,view);
        } else {
            Toast.makeText(this, "Esa no es tu ficha!", Toast.LENGTH_SHORT).show();
        }
    }


    public boolean calculWin(){
        //check rows
        if (!(img01.getDrawable().getConstantState().equals(trans.getConstantState())) && img01.getDrawable().getConstantState().equals(img02.getDrawable().getConstantState()) && img01.getDrawable().getConstantState().equals(img03.getDrawable().getConstantState())){
            win = true;
        }
        if(!(img04.getDrawable().getConstantState().equals(trans.getConstantState())) && img04.getDrawable().getConstantState().equals(img05.getDrawable().getConstantState()) && img04.getDrawable().getConstantState().equals(img06.getDrawable().getConstantState())){
            win = true;

        }
        if (!(img07.getDrawable().getConstantState().equals(trans.getConstantState())) && img07.getDrawable().getConstantState().equals(img08.getDrawable().getConstantState()) && img07.getDrawable().getConstantState().equals(img09.getDrawable().getConstantState())){
            win = true;

        }

        //check columns
        if (!(img01.getDrawable().getConstantState().equals(trans.getConstantState())) && img01.getDrawable().getConstantState().equals(img04.getDrawable().getConstantState()) && img01.getDrawable().getConstantState().equals(img07.getDrawable().getConstantState())){
            win = true;

        }
        if (!(img02.getDrawable().getConstantState().equals(trans.getConstantState())) && img02.getDrawable().getConstantState().equals(img05.getDrawable().getConstantState()) && img02.getDrawable().getConstantState().equals(img08.getDrawable().getConstantState())){
            win = true;

        }
        if (!(img03.getDrawable().getConstantState().equals(trans.getConstantState())) && img03.getDrawable().getConstantState().equals(img06.getDrawable().getConstantState()) && img03.getDrawable().getConstantState().equals(img09.getDrawable().getConstantState())){
            win = true;

        }

        //check diagonals
        if (!(img01.getDrawable().getConstantState().equals(trans.getConstantState())) && img01.getDrawable().getConstantState().equals(img05.getDrawable().getConstantState()) && img01.getDrawable().getConstantState().equals(img09.getDrawable().getConstantState())){
            win = true;

        }
        if (!(img03.getDrawable().getConstantState().equals(trans.getConstantState())) && img03.getDrawable().getConstantState().equals(img05.getDrawable().getConstantState()) && img03.getDrawable().getConstantState().equals(img07.getDrawable().getConstantState())){
            win = true;
        }
        return win;
    }


}