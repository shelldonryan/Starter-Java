package br.com.cz.corretora.Model.Funcionarios;

import br.com.cz.corretora.Contratos.IAcessoSistema;

public class Funcionario implements IAcessoSistema{
    public String usuario;
    public String senha;
    public String nome;
    public String historicoAcademico;

    public Funcionario(String usuario, String senha, String nome, String historicoAcademico) {
        this.usuario = usuario;
        this.senha = senha;
        this.nome = nome;
        this.historicoAcademico = historicoAcademico;
    }

    @Override
    public void login() {
        System.out.println("Funcionario Entrou no Sistema");
    }
    
    @Override
    public void logout() {
        System.out.println("Funcionario Saiu do Sistema");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "Login= '" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                '}'; 
    }
}
