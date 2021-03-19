package com.example.settings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nombre,apellido,telefono,whatsapp,direccion;
    Button guardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.txtnombre);
        apellido = findViewById(R.id.txtapellido);
        telefono = findViewById(R.id.txt_telefono);
        whatsapp = findViewById(R.id.txtwhatsapp);
        direccion = findViewById(R.id.txtdireccion);
        guardar = findViewById(R.id.btnguardar);

        SharedPreferences shared = getSharedPreferences("settings", Context.MODE_PRIVATE);
        nombre.setText(shared.getString("nombre",""));
        apellido.setText(shared.getString("apellido",""));
        telefono.setText(shared.getString("telefono",""));
        whatsapp.setText(shared.getString("whatsapp",""));
        direccion.setText(shared.getString("direccion",""));


        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("settings",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("nombre",nombre.getText().toString());
                editor.putString("apellido",apellido.getText().toString());
                editor.putString("telefono",telefono.getText().toString());
                editor.putString("whatsapp",whatsapp.getText().toString());
                editor.putString("direccion",direccion.getText().toString());
                Toast.makeText(getApplicationContext(),"datos enviados",Toast.LENGTH_LONG).show();

                editor.commit();
                finish();


            }
        });




    }


}