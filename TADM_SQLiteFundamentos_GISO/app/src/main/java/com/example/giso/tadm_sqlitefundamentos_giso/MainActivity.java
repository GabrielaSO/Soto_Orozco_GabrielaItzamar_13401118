package com.example.giso.tadm_sqlitefundamentos_giso;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nombre,edad;
    Button insertar;
    long id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=findViewById(R.id.nombre);
        edad=findViewById(R.id.edad);
        insertar=findViewById(R.id.inserta);

        //Declaracion de controlador de la bd y acceso
        DatabaseHelper dbHelper = new DatabaseHelper(getApplicationContext());
        //SQLiteDatabase db = dbHelper.getWritableDatabase();
        Toast.makeText(getBaseContext(), "Base de datos lista", Toast.LENGTH_SHORT).show();
        //dbHelper.open();
        /*id = dbHelper.insertContact("Guadalupe","22");
        id = dbHelper.insertContact("Sebastian","20");
        id = dbHelper.insertContact("Belen","25");
        id = dbHelper.insertContact("Maria","26");
        id = dbHelper.insertContact("Jesus","26");
        */
        //dbHelper.close();
    }
}
