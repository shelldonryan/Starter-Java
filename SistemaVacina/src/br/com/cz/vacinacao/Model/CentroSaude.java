package br.com.cz.vacinacao.Model;

import br.com.cz.vacinacao.Interface.ICentroSaude;

public class CentroSaude implements ICentroSaude {

    public String nome;
    public int capacidadeDeAramzenamento;

    @Override
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getCapacidadeDeArmazenamento() {
        return this.capacidadeDeAramzenamento;
    }

    public void setCapacidadeDeAramzenamento(int capacidadeDeAramzenamento) {
        this.capacidadeDeAramzenamento = capacidadeDeAramzenamento;
    }

    @Override
    public boolean temEquipamentoAdequado() {

        boolean status = false;

        if (this.capacidadeDeAramzenamento >= 10){
            status = true;
        } else {
            System.err.println("Ihhhh..");
        }

        return status;
    }

    @Override
    public String toString() {
        return "CentroSaude{" +
                "nome='" + nome + '\'' +
                ", capacidadeDeAramzenamento=" + capacidadeDeAramzenamento +
                '}';
    }
}
