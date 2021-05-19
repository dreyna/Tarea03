package com.example.tarea03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edt1, edt2;
Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText) findViewById(R.id.usuario);
        edt2 = (EditText) findViewById(R.id.password);
        boton = (Button) findViewById(R.id.button5);

    }
    public void login(View view){
        String user = edt1.getText().toString();
        String pas = edt2.getText().toString();
        if(user.equals("breyna") && pas.equals("1234567")){
            Intent intet = new Intent(this,PrincipalActivity.class);
            intet.putExtra("usuario",user);
            startActivity(intet);
        }else{
            Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_LONG).show();
        }
    }
}