package br.com.cz.corretora.Model.Funcionarios;

import br.com.cz.corretora.Contratos.IAcessoPortifolio;

public class GestorDeCarteira extends Funcionario implements IAcessoPortifolio{

    public GestorDeCarteira(String usuario, String senha,  String nome, String historicoAcademico) {
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
    public void retorno() {
        System.out.println("Retorno apresentado da carteira do cliente");
    }

    @Override
    public void risco() {
        System.out.println("Risco apresentado da carteira do cliente");
    }
    
}
