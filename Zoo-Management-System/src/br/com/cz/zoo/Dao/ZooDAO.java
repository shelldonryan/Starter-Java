package br.com.cz.zoo.Dao;

import br.com.cz.zoo.Interface.IDao;
import br.com.cz.zoo.Model.Zoo;

import java.util.ArrayList;

public class ZooDAO implements IDao<Zoo> {
    private final ArrayList<Zoo> dao = new ArrayList<>();

    @Override
    public boolean adicionar(Zoo obj) {
        try {
            return dao.add(obj);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean remover(Zoo obj) {
        try {
            return dao.remove(obj);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean atualizar(int id, Zoo obj) {
        try {
            for (int i = 0; i < dao.size(); i++) {
                if (dao.get(i).getIdZoo() == id) {
                    dao.set(i, obj);
                    return true;
                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public ArrayList<Zoo> listar() {
        try {
            return new ArrayList<>(dao);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Zoo buscar(int idDoObj) {
        try {
            for(Zoo zoo : dao) {
                if (zoo.getIdZoo() == idDoObj) {
                    return zoo;
                }
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

}
