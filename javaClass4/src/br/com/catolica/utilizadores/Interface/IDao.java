package br.com.catolica.utilizadores.Interface;

import java.util.ArrayList;

public interface IDao<T> {
    boolean adicionar(T objeto);

    T buscarPorId(int id);

    ArrayList<T> listarTodos();

    boolean remover(T objeto);
}
