package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText txtNum1, txtNum2;
    TextView txtResult;
    Button btnSumar_main, btnRestar, btnDividir, btnMulti,btnDelete;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btnSumar_main=(Button) findViewById(R.id.btnSumar_main);
       btnRestar= (Button) findViewById(R.id.btnRestar);
       btnDividir= (Button)  findViewById(R.id.btnDividir);
        btnMulti= (Button)  findViewById(R.id.btnMulti);
        btnDelete = (Button) findViewById(R.id.btnDelete);
       txtNum1= (EditText) findViewById(R.id.txtNum1);
       txtNum2= (EditText) findViewById(R.id.txtNum2);
       txtResult= (TextView) findViewById(R.id.txtResult);

        btnSumar_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(txtNum1.getText().toString());
                int num2= Integer.parseInt(txtNum2.getText().toString());
                int result = num1 + num2;
                txtResult.setText(String.valueOf(result));
            }
        });
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(txtNum1.getText().toString());
                int num2= Integer.parseInt(txtNum2.getText().toString());
                int result = num1 - num2;
                txtResult.setText(String.valueOf(result));
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1= Integer.parseInt(txtNum1.getText().toString());
                double num2= Integer.parseInt(txtNum2.getText().toString());
                double result = num1 / num2;
                txtResult.setText(String.valueOf(result));
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(txtNum1.getText().toString());
                int num2= Integer.parseInt(txtNum2.getText().toString());
                int result = num1 * num2;
                txtResult.setText(String.valueOf(result));
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNum1.setText("");
                txtNum2.setText("");
                txtResult.setText("");
            }
        });


    }








}