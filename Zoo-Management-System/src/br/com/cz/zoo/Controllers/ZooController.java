package br.com.cz.zoo.Controllers;

import br.com.cz.zoo.Dao.ZooDAO;
import br.com.cz.zoo.Exception.ZooException;
import br.com.cz.zoo.Interface.IController;
import br.com.cz.zoo.Interface.IDao;
import br.com.cz.zoo.Model.Zoo;

import java.util.ArrayList;

public class ZooController implements IController<Zoo> {
    private IDao<Zoo> dao;

    public ZooController() {
        this.dao = new ZooDAO();
    }

    @Override
    public boolean cadastrar(Zoo model) {
        try {
            if(model != null) {
                this.dao.adicionar(model);
                return true;
            } else {
                throw new ZooException("ERR: Objeto zoologico vazio!");
            }
        } catch (ZooException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Zoo buscarPorId(int idDoObjeto) {
        try {
            if (idDoObjeto != 0) {
                return this.dao.buscar(idDoObjeto);
            } else {
                throw new ZooException("ERR: Id do objeto com numero indefinido");
            }
        } catch (ZooException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean atualizacao(int id, Zoo model) {
        try {
            if (model != null) {
                this.dao.atualizar(id, model);
                return true;
            } else {
                throw new ZooException("ERR: Objeto zoologico esta vazio");
            }
        } catch (ZooException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean excluir(Zoo model) {
        try {
            if (model != null) {
                this.dao.remover(model);
                return true;
            } else {
                throw new ZooException("ERR: Objeto zoologico esta vazio");
            }

        } catch (ZooException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean excluir(int id) {
        try {
            if (id != 0) {
                Zoo zooBuscado = dao.buscar(id);
                if (zooBuscado != null) {
                    return dao.remover(zooBuscado);
                } else {
                    throw new ZooException("ERR: Zoo não foi encontrado");
                }
            } else {
                throw new ZooException("ERR: Id não identificado");
            }
        } catch (ZooException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public ArrayList<Zoo> listarTodos() {
        return this.dao.listar();
    }
}
