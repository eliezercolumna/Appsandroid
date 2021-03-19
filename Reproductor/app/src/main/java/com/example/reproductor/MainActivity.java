package com.example.reproductor;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView re;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        re = findViewById(R.id.txtreproducir);
        MediaPlayer m = MediaPlayer.create(this,R.raw.car);

    }

    public void reproducir(View view)
    {

        MediaPlayer.start();
        Toast.makeText(this,"Reproducciendo..",Toast.LENGTH_SHORT).show();

    }
    public void pausa(View view)
    {
        MediaPlayer.pause();
        Toast.makeText(this,"Pausando...",Toast.LENGTH_SHORT).show();

    }

    public void detener(View view)
    {

        MediaPlayer.stop();
        Toast.makeText(this,"Deteniendo...",Toast.LENGTH_SHORT).show();
    }
}