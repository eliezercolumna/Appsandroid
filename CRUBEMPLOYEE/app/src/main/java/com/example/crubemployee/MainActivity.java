package com.example.crubemployee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nombre, apellido, codigo_emple,direccion,departamento,sueldo,cedula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.txtnombre);
        apellido =findViewById(R.id.txtapellido);
        codigo_emple = findViewById(R.id.txtcodigo_empleado);
        direccion = findViewById(R.id.txtdireccion);
        departamento = findViewById(R.id.txtdepartamento);
        sueldo = findViewById(R.id.txtsueldo);
        cedula = findViewById(R.id.txtcedula);
    }

    public void insertar(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administration",null,1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String codigo = codigo_emple.getText().toString();
        String nom = nombre.getText().toString();
        String ape = apellido.getText().toString();
        String ced = cedula.getText().toString();
        String dire = direccion.getText().toString();
        String depa = departamento.getText().toString();
        String suel = sueldo.getText().toString();


        ContentValues dates = new ContentValues();
        dates.put("id",codigo);
        dates.put("nombre",nom);
        dates.put("apellido",ape);
        dates.put("cedula",ced);
        dates.put("direccion",dire);
        dates.put("departamento",depa);
        dates.put("sueldo",suel);

        bd.insert("datos",null,dates);
        bd.close();
        codigo_emple.setText("");
        nombre.setText("");
        apellido.setText("");
        cedula.setText("");
        direccion.setText("");
        departamento.setText("");
        sueldo.setText("");
        Toast.makeText(getApplicationContext(),"Se guardaron los datos",Toast.LENGTH_LONG).show();


    }
    public void editar (View view)
    {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administration",null,1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String codigo = codigo_emple.getText().toString();
        String nom = nombre.getText().toString();
        String ape = apellido.getText().toString();
        String ced = cedula.getText().toString();
        String dire = direccion.getText().toString();
        String depa = departamento.getText().toString();
        String suel = sueldo.getText().toString();

        ContentValues dates = new ContentValues();
        dates.put("id",codigo);
        dates.put("nombre",nom);
        dates.put("apellido",ape);
        dates.put("cedula",ced);
        dates.put("direccion",dire);
        dates.put("departamento",depa);
        dates.put("sueldo",suel);
        int cant= bd.update("datos",dates,"id="+ codigo,null);
        bd.close();
        if(cant == 1)
        {
            Toast.makeText(this,"Se editaron los datos",Toast.LENGTH_LONG).show();

        }
        else{
            Toast.makeText(this,"No existe el dato con el codigo ingresado",Toast.LENGTH_LONG).show();
        }
    }
    public void buscarporid(View view)
    {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administration",null,1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String codigo = codigo_emple.getText().toString();
        Cursor fila = bd.rawQuery("SELECT nombre, apellido, cedula,direccion,departamento,sueldo FROM datos WHERE id="+ codigo,null);
        if(fila.moveToFirst()){
            nombre.setText(fila.getString(0));
            apellido.setText(fila.getString(1));
            cedula.setText(fila.getString(2));
            direccion.setText(fila.getString(3));
            departamento.setText(fila.getString(4));
            sueldo.setText(fila.getString(5));

        }
        else {
            Toast.makeText(this,"No existe un dato con dicho codigo",Toast.LENGTH_LONG).show();
            bd.close();
        }
    }
    public  void eliminar(View view){
        AdminSQLiteOpenHelper admin= new AdminSQLiteOpenHelper(this,"administration",null,1);
        SQLiteDatabase bd= admin.getWritableDatabase();
        String codigo = codigo_emple.getText().toString();
        int cant = bd.delete("datos","id="+codigo,null);
        bd.close();
        codigo_emple.setText("");
        nombre.setText("");
        apellido.setText("");
        cedula.setText("");
        direccion.setText("");
        departamento.setText("");
        sueldo.setText("");
        if(cant==1)
        {
            Toast.makeText(this,"Se borraron los datos",Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(this,"No exite un dato con dicho codigo",Toast.LENGTH_SHORT).show();

        }


    }
    public void cancelar(View view)
    {
        codigo_emple.setText("");
        nombre.setText("");
        cedula.setText("");
        apellido.setText("");
        departamento.setText("");
        direccion.setText("");
        sueldo.setText("");

    }


}