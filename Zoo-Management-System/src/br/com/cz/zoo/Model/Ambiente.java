package br.com.cz.zoo.Model;

import br.com.cz.zoo.Interface.IAnimal;

import java.util.ArrayList;
import java.util.UUID;

public class Ambiente {
    private int idAmbiente;
    private String tipoDeAmbiente;
    private int capacidade;

    public Ambiente() {

    }

    public Ambiente(String tipoAmbiente, int capacidade, int id) {
        this.idAmbiente = id;
        this.tipoDeAmbiente = tipoAmbiente;
        this.capacidade = capacidade;
    }

    public String getTipoDeAmbiente() {
        return tipoDeAmbiente;
    }

    public void setTipoDeAmbiente(String tipoDeAmbiente) {
        this.tipoDeAmbiente = tipoDeAmbiente;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getIdAmbiente() {
        return idAmbiente;
    }

    @Override
    public String toString() {
        return "Ambiente{" +
                "tipoDeAmbiente=" + tipoDeAmbiente +
                ", capacidade" + capacidade +
                '}';
    }
}
