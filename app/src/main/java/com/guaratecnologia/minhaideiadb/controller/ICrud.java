package com.guaratecnologia.minhaideiadb.controller;

import java.util.List;

public interface ICrud<T>{
    //incluir
  public  boolean incluir(T obj);
     //alterar
  public  boolean alterar(T obj);
    //deletar
  public  boolean deletar(int id);
    //listar
  public List<T> listar();


}
