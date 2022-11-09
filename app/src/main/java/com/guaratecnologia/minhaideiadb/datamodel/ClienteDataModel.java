package com.guaratecnologia.minhaideiadb.datamodel;

public class ClienteDataModel {

    //atributo nome da tabela
    public static final String TABELA = "cliente";

    //atributos  1 para 1 com os nomes dos campos
    public static final String ID = "id";//integer
    public static final String NOME = "nome";//text
    public static final String EMAIL ="email";//text

    //query para criar o banco de dados
    public static String queryCriarTabela = "";

    //metodo para gerar o script para criar tabela

    public static String criarTabela() {
        //concatenaçao de string

        queryCriarTabela+= "CREATE TABLE "+TABELA+" (";
        queryCriarTabela+= ID+" integer primary key autoincrement, ";
        queryCriarTabela+= NOME+" text, ";
        queryCriarTabela+= EMAIL+" text ";
        queryCriarTabela+= ")";

        return queryCriarTabela;
    }
}
