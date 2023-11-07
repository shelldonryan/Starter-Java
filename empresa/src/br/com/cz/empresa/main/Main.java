package br.com.cz.empresa.main;

import br.com.cz.empresa.model.Sistema.SistemaAutenticacao;
import br.com.cz.empresa.model.Sistema.SistemaRH;
import br.com.cz.empresa.model.Sistema.SistemaVendas;
import br.com.cz.empresa.model.Utilizadores.Gerente;
import br.com.cz.empresa.model.Utilizadores.Secretario;
import br.com.cz.empresa.model.Utilizadores.Utilizador;
import br.com.cz.empresa.model.Utilizadores.Vendedor;

public class Main {
    public static void main(String[] args) {
        // interface (contratos/implementações)
        // encapsulamento (sobrecarga/sobrescrita, métodos de acesso aos objetos)
        // Exemplo:
        // sistema de empresa com acesso
        // de niveis de permissoes para
        // cada usuario do sistema

        Secretario secretario = new Secretario("ejr", "123");
        Vendedor vendedor = new Vendedor("jk", "456");
        Gerente gerente = new Gerente("jk", "456");

        SistemaAutenticacao sistemaAutenticacao = new SistemaAutenticacao();


        sistemaAutenticacao.login(secretario);
        sistemaAutenticacao.login(vendedor);

        SistemaRH sistemaRH = new SistemaRH();

        sistemaRH.acessarConta(secretario);

        SistemaVendas sistemaVendas = new SistemaVendas();
        sistemaVendas.vender(vendedor);
        sistemaVendas.vender(gerente);

    }
}