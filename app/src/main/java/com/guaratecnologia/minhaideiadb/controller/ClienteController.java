package com.guaratecnologia.minhaideiadb.controller;

import android.content.Context;
import android.util.Log;

import com.guaratecnologia.minhaideiadb.api.AppUtil;
import com.guaratecnologia.minhaideiadb.datasource.AppDataBase;
import com.guaratecnologia.minhaideiadb.model.Cliente;

public class ClienteController extends AppDataBase {


    public ClienteController(Context context) {
        super(context);
        Log.d(AppUtil.TAG, "ClienteController: Conectado ");
    }
}
