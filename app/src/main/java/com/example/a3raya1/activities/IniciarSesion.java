package com.example.a3raya1.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a3raya1.R;
import com.example.a3raya1.User;

public class IniciarSesion extends AppCompatActivity {
    CheckBox chckbxShow;
    EditText inputUsername;
    EditText inputContra;
    Button buttonMenu;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
        chckbxShow = findViewById(R.id.chkbxShow);
        inputContra = findViewById(R.id.inputContra);
        inputUsername = findViewById(R.id.inputNom);
        buttonMenu = findViewById(R.id.btnIniciar);
        if(getIntent().getExtras() != null) {
            user = (User) getIntent().getSerializableExtra("user");
        }

        chckbxShow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
                if ((chckbxShow.isChecked())) {
                    inputContra.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_NORMAL);
                } else {
                    inputContra.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
            }
        });
    }


    public void toMenu2(View view) {
        if (user.getUsername().equals(inputUsername.getText().toString()) || inputUsername.getText().toString().equals("") ){
            if (user.getContraseña().equals(inputContra.getText().toString()) || inputUsername.getText().toString().equals("")){
                Intent intent = new Intent(IniciarSesion.this, Menu.class);
                intent.putExtra("user", user);
                startActivity(intent);
            } else {
                Toast.makeText(IniciarSesion.this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show();

            }
        } else {
            Toast.makeText(IniciarSesion.this, "Nombre de usuario incorrecto", Toast.LENGTH_SHORT).show();
        }
    }
    public void toCrearCuenta(View view){
        Intent intent = new Intent(IniciarSesion.this, CrearSesion.class);
        startActivity(intent);
    }
}