package br.com.cz.corretora.Model.Sistemas;

import br.com.cz.corretora.Contratos.IAcessoRelatorio;

public class SistemaAnalise {
    
    public void recomendacoes(IAcessoRelatorio funcionario) {
        funcionario.recomendacaoInvestimento();
    }
    
    public void estrategia(IAcessoRelatorio funcionario) {
        funcionario.estrategiaInvestimento();
    }
    
    public void analise(IAcessoRelatorio funcionario) {
        funcionario.relatorioAnaliseMercado();
    }
}
