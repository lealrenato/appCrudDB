package com.guaratecnologia.minhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;
import com.guaratecnologia.minhaideiadb.api.AppUtil;
import com.guaratecnologia.minhaideiadb.datamodel.ClienteDataModel;
import com.guaratecnologia.minhaideiadb.datamodel.ProdutoDataModel;
import com.guaratecnologia.minhaideiadb.datasource.AppDataBase;
import com.guaratecnologia.minhaideiadb.model.Produto;

public class ProdutoController extends AppDataBase implements ICrud<Produto> {

    ContentValues dadoObjeto;

    public ProdutoController(Context context) {
        super(context);
        Log.d(AppUtil.TAG, "ProdutoController: conectado");
    }

    @Override
    public void incluir(Produto obj) {

        dadoObjeto = new ContentValues();
        //key  , value

        //dadoObjeto.put(ClienteDataModel.ID,obj.getId());
        dadoObjeto.put(ClienteDataModel.NOME,obj.getNome());
        dadoObjeto.put(ProdutoDataModel.FORNECEDOR,obj.getFornecedor());

    }

    @Override
    public void alterar(Produto obj) {

    }

    @Override
    public void deletar(Produto obj) {

    }

    @Override
    public void listar(Produto obj) {

    }
}
