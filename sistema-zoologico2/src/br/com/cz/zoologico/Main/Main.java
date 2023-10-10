package br.com.cz.zoologico.Main;

import br.com.cz.zoologico.Model.Leao;
import br.com.cz.zoologico.Model.Ornitorrinco;
import br.com.cz.zoologico.Model.Papagaio;
import br.com.cz.zoologico.Model.Pinguim;

public class Main {
    public static void main(String[] args) {

        Papagaio papaGaio = new Papagaio();
        
        papaGaio.falar();
        papaGaio.voar();
        papaGaio.porOvo();
        papaGaio.porOvo(5);

        Pinguim pinguim = new Pinguim();
        pinguim.nadar();
        pinguim.porOvo();
        pinguim.porOvo(5);

        Ornitorrinco ornitorrinco = new Ornitorrinco();
        ornitorrinco.correr();
        ornitorrinco.pular();
        ornitorrinco.rastejar();
        ornitorrinco.nadar();

        Leao leao = new Leao();
        leao.correr();
        leao.rastejar();
        leao.pular();
    }
}