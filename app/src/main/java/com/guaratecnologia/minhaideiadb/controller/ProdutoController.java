package com.guaratecnologia.minhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;
import com.guaratecnologia.minhaideiadb.api.AppUtil;
import com.guaratecnologia.minhaideiadb.datamodel.ProdutoDataModel;
import com.guaratecnologia.minhaideiadb.datasource.AppDataBase;
import com.guaratecnologia.minhaideiadb.model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController extends AppDataBase implements ICrud<Produto> {

    ContentValues dadoObjeto;

    public ProdutoController(Context context) {
        super(context);
        Log.d(AppUtil.TAG, "ProdutoController: conectado");
    }

    @Override
    public boolean incluir(Produto obj) {

        dadoObjeto = new ContentValues();
        dadoObjeto.put(ProdutoDataModel.NOME,obj.getNome());
        dadoObjeto.put(ProdutoDataModel.FORNECEDOR,obj.getFornecedor());
        return insert(ProdutoDataModel.TABELA,dadoObjeto);
    }

    @Override
    public boolean alterar(Produto obj) {
        dadoObjeto = new ContentValues();
        dadoObjeto.put(ProdutoDataModel.ID,obj.getId());// especifica
        dadoObjeto.put(ProdutoDataModel.NOME,obj.getNome());
        dadoObjeto.put(ProdutoDataModel.FORNECEDOR,obj.getFornecedor());
        return true;
    }

    @Override
    public boolean deletar(int id) {

        return true;
    }

    @Override
    public List<Produto> listar() {
        List<Produto> lista =  new ArrayList<>();
        return lista;
    }
}
