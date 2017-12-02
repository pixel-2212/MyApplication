package com.example.pixel.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void iniciarSesion(View view){
        EditText user = (EditText)findViewById(R.id.user);
        EditText pass = (EditText)findViewById(R.id.pass);
        String u = user.getText().toString();
        String p = pass.getText().toString();
        boolean enviarOk=false;
        if (Objects.equals(u, "ven1") && Objects.equals(p, "12345") || Objects.equals(u, "ven2") && Objects.equals(p, "54321")){
            enviarOk=true;
        }
        if (enviarOk){
            Intent intent=new Intent(this,Opciones.class);
            startActivity(intent);
        }else{
            Toast msgError=Toast.makeText(this,"Usuario o contraseña incorrecta",Toast.LENGTH_SHORT);
            msgError.show();
        }
    }
}
