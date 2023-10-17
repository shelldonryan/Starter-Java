package br.com.cz.Model;

import br.com.cz.Contracts.IMotoComportamento;
import br.com.cz.Contracts.IVeiculoComportamento;

public class Moto implements IVeiculoComportamento, IMotoComportamento{
    protected String modelo;
    protected int marchaAtual;
    protected int ano;
    protected String cor;
    protected int velocidade;
    protected boolean estacionar;

    public Moto() {

    }

    public Moto(String modelo, int ano, String cor, int velocidade) {
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
    
    public boolean getEstacionado() {
        return this.estacionar;
    }

    @Override
    public void acelerar(int valor) {
        this.velocidade += valor * 1.2;
    }

    @Override
    public void freiar() {
        this.velocidade = 0;
    }

    @Override
    public void passarMarcha(int valor) {
        this.marchaAtual = valor;
    }

    @Override
    public void acionarCavalete() {
        this.estacionar = true;
    }

    @Override
    public void empinarMoto() {
        System.out.println("Realizando manobra arriscada");
    }
}
