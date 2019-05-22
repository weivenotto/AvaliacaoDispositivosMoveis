package com.example.avaliacaodispositivosmoveis;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

class DAL {
    private static final String TAG = "DAL";

    private SQLiteDatabase db;
    private CreateDatabase database;

    DAL(Context context) {
        database = new CreateDatabase(context);
    }

    boolean insert( Pacientes p) {
        ContentValues values;
        long result;

        // Obtemos um acesso ao banco com permissão de escrita
        db = database.getWritableDatabase();

        // Par de nomes de colunas + valores, para atualização no banco
        values = new ContentValues();
        values.put(CreateDatabase.NOME, p.getNome());
        values.put(CreateDatabase.IDADE, p.getIdade());
        values.put(CreateDatabase.LEUCOCITOS , p.getNumeroDeLeucositos());
        values.put(CreateDatabase.GLICEMIA, p.getNumeroDeGlucositos());
        values.put(CreateDatabase.AST, p.getNumeroDeLHD());
        values.put(CreateDatabase.LDH, p.getNumeroDeLHD());

        // efetivamente insere o registro no banco, fechando o acesso em seguida
        result = db.insert(CreateDatabase.TABLE, null, values);
        db.close();

        // Reporta um erro caso tenha acontecido
        if (result == -1) {
            Log.e(TAG, "insert: Erro inserindo registro");
            return false;
        }

        return true;
    }

    boolean delete(int id) {
        long result;

        // A cláusula where para o update. Note a interrogação. É um "wildcard".
        // Seu valor será inserido pelo contido na variável args
        String where = "_id = ?";
        String[] args = { String.valueOf(id) };

        // Obtemos um acesso ao banco com permissão de escrita
        db = database.getWritableDatabase();

        // efetivamente faz o delete no banco, fechando o acesso em seguida
        result = db.delete(CreateDatabase.TABLE, where, args);
        db.close();

        // Reporta um erro caso tenha acontecido
        if (result == -1) {
            Log.e(TAG, "insert: Erro removendo registro");
            return false;
        }

        return true;
    }

    Cursor findById(int id){
        Cursor cursor;

        // A cláusula where para o update. Note a interrogação. É um "wildcard".
        // Seu valor será inserido pelo contido na variável args
        String where = "_id = ?";
        String[] args = { String.valueOf(id) };

        // Obtemos um acesso ao banco com permissão de escrita
        db = database.getWritableDatabase();

        // Cria uma consulta ao banco. Observe o formato. Ao não passar colunas,
        // temos o equivalente a SELECT *. Esta consulta, em SQL corrente, seria:
        // SELECT * from book WHERE _id = :id (:id é o id passado por parâmetro)
        cursor = db.query(CreateDatabase.TABLE, null,
                where, args, null, null, null, null);
        if (cursor != null){
            cursor.moveToFirst();
        }

        db.close();
        return cursor;
    }

    Cursor loadAll() {
        Cursor cursor;
        String[] fields = {CreateDatabase.ID, CreateDatabase.NOME};
        db = database.getReadableDatabase();

        cursor = db.query(CreateDatabase.TABLE, null,
                null, null, null,
                null, null);

        if (cursor != null) {
            cursor.moveToFirst();
        }

        db.close();
        return cursor;
    }
}
