package br.com.cz.Model;

import br.com.cz.Contracts.IVeiculoComportamento;

public class Carro implements IVeiculoComportamento{
    protected String modelo;
    protected int marchaAtual;
    protected int ano;
    protected String cor;
    protected int velocidade;

    public Carro() {

    }

    public Carro(String modelo, int ano, String cor, int velocidade) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidade = velocidade;
    }

    @Override
    public void acelerar(int valor) {
        this.velocidade += valor;
    }

    @Override
    public void freiar() {
        this.velocidade -= 2;
    }

    @Override
    public void passarMarcha(int valor) {
        this.marchaAtual = valor;
    }
}
