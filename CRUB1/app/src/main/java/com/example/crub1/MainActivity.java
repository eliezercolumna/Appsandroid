package com.example.crub1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText id, nombre,cedula;
    Button insertar,editar, cancelar, buscarporid, eliminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id = findViewById(R.id.txtid);
        nombre = findViewById(R.id.txtnombre);
        cedula = findViewById(R.id.txtcedula);
        insertar = findViewById(R.id.btninsertar);
        editar = findViewById(R.id.btneditar);
        cancelar = findViewById(R.id.btncancelar);
        buscarporid = findViewById(R.id.btnbuscar_id);
        eliminar = findViewById(R.id.btneliminar);

        insertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(getApplicationContext(),"administation",null,1);
                SQLiteDatabase bd = admin.getWritableDatabase();
                String codigo = id.getText().toString();
                String nom = nombre.getText().toString();
                String ced = cedula.getText().toString();
                ContentValues dates = new ContentValues();
                dates.put("id",codigo);
                dates.put("nombre",nom);
                dates.put("cedula",ced);
                bd.insert("datos",null,dates);
                bd.close();
                id.setText("");
                nombre.setText("");
                cedula.setText("");
                Toast.makeText(getApplicationContext(),"Se guardaron los datos",Toast.LENGTH_LONG).show();

            }
        });
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(getApplicationContext(),"administration",null,1);
                SQLiteDatabase bd = admin.getWritableDatabase();
                String codigo = id.getText().toString();
                String nom = nombre.getText().toString();
                String ced = cedula.getText().toString();
                ContentValues dates = new ContentValues();
                dates.put("id",codigo);
                dates.put("nombre",nom);
                dates.put("cedula",ced);
                int cant= bd.update("datos",dates,"id="+ codigo,null);
                bd.close();
                if(cant == 1)
                {
                    Toast.makeText(getApplicationContext(),"Se editaron los datos",Toast.LENGTH_LONG).show();

                }
                else{
                    Toast.makeText(getApplicationContext(),"No existe el dato con el codigo ingresado",Toast.LENGTH_LONG).show();
                }

            }
        });

    }

}