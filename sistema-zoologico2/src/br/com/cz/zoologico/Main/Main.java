package br.com.cz.zoologico.Main;

import br.com.cz.zoologico.Model.Ave;
import br.com.cz.zoologico.Model.Papagaio;
import br.com.cz.zoologico.Model.Pinguim;

import java.util.Scanner;

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

    }
}