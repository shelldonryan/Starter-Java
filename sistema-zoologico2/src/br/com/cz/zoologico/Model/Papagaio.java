package br.com.cz.zoologico.Model;

import br.com.cz.zoologico.contract.IComportamentoVoador;
import br.com.cz.zoologico.contract.IOutrosComportamentos;

public class Papagaio extends Ave implements IComportamentoVoador, IOutrosComportamentos {
    @Override
    public void voar() {

    }

    @Override
    public void falar() {

    }
}
