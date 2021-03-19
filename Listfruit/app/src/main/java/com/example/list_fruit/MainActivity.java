package com.example.list_fruit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    ArrayList<String> frutas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.lista);
        frutas = new ArrayList<>();
        frutas.add("grapes");
        frutas.add("apple");
        frutas.add("strawberry");
        frutas.add("mango");
        frutas.add("pineapple");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,frutas);
        list.setAdapter(adapter);

    }
}