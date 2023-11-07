package br.com.cz.empresa.model.Utilizadores;

import br.com.cz.empresa.contratos.IAcessoAVendas;
import br.com.cz.empresa.contratos.IAcessoAoSistema;

public class Gerente extends Utilizador implements IAcessoAVendas {

    public Gerente(String login, String senha){
        super(login, senha);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    @Override
    public void vender() {
        System.out.println("Gerente vendeu");
    }

    @Override
    public void darDesconto() {

    }

    @Override
    public void reembolso() {

    }
}
