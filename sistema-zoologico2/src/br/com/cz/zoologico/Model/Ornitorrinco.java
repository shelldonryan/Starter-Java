package br.com.cz.zoologico.Model;

import br.com.cz.zoologico.contract.IComportamentoAquatico;
import br.com.cz.zoologico.contract.IComportamentoTerrestre;

public class Ornitorrinco extends Mamifero implements IComportamentoAquatico, IComportamentoTerrestre{
    
    @Override
    public void nadar() {
        System.out.println("Ornitorrinco nadando");
    }

    @Override
    public void rastejar() {
        System.out.println("Ornitorrinco rastejando");
    }

    @Override
    public void pular() {
        System.out.println("Ornintorrinco pulou da ponte");
    }

    @Override
    public void correr() {
        System.out.println("Ornitorrinco esta na velocidade maxima de 3km/h");
    }
}
