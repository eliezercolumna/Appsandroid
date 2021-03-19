package com.example.email;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.txt_email);
        send = findViewById(R.id.btnguardar);

        SharedPreferences shap = getSharedPreferences("information", Context.MODE_PRIVATE);
        email.setText(shap.getString("mail",""));


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               SharedPreferences preferences = getSharedPreferences("information",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("mail",email.getText().toString());
                Toast.makeText(getApplicationContext(),"email sent", Toast.LENGTH_LONG).show();
                editor.commit();
                finish();





            }
        });

    }

}