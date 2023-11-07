package br.com.cz.empresa.model.Utilizadores;

import br.com.cz.empresa.contratos.IAcessoAContasBancarias;
import br.com.cz.empresa.contratos.IAcessoAoSistema;

public class Secretario extends Utilizador implements IAcessoAContasBancarias {
    public Secretario(String login, String senha) {
        super(login, senha);
    }

    @Override
    public void acessarContaBancaria() {
        System.out.println("Secretario esta acessando uma conta bancaria");
    }
}
