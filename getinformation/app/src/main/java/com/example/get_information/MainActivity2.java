package com.example.get_information;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    Button finalizar;
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        finalizar = (Button) findViewById(R.id.btnfinalizar);
        webView = (WebView) findViewById(R.id.webview);
        Bundle bun = getIntent().getExtras();
        String information = bun.getString("url");
        webView.loadUrl("https://"+ information);
        
        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}