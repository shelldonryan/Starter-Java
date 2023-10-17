package br.com.cz.corretora.Main;

import br.com.cz.corretora.Model.Funcionarios.*;
import br.com.cz.corretora.Model.Sistemas.*;

public class Main {
    
    public static void main(String[] args) {
        SistemaAutentic sistemaDeAutenticacao= new SistemaAutentic(); 

        AnalistaInvestimento analistaDeInvestimento = new AnalistaInvestimento(
        "ze0122", 
        "1234", 
        "Zeca Andrade", 
        "Graduação em Finanças");
        sistemaDeAutenticacao.login(analistaDeInvestimento);
    
        GestorDeCarteira gestorDeCarteira = new GestorDeCarteira(
            "john34",
            "3456",
            "João Mariano",
            "Graduação em Economia"
        );
        sistemaDeAutenticacao.login(gestorDeCarteira);

        Atendimento atendente = new Atendimento(
            "maria14",
            "3521",
            "Maria Flor",
            "Graduação em Administração"
        );
        sistemaDeAutenticacao.login(atendente);

        Trader trader = new Trader(
            "kauanxls",
            "2010",
            "Kauan dos Santos",
            "Graduação em Engenharia Financeira"
        );
        sistemaDeAutenticacao.login(trader);

        AnalistaTecnologia analistaTecnologia = new AnalistaTecnologia(
            "shelldonryan",
            "200615",
            "Shelldon Ryan",
            "Graduação em Ciência da Computação"
        );
        sistemaDeAutenticacao.login(analistaTecnologia);

        SistemaAnalise sistemaAnalise = new SistemaAnalise();
        sistemaAnalise.analise(analistaDeInvestimento);
        sistemaAnalise.estrategia(analistaDeInvestimento);
        sistemaAnalise.recomendacoes(analistaDeInvestimento);

        SistemaDesempenho sistemaDesempenho = new SistemaDesempenho();
        sistemaDesempenho.retornoDaCarteira(gestorDeCarteira);
        sistemaDesempenho.riscoDaCarteira(gestorDeCarteira);

        SistemaAtendimentoCliente sistemaAtendimentoCliente = new SistemaAtendimentoCliente();
        sistemaAtendimentoCliente.chatParaDuvidas(atendente);
        sistemaAtendimentoCliente.contatoClientes(atendente);
        sistemaAtendimentoCliente.emailDaEmpresa(atendente);

        SistemaNegociacao sistemaNegociacao = new SistemaNegociacao();
        sistemaNegociacao.operacaoTradingCompra(trader);
        sistemaNegociacao.operacaoTradingVender(trader);
    }
    
}
