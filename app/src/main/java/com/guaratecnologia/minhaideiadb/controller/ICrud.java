package com.guaratecnologia.minhaideiadb.controller;

import com.guaratecnologia.minhaideiadb.model.Cliente;

public interface ICrud<T>{
    //incluir
    void incluir(T obj);
     //alterar
    void alterar(T obj);
    //deletar
    void deletar(T obj);
    //listar
    void listar(T obj);


}
