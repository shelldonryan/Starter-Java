package br.com.catolica.utilizadores.Dao;

import java.util.ArrayList;

import br.com.catolica.utilizadores.Interface.IDao;
import br.com.catolica.utilizadores.Model.Utilizador;

public class UtilizadorDao implements IDao<Utilizador>{
    
    private ArrayList<Utilizador> dao = new ArrayList<>();

    @Override
    public boolean adicionar(Utilizador objeto) {
        return dao.add(objeto);
    }

    @Override
    public ArrayList<Utilizador> listarTodos() {
        return new ArrayList<>(dao);
    }

    @Override
    public boolean remover(Utilizador objeto) {
        return dao.remove(objeto);
    }

    @Override
    public Utilizador buscarPorId(int id) {
        for(Utilizador utl : dao) {
            if (utl.getId() == id) {
                return utl;
            }
        }
        return null;
    }
}
