package com.example.appcheckbox_lenguajes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_press;
    CheckBox check_ja, check_javasc, check_goo, check_kotl, check_pyth, check_cc, check_scal, check_rub,
    check_swi,check_dar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check_ja = (CheckBox) findViewById(R.id.check_java);
        check_javasc = (CheckBox) findViewById(R.id.check_javascript);
        check_goo = (CheckBox) findViewById(R.id.check_go);
        check_kotl = (CheckBox) findViewById(R.id.check_kotlin);
        check_pyth =(CheckBox) findViewById(R.id.check_python);
        check_cc = (CheckBox) findViewById(R.id.check_c);
        check_scal = (CheckBox) findViewById(R.id.check_scala);
        check_rub = (CheckBox) findViewById(R.id.check_ruby);
        check_swi = (CheckBox) findViewById(R.id.check_swift);
        check_dar = (CheckBox) findViewById(R.id.check_dart);
        btn_press = (Button) findViewById(R.id.btn_press);




        btn_press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check_ja.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"java",Toast.LENGTH_LONG).show();
                }
                if (check_javasc.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"javascript",Toast.LENGTH_LONG).show();
                }
                 if (check_goo.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Go",Toast.LENGTH_LONG).show();
                }
                 if (check_kotl.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Kotlin",Toast.LENGTH_LONG).show();
                }
                if (check_pyth.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Python",Toast.LENGTH_LONG).show();
                }
                if (check_cc.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Lenguaje C/C++",Toast.LENGTH_LONG).show();
                }
                if (check_scal.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Scala",Toast.LENGTH_LONG).show();
                }
                if (check_rub.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Ruby",Toast.LENGTH_LONG).show();
                }
                if (check_swi.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Swift",Toast.LENGTH_LONG).show();
                }
                 if (check_dar.isChecked())
                {
                    Toast.makeText(getApplicationContext(),"Dart",Toast.LENGTH_LONG).show();
                }






            }
        });
    }


}