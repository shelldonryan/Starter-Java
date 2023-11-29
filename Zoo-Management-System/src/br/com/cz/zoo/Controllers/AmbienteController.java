package br.com.cz.zoo.Controllers;

import br.com.cz.zoo.Dao.AmbienteDAO;
import br.com.cz.zoo.Exception.AmbienteException;
import br.com.cz.zoo.Interface.IController;
import br.com.cz.zoo.Interface.IDao;
import br.com.cz.zoo.Model.Ambiente;

import java.util.ArrayList;

public class AmbienteController implements IController<Ambiente> {
    private IDao<Ambiente> dao;

    public AmbienteController() {
        this.dao = new AmbienteDAO();
    }


    @Override
    public boolean cadastrar(Ambiente model) {
        try {
            if (model != null) {
                this.dao.adicionar(model);
                return true;
            } else {
                throw new AmbienteException("ERR: Objeto Ambiente Vazio");
            }

        } catch (AmbienteException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Ambiente buscarPorId(int idDoObjeto) {
        try {
            if (idDoObjeto != 0) {
                return this.dao.buscar(idDoObjeto);
            } else {
                throw new AmbienteException("ERR: Id do objeto com numero indefinido");
            }

        } catch (AmbienteException e){
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean atualizacao(int id, Ambiente model) {
        try {
            if (model != null) {
                this.dao.atualizar(id, model);
                return true;
            } else {
                throw new AmbienteException("ERR: Objeto Ambiente Vazio");
            }

        } catch (AmbienteException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean excluir(Ambiente model) {
        try {
            if (model != null) {
                this.dao.remover(model);
                return true;
            } else {
                throw new AmbienteException("ERR: Objeto Ambiente Vazio");
            }

        } catch (AmbienteException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean excluir(int id) {
        return false;
    }

    @Override
    public ArrayList<Ambiente> listarTodos() {
        return this.dao.listar();
    }
}
