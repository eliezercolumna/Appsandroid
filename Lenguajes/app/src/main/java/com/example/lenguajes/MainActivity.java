package com.example.lenguajes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lenguajes;
    ArrayList<String> datos;
    String[] info = {"PHP fue creado por Rasmus Lerdorf en el año 1995","Java fue creado por James Gosling en el año 1995",
    "Go fue desarrollado en el 2009 por Robert Griesemer, Rob Pike y Ken Thompson.", "Kotlin fue creado en el 2016 por JetBrains",
            "Javascript fue creado en el 1995 por Netscape Communications, Fundación Mozilla", "CSharp fue creado en el 2000 por Microsoft",
            "Visual Basic fue creado en el 1992 por Alan Cooper"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lenguajes = (ListView) findViewById(R.id.list_lenguajes);

        datos = new ArrayList<>();
        datos.add("PHP");
        datos.add("JAVA");
        datos.add("GO");
        datos.add("KOTLIN");
        datos.add("JAVASCRIPT");
        datos.add("CSHARP");
        datos.add("VISUAL BASIC");

        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,datos);

        lenguajes.setAdapter(ad);
        lenguajes.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"lenguaje:"+ info[position],Toast.LENGTH_LONG).show();
                return false;
            }
        });






    }
}