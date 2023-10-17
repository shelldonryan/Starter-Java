package br.com.cz.corretora.Model.Sistemas;

import br.com.cz.corretora.Contratos.IAcessoHomeBroker;

public class SistemaNegociacao {
    
    public void operacaoTradingCompra(IAcessoHomeBroker funcionario) {
        funcionario.comprar();
    }
    
    public void operacaoTradingVender(IAcessoHomeBroker funcionario) {
        funcionario.vender();
    }
}
