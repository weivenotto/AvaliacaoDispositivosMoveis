package com.example.avaliacaodispositivosmoveis;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CreateDatabase extends SQLiteOpenHelper {  //Criar a base é padrão, com essa estrutura

    public static final String DB_NAME = "paciente.db";
    public static final String ID = "_id";
    public static final String TABLE = "paciente";
    public static final String NOME = "nome";
    public static final String IDADE = "idade";
    public static final String LEUCOCITOS = "leucocitos";
    public static final String GLICEMIA = "glicemia";
    public static final String AST = "ast";
    public static final String LDH = "ldh";

    private static final int VERSION = 1;

    public CreateDatabase(Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + TABLE + " ( "
                + "_id integer primary key autoincrement, " +
                "nome text, " +
                "idade int, " +
                "leucocitos float," +
                "glicemia float," +
                "ast float," +
                "ldh float"+")";

        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(db);
    }
}