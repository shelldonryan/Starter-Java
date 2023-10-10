package br.com.cz.zoologico.Model;

public abstract class Pessoa {

    public String nome;
    public int idade;
    public String documento;

    public Pessoa(String nome, int idade, String documento){
        this.nome = nome;
        this.documento = documento;
        this.idade = idade;
    }


}
