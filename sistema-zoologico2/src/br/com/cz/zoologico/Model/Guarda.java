package br.com.cz.zoologico.Model;

public class Guarda extends Pessoa {

    public int nivelDeAcesso;

    public Guarda(String nome, int idade, String documento, int nivel){
        super(nome, idade, documento);
        this.nivelDeAcesso = nivel;
    }
}
