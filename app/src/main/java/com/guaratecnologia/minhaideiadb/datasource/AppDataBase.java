package com.guaratecnologia.minhaideiadb.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.guaratecnologia.minhaideiadb.api.AppUtil;
import com.guaratecnologia.minhaideiadb.datamodel.ClienteDataModel;


public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME = "AppMinhaIdeia.sqlite";
    public static final int DB_VERSION = 1;
    SQLiteDatabase db;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        Log.d(AppUtil.TAG, "AppDataBase: criando banco de dados");
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ClienteDataModel.criarTabela());
        Log.d(AppUtil.TAG, "onCreate: Tabela Cliente " + ClienteDataModel.criarTabela());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
