package Dao;

import java.util.ArrayList;

import Interface.IVeiculo;
import Interface.ILojaDeVeiculo;

public class DAOLojaDeVeiculo implements ILojaDeVeiculo{
    ArrayList<IVeiculo> listaDeVeiculos = new ArrayList<>();

    @Override
    public boolean inserirVeiculo(IVeiculo veiculo) {
        return listaDeVeiculos.add(veiculo);
    }

    @Override
    public boolean removerVeiculo(IVeiculo veiculo) {
        return listaDeVeiculos.remove(veiculo);
    }

    @Override
    public boolean removerVeiculo(String codigo) {
        for (int i = 0; i < listaDeVeiculos.size(); i++) {
            if(listaDeVeiculos.get(i).getChassi().equals(codigo)) {
                return listaDeVeiculos.remove(listaDeVeiculos.get(i));
            }
        }

        for (IVeiculo v : listaDeVeiculos) {
            if (v.getChassi().equals(codigo)){
                return listaDeVeiculos.remove(v);
            }
        }
        return false;
    }

    @Override
    public IVeiculo buscarVeiculoPorChassi(String codigo) {
        for (IVeiculo v : listaDeVeiculos) {
            if(v.getChassi().equals(codigo)) {
                return v;
            }
        }

        for (int i = 0; i < listaDeVeiculos.size(); i++) {
            IVeiculo veiculo = listaDeVeiculos.get(i);
            if(veiculo.getChassi().equals(codigo)) {
                return veiculo;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "DAOLojaDeVeiculos{" +
                "listaDeVeiculos=" + listaDeVeiculos +
                '}';
    }
}
