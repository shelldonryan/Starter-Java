package br.com.cz.zoologico.Model;

import br.com.cz.zoologico.contract.IComportamentoAquatico;

public class Pinguim extends Ave implements IComportamentoAquatico {

    @Override
    public void nadar() {
        System.out.println("Pinguim nadando");
    }


}
