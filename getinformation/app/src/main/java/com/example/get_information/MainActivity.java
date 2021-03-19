package com.example.get_information;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button search_button;
    EditText barra_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search_button = (Button) findViewById(R.id.btnsearch);
        barra_edit = (EditText) findViewById(R.id.txtbarra);

        search_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(getApplicationContext(), MainActivity2.class);
                inte.putExtra("url",barra_edit.getText().toString());
                startActivity(inte);
            }
        });


    }

}