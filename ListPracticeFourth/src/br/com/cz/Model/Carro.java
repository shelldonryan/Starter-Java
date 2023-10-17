package br.com.cz.Model;

import br.com.cz.Contracts.ICarroComportamento;
import br.com.cz.Contracts.IVeiculoComportamento;

public class Carro implements IVeiculoComportamento, ICarroComportamento{
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

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String novoModelo) {
        this.modelo = novoModelo;
    }
    
    public String getCor() {
        return this.cor;
    }
    public void setCor(String novaCor) {
        this.cor = novaCor;
    }
    
    public int getAno() {
        return this.ano;
    }
    public void setCor(int novoAno) {
        this.ano = novoAno;
    }
    
    public int getVelocidade() {
        return this.velocidade;
    }
    public void setVelocidade(int novaVelocidade) {
        this.velocidade = novaVelocidade;
    }
    
    public int getMarchaAtual() {
        return this.marchaAtual;
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

    @Override
    public void abrirPorta(int posicaoPorta) {
        if (posicaoPorta == 1) {
            System.out.println("Abrindo porta Motorista");
        } else if (posicaoPorta == 2) {
            System.out.println("Abrindo porta do 1 passageiro");
        } else if (posicaoPorta == 3) {
            System.out.println("Abrindo porta do 2 passageiro");
        } else if (posicaoPorta == 4) {
            System.out.println("Abrindo porta do 3 passageiro");
        } 
    }

    @Override
    public void abrirPortaMala() {
        System.out.println("Abrindo Porta Mala do carro");
    }
}
