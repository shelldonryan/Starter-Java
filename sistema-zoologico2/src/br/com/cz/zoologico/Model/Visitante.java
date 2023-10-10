package br.com.cz.zoologico.Model;

import java.time.LocalTime;

public class Visitante extends Pessoa {

    public LocalTime tempoPermanencia;

    public Visitante(String nome, int idade, String documento, LocalTime tempo){
        super(nome, idade, documento);
        this.tempoPermanencia = tempo;
    }

}
