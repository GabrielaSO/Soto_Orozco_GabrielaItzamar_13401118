package com.example.giso.tadm_sqlitefundamentos_giso;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by giso on 26/02/18.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "database.db";
    private static final String DATABASE_TABLE="PERSONA";
    String id="idPer";
    String nombre="nombre";
    String edad="edad";

    private Context mContext;
    DatabaseHelper DBHelper;
    SQLiteDatabase db;


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.mContext=context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(this.getClass().toString(), "Creando base de datos");

        //creacion de la tabla PERSONA
        db.execSQL("CREATE TABLE PERSONA(nombre VARCHAR(55), edad integer);");
        Log.i(this.getClass().toString(),"Tabla PERSONA ha sido creada");

        //Carga de datos
        db.execSQL("INSERT INTO PERSONA VALUES ('Gabriela','23');");
        db.execSQL("INSERT INTO PERSONA VALUES ('Elizabeth','24');");
        db.execSQL("INSERT INTO PERSONA VALUES ('Karina','25');");
        db.execSQL("INSERT INTO PERSONA VALUES ('jose','25');");

        Log.i(this.getClass().toString(),"Los datos han sido insertados");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }

    //---Abrir la base de datos---
    public DatabaseHelper open() throws SQLException {
        db = DBHelper.getWritableDatabase();
        return this;
    }

    public void close() {
        DBHelper.close();
    }

   /* public long insertContact(String nombre, String edad){
        ContentValues initialValues = new ContentValues();
        //initialValues.put(id, idPersona);
        initialValues.put(nombre, nombre);
        initialValues.put(edad, edad);
        return db.insert(DATABASE_TABLE, null, initialValues);
    }*/

}