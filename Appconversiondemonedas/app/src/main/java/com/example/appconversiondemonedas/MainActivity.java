package com.example.appconversiondemonedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtValor1;
    TextView txtResult;
    RadioButton radio_dolar_americano, radio_euro, radio_libra_esterlina, radio_franco_suizo, radio_yen_japones, radio_dolar_hongkones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       radio_dolar_americano=(RadioButton) findViewById(R.id.radio_dolar_americano);
       radio_euro=(RadioButton) findViewById(R.id.radio_euro);
       radio_libra_esterlina=(RadioButton) findViewById(R.id.radio_libra_esterlina);
       radio_franco_suizo=(RadioButton) findViewById(R.id.radio_franco_suizo);
       radio_yen_japones= (RadioButton) findViewById(R.id.radio_yen_japones);
       radio_dolar_hongkones= (RadioButton)findViewById(R.id.radio_dolar_hongkones);
       txtValor1 = (EditText) findViewById(R.id.txtValor1);
       txtResult = (TextView) findViewById(R.id.txtResult);

       radio_dolar_americano.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               boolean checked = ((RadioButton) v).isChecked();
               if (checked)
               {
                   double dolar = Integer.parseInt(txtValor1.getText().toString());
                   double DOP = 58.50;
                   double result = dolar* DOP;
                   txtResult.setText(String.valueOf(result));



               }

           }


       });

        radio_euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                if (checked)
                {
                    double EUR = Integer.parseInt(txtValor1.getText().toString());
                    double DOP = 68.59;
                    double result = EUR* DOP;
                    txtResult.setText(String.valueOf(result));


                }
            }

        });
        radio_libra_esterlina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                if (checked)
                {
                    double Libra_esternina = Integer.parseInt(txtValor1.getText().toString());
                    double DOP = 80.18 ;
                    double result = Libra_esternina* DOP;
                    txtResult.setText(String.valueOf(result));


                }
            }

        });
        radio_franco_suizo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                if (checked)
                {
                    double CHF = Integer.parseInt(txtValor1.getText().toString());
                    double DOP = 62.02;
                    double result = CHF* DOP;
                    txtResult.setText(String.valueOf(result));


                }
            }

        });
        radio_yen_japones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                if (checked)
                {
                    double JPY = Integer.parseInt(txtValor1.getText().toString());
                    double DOP =0.53;
                    double result = JPY* DOP;
                    txtResult.setText(String.valueOf(result));


                }
            }

        });
        radio_dolar_hongkones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = ((RadioButton) v).isChecked();
                if (checked)
                {
                    double HKD = Integer.parseInt(txtValor1.getText().toString());
                    double DOP =7.42;
                    double result = HKD* DOP;
                    txtResult.setText(String.valueOf(result));


                }
            }

        });



    }


}