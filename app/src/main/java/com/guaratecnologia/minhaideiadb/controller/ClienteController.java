package com.guaratecnologia.minhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;
import com.guaratecnologia.minhaideiadb.api.AppUtil;
import com.guaratecnologia.minhaideiadb.datamodel.ClienteDataModel;
import com.guaratecnologia.minhaideiadb.datasource.AppDataBase;
import com.guaratecnologia.minhaideiadb.model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteController extends AppDataBase implements ICrud<Cliente> {

    ContentValues dadoObjeto;

    public ClienteController(Context context) {
        super(context);
        Log.d(AppUtil.TAG, "ClienteController: Conectado ");
    }

    @Override
    public boolean incluir(Cliente obj) {

        dadoObjeto = new ContentValues();
        //key  , value

        //dadoObjeto.put(ClienteDataModel.ID,obj.getId()); // autoincrent
        dadoObjeto.put(ClienteDataModel.NOME,obj.getNome());
        dadoObjeto.put(ClienteDataModel.EMAIL,obj.getEmail());
        //enviar dados para a classe appdate
        return true;
    }

    @Override
    public boolean alterar(Cliente obj) {
        dadoObjeto = new ContentValues();
        dadoObjeto.put(ClienteDataModel.ID,obj.getId()); // especifica
        dadoObjeto.put(ClienteDataModel.NOME,obj.getNome());
        dadoObjeto.put(ClienteDataModel.EMAIL,obj.getEmail());
        return true;
        }

    @Override
    public boolean deletar(Cliente obj) {
        dadoObjeto = new ContentValues();
        dadoObjeto.put(ClienteDataModel.ID,obj.getId()); // especifica
        return true;
        }

    @Override
    public List<Cliente> listar() {
        List<Cliente> lista = new ArrayList<>();
        return lista;
    }
}
