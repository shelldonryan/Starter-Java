package br.com.cz.corretora.Model.Funcionarios;

import br.com.cz.corretora.Contratos.IAcessoRelatorio;

public class AnalistaInvestimento extends Funcionario implements IAcessoRelatorio{
    
    public AnalistaInvestimento(String usuario, String senha, String nome, String historicoAcademico) {
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
    public void recomendacaoInvestimento() {
        System.out.println("Recomendações de Investimentos do Analista");
    }
    @Override
    public void estrategiaInvestimento() {
        System.out.println("Estrategia de Investimento Utilizada pelo Analista");
    }
    @Override
    public void relatorioAnaliseMercado() {
        System.out.println("Gráficos e relatórios para observação do Mercado e suas movimentações");
    }
}
