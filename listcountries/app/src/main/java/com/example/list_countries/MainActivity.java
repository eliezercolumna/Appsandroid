package com.example.list_countries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView countries;
    TextView habitantes;
    ArrayList<String> datos;
    String[] habita = {"65, 761,117","32.581.000","309 349 689 ","126,000,000","2,726,667 ","45.376.763"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countries = (ListView) findViewById(R.id.list_countries);
        habitantes =(TextView) findViewById(R.id.txthabitantes);
        datos = new ArrayList<>();
        datos.add("Reino Unido");
        datos.add("Malasia");
        datos.add("EE.UU");
        datos.add("Mexico");
        datos.add("Jamaica");
        datos.add("Argentina");
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,datos);
        countries.setAdapter(adapter);
        countries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                habitantes.setText(adapter.getItem(position)+" tiene "+ habita[position]+" habitantes");
            }
        });



    }
}