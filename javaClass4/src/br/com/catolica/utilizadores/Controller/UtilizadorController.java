package br.com.catolica.utilizadores.Controller;

import java.util.ArrayList;

import br.com.catolica.utilizadores.Dao.UtilizadorDao;
import br.com.catolica.utilizadores.Interface.IDao;
import br.com.catolica.utilizadores.Interface.IUtilizadorController;
import br.com.catolica.utilizadores.Model.Utilizador;

public class UtilizadorController implements IUtilizadorController{
    private IDao<Utilizador> dao;

    public UtilizadorController() {
        this.dao = new UtilizadorDao();
    }

    @Override
    public boolean adicionarUtilizador(Utilizador obj) {
        // regras de negocio antes de adicionar
        // pode/deve haver tratamento de erros
        return this.dao.adicionar(obj);
    }

    @Override
    public Utilizador buscarPorId(int id) {
        // regras de negocio antes de adicionar
        // pode/deve haver tratamento de erros
        return this.dao.buscarPorId(id);
    }

    @Override
    public ArrayList<Utilizador> listaTodosUtilizadores() {
        // pode/deve haver tratamento de erros
        return this.dao.listarTodos();
    }

    @Override
    public boolean removerUtilizador(Utilizador utilizador) {
        // regras de negocio antes de adicionar
        // pode/deve haver tratamento de erros
        return this.dao.remover(utilizador);
    }
}
