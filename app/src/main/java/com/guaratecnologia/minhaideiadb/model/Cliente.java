package com.guaratecnologia.minhaideiadb.model;

import android.util.Log;

import com.guaratecnologia.minhaideiadb.api.AppUtil;
import com.guaratecnologia.minhaideiadb.controller.ICrud;



public class Cliente{
    private int id;//chave primaria do banco de dados
    private String nome;
    private String email;

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

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


}
