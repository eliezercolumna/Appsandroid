package com.example.buscararchivos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    EditText buscar, multiline;
    Button grabar,recuperar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buscar = findViewById(R.id.txtbuscar);
        multiline = findViewById(R.id.txt_multiline);
        grabar = findViewById(R.id.btngrabar);
        recuperar = findViewById(R.id.btnrecuperar);


        grabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre_archivo = buscar.getText().toString();
                try {
                    OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput(nombre_archivo, Activity.MODE_PRIVATE));
                    archivo.write(multiline.getText().toString());
                    archivo.flush();
                    archivo.close();
                } catch (IOException e) {
                }
                Toast.makeText(getApplicationContext(),"datos guardados",Toast.LENGTH_LONG).show();
                buscar.setText("");
                multiline.setText("");

            }
        });

        recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomarchivo = buscar.getText().toString();
                String[] archivos=fileList();
                boolean enco = false;
                for (int f = 0; f < archivos.length; f++)
                {
                    if (nomarchivo.equals(archivos[f]))
                    {
                        enco = true;
                        if (enco==true)
                        {
                            try {
                                InputStreamReader arch = new InputStreamReader(openFileInput(nomarchivo));
                                BufferedReader br = new BufferedReader(arch);
                                String line = br.readLine();
                                String datos = "";
                                while (line != null){
                                    datos = datos + line + "\n";
                                    line = br.readLine();
                                }
                                br.close();
                                arch.close();
                                multiline.setText(datos);



                            } catch (IOException e) {

                            }
                        }
                        else {
                            Toast.makeText(getApplicationContext(),"no hay archivos grabados",Toast.LENGTH_LONG).show();
                            multiline.setText("");
                        }
                    }

                }



            }
        });


    }
}