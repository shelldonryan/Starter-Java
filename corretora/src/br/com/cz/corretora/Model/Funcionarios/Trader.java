package br.com.cz.corretora.Model.Funcionarios;

import br.com.cz.corretora.Contratos.IAcessoHomeBroker;

public class Trader extends Funcionario implements IAcessoHomeBroker{
    
    public Trader(String usuario, String senha, String nome, String historicoAcademico) {
        super(usuario, senha, nome, historicoAcademico);
    }

    @Override
    public String toString() {
        return "Analista de Investimentos{" +
                "Login= '" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", historicoAcademico=" + historicoAcademico + '\'' +
                '}'; 
    }

    @Override
    public void comprar() {
        System.out.println("O trader Realizou uma operação de compra");
    }

    @Override
    public void vender() {
        System.out.println("O trader Realizou uma operação de compra");
    }
}
