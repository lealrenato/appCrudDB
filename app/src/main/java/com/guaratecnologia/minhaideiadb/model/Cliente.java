package com.guaratecnologia.minhaideiadb.model;

import android.util.Log;

import com.guaratecnologia.minhaideiadb.api.AppUtil;
import com.guaratecnologia.minhaideiadb.controller.ICrud;

public class Cliente implements ICrud {
    private int id;//chave primaria do banco de dados
    private String nome;
    private String email;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    @Override
    public void incluir() {
        Log.i(AppUtil.TAG, "incluir: Cliente nome: "+getNome());
        Log.i(AppUtil.TAG, "incluir: Cliente email "+getEmail());
    }

    @Override
    public void alterar() {
        Log.i(AppUtil.TAG, "alterar: cliente");
    }

    @Override
    public void deletar() {
        Log.i(AppUtil.TAG, "deletar: cliente");
    }

    @Override
    public void listar() {
        Log.i(AppUtil.TAG, "listar: cliente");
    }
}
