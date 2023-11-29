package br.com.cz.zoo.Dao;

import br.com.cz.zoo.Interface.IDao;
import br.com.cz.zoo.Model.Ambiente;

import java.util.ArrayList;
import java.util.UUID;

public class AmbienteDAO implements IDao<Ambiente> {
    ArrayList<Ambiente> dao = new ArrayList<>();

    @Override
    public boolean adicionar(Ambiente obj) {
        return dao.add(obj);
    }

    @Override
    public boolean remover(Ambiente obj) {
        return dao.remove(obj);
    }


    @Override
    public ArrayList<Ambiente> listar() {
        return dao;
    }

    @Override
    public boolean atualizar(int id, Ambiente obj) {
        for(int i = 0; i < dao.size(); i++) {
            if (dao.get(i).getIdAmbiente() == id) {
                dao.set(i, obj);
                return true;
            }
        }
        return false;
    }

    @Override
    public Ambiente buscar(int idObj) {
        for(int i = 0; i < dao.size(); i++) {
            if (dao.get(i).getIdAmbiente() == idObj){
                return dao.get(i);
            }
        }
        return null;
    }
}