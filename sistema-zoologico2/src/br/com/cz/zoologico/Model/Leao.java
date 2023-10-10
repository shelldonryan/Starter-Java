package br.com.cz.zoologico.Model;

import br.com.cz.zoologico.contract.IComportamentoTerrestre;

public class Leao extends Mamifero implements IComportamentoTerrestre{

    @Override
    public void correr() {
        System.out.println("Leao esta Correndo");
    }

    @Override
    public void pular() {
        System.out.println("Leao esta pulando");
    }

    @Override
    public void rastejar() {
        System.out.println("Leao esta rastejando");
    }
}
