package com.guaratecnologia.minhaideiadb.model;

import android.util.Log;

import com.guaratecnologia.minhaideiadb.api.AppUtil;
import com.guaratecnologia.minhaideiadb.controller.ICrud;

public class Produto implements ICrud {
 

    private String nome;
    private String fornecedor;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public void incluir() {
        Log.i(AppUtil.TAG, "incluir: Produto nome: "+ getNome());
        Log.i(AppUtil.TAG, "incluir: Produto fornecedor: "+ getFornecedor());
    }

    @Override
    public void alterar() {
        Log.i(AppUtil.TAG, "alterar: Produto");
    }

    @Override
    public void deletar() {
        Log.i(AppUtil.TAG, "deletar: Produto");
    }

    @Override
    public void listar() {
        Log.i(AppUtil.TAG, "listar: Produto");
    }
}
