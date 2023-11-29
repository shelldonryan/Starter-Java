package br.com.cz.zoo.Model;

import java.util.ArrayList;
import java.util.UUID;

public class Zoo {
    private int idZoo;
    private String nome;
    private String localizacao;

    public Zoo() {

    }

    public Zoo(String nome, String localizacao, int id) {
        this.idZoo = id;
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getIdZoo() {
        return idZoo;
    }
    @Override
    public String toString() {
        return "Zoo{" +
                "nome=" + nome +
                ", localizacao{" + localizacao +
                '}';
    }
}
