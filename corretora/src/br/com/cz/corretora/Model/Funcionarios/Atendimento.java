package br.com.cz.corretora.Model.Funcionarios;

import br.com.cz.corretora.Contratos.IAcessoContatos;

public class Atendimento extends Funcionario implements IAcessoContatos{

    public Atendimento(String usuario, String senha, String nome, String historicoAcademico) {
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
    public void listaDeClientes() {
        System.out.println("Contato dos Clientes da Empresa separados por Categoria");
    }
    @Override
    public void chatDaEmpresa() {
        System.out.println("Duvidas a serem esclarecidas a partir do website da empresa");
    }
    @Override
    public void emailDaEmpresa() {
        System.out.println("Caixa de Entrada co emails para serem tratados com a empresa");
    }
    
}
