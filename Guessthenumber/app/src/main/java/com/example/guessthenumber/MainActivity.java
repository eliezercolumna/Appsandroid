package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btncli;
    EditText num1, num2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncli=(Button) findViewById(R.id.btnclick);
        num1 = (EditText) findViewById(R.id.txtNum1);
        num2 =(EditText) findViewById(R.id.txtNum2);
        result = (TextView) findViewById(R.id.txtResult);

        btncli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1, numero2;
                int resultado;
                numero1 = Integer.parseInt(num1.getText().toString());
                numero2 = Integer.parseInt(num2.getText().toString());
                if(numero1>numero2)
                {
                    resultado =numero1;
                    result.setText(String.valueOf("Es mayor:"+resultado));


                }
                else if(numero1==numero2)
                {
                    result.setText(String.valueOf("Son iguales:"+ numero1));
                }
                else
                {
                    resultado = numero2;
                    result.setText(String.valueOf("Es mayor:"+resultado));

                }

            }
        });
    }
}