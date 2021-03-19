package com.example.archivo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    EditText multiline;
    Button guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        multiline = findViewById(R.id.multi_Text);
        guardar = findViewById(R.id.btnguardar);
        String[] archivos = fileList();
        if (existe(archivos,"datos.txt"))
        {
            try {
                InputStreamReader archive = new InputStreamReader(openFileInput("datos.txt"));
                BufferedReader br = new BufferedReader(archive);
                String line = br.readLine();
                String primer_archivo ="";
                while (line != null)
                {
                    primer_archivo = primer_archivo + line+ "\n";
                    line = br.readLine();
                }
                br.close();
                archive.close();
                multiline.setText(primer_archivo);


            } catch (IOException e) {
                e.printStackTrace();
            }


        }


        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    OutputStreamWriter arch = new OutputStreamWriter(openFileOutput("datos.txt", Activity.MODE_PRIVATE));
                    arch.write(multiline.getText().toString());
                    arch.flush();
                    arch.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(getApplicationContext(),"datos guardados", Toast.LENGTH_LONG).show();
                finish();
            }
        });


    }

    private boolean existe(String[] archivos, String s) {
        for (int f= 0; f<archivos.length; f++)
        {
            if (s.equals(archivos[f]))
            {
                return true;

            }
        }
        return false;
    }


}