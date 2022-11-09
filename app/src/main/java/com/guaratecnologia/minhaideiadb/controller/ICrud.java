package com.guaratecnologia.minhaideiadb.controller;

import com.guaratecnologia.minhaideiadb.model.Cliente;

import java.util.List;

public interface ICrud<T>{
    //incluir
  public  boolean incluir(T obj);
     //alterar
  public  boolean alterar(T obj);
    //deletar
  public  boolean deletar(T obj);
    //listar
  public List<T> listar();


}
