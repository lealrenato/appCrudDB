package com.guaratecnologia.minhaideiadb.controller;

import android.content.Context;
import android.util.Log;
import com.guaratecnologia.minhaideiadb.api.AppUtil;
import com.guaratecnologia.minhaideiadb.datasource.AppDataBase;

public class ProdutoController extends AppDataBase {
    public ProdutoController(Context context) {
        super(context);
        Log.d(AppUtil.TAG, "ProdutoController: conectado");
    }
}
