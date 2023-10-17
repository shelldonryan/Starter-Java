package br.com.cz.corretora.Model.Sistemas;

import br.com.cz.corretora.Contratos.IAcessoPortifolio;

public class SistemaDesempenho {
    public void retornoDaCarteira(IAcessoPortifolio funcionario) {
        funcionario.retorno();
    }
    
    public void riscoDaCarteira(IAcessoPortifolio funcionario) {
        funcionario.risco();
    }
}
