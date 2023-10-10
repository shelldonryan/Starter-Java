package br.com.cz.zoologico.Model;

public class Cuidador extends Pessoa {

    int quantidadeDeAnimais;

    public Cuidador(String nome, int idade, String documento, int quantidade){
        super(nome, idade, documento);
        this.quantidadeDeAnimais = quantidade;
    }

}
