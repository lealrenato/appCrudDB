package com.guaratecnologia.minhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import com.guaratecnologia.minhaideiadb.api.AppUtil;
import com.guaratecnologia.minhaideiadb.datamodel.ClienteDataModel;
import com.guaratecnologia.minhaideiadb.datasource.AppDataBase;
import com.guaratecnologia.minhaideiadb.model.Cliente;

public class ClienteController extends AppDataBase implements ICrud<Cliente> {

    ContentValues dadoObjeto;

    public ClienteController(Context context) {
        super(context);
        Log.d(AppUtil.TAG, "ClienteController: Conectado ");
    }

    @Override
    public void incluir(Cliente obj) {

        dadoObjeto = new ContentValues();
        //key  , value

        //dadoObjeto.put(ClienteDataModel.ID,obj.getId());
        dadoObjeto.put(ClienteDataModel.NOME,obj.getNome());
        dadoObjeto.put(ClienteDataModel.EMAIL,obj.getEmail());

    }

    @Override
    public void alterar(Cliente obj) {

    }

    @Override
    public void deletar(Cliente obj) {

    }

    @Override
    public void listar(Cliente obj) {

    }
}
