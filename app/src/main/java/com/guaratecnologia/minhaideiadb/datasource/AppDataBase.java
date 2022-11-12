package com.guaratecnologia.minhaideiadb.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.guaratecnologia.minhaideiadb.api.AppUtil;
import com.guaratecnologia.minhaideiadb.datamodel.ClienteDataModel;
import com.guaratecnologia.minhaideiadb.datamodel.ProdutoDataModel;

public class AppDataBase extends SQLiteOpenHelper {
    public static final String DB_NAME = "AppMinhaIdeia.sqlite";
    public static final int DB_VERSION = 1;
    SQLiteDatabase db;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ClienteDataModel.criarTabela());
        db.execSQL(ProdutoDataModel.criarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
    }

    /**
     * Metodo para inckuir no banco de dados
     *
     * @return
     **/
    public boolean insert(String tabela, ContentValues dados) {
        db = getWritableDatabase();
        boolean retorno = false;
        try {
            retorno = db.insert(tabela, null, dados) > 0;
        } catch (Exception e) {
            Log.d(AppUtil.TAG, "insert: " + e.getMessage());
        }
        return retorno;
    }

    public boolean deletById(String tabela, int id) {
        db = getWritableDatabase();
        boolean retorno = false;
        try {
            //retorno = db.insert(tabela, null, dados) > 0;
            retorno = db.delete(tabela, "id = ?", new String[]{String.valueOf(id)}) > 0;
        } catch (Exception e) {
            Log.d(AppUtil.TAG, "delete: " + e.getMessage());
        }
        return retorno;
    }
}
