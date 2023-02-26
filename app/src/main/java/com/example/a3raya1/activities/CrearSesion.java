package com.example.a3raya1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a3raya1.R;
import com.example.a3raya1.User;

public class CrearSesion extends AppCompatActivity {
    EditText inputContra;
    EditText inputContraRepeat;
    EditText inputUsername;
    CheckBox checkBox1;
    CheckBox checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_sesion);
        inputContra = findViewById(R.id.inputcontra);
        inputContraRepeat = findViewById(R.id.inputcontrarepeat);
        inputUsername = findViewById(R.id.inputNom);
        checkBox1 = findViewById(R.id.chkbxShow);
        checkBox2 = findViewById(R.id.chkbxShow2);
        show(checkBox1, inputContra);
        show(checkBox2, inputContraRepeat);
    }


    public void show(CheckBox checkBox, EditText editText){
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) {
                if ((checkBox.isChecked())) {
                    editText.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_NORMAL);
                } else {
                    editText.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
            }
        });
    }

    public void back(View view){
        Intent intent = new Intent(CrearSesion.this,IniciarSesion.class);
        startActivity(intent);
    }


    //com passar Objectes:
    //https://gaandlaneeraja.medium.com/how-to-pass-objects-between-android-activities-86f2cfb61bd4

    public void sesionCreated(View view){
        Intent intent = new Intent(CrearSesion.this,IniciarSesion.class);
        if (!(inputUsername.getText().toString().equals(""))){
            if ((inputContra.getText().toString().equals(inputContraRepeat.getText().toString()))){
                User user = new User(inputUsername.getText().toString(),inputContra.getText().toString());
                intent.putExtra("user",user);
                startActivity(intent);
            } else {
                Toast.makeText(CrearSesion.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();

            }
        } else {
            Toast.makeText(CrearSesion.this, "Nombre de usuario no valido", Toast.LENGTH_SHORT).show();
        }
    }
}