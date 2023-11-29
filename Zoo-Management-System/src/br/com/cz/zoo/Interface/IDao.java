package br.com.cz.zoo.Interface;

import br.com.cz.zoo.Model.Zoo;

import java.util.ArrayList;
import java.util.UUID;

public interface IDao<T> {
    boolean adicionar(T obj);
    boolean remover(T obj);
    boolean atualizar(int id, T obj);
    ArrayList<T> listar();
    T buscar(int idObj);
}
