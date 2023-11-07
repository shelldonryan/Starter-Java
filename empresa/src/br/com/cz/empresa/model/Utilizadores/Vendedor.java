package br.com.cz.empresa.model.Utilizadores;

import br.com.cz.empresa.contratos.IAcessoAVendas;
import br.com.cz.empresa.contratos.IAcessoAoSistema;

public class Vendedor extends Utilizador implements IAcessoAVendas {

    String codigoVendedor;
    public Vendedor(String login, String senha) {
        super(login, senha);
    }

    @Override
    public String toString() {
        return "Vendedor: " + this.codigoVendedor + " / " + super.toString();
    }

    @Override
    public void login() {
        System.out.println("Vendedor Entrou");
    }

    @Override
    public void logout() {
        System.out.println("Vendedor Saiu");
    }

    @Override
    public void vender() {
        System.out.println("Vendedor vendeu");
    }

    @Override
    public void darDesconto() {

    }

    @Override
    public void reembolso() {

    }
}
