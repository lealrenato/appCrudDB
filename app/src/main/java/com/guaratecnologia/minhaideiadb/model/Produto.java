package com.guaratecnologia.minhaideiadb.model;

import android.util.Log;

import com.guaratecnologia.minhaideiadb.api.AppUtil;
import com.guaratecnologia.minhaideiadb.controller.ICrud;

public class Produto{
    private int id;
    private String nome;
    private String fornecedor;

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getFornecedor() {return fornecedor;}

    public void setFornecedor(String fornecedor) {this.fornecedor = fornecedor;}


}
