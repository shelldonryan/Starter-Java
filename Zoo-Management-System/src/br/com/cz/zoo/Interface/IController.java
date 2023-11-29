package br.com.cz.zoo.Interface;

import br.com.cz.zoo.Model.Ambiente;
import br.com.cz.zoo.Model.Zoo;

import java.util.ArrayList;
import java.util.UUID;

public interface IController<T> {
    boolean cadastrar(T model);
    T buscarPorId(int idDoObjeto);

    boolean atualizacao(int id, T model);

    boolean excluir(T model);
    boolean excluir(int id);
    ArrayList<T> listarTodos();

}
