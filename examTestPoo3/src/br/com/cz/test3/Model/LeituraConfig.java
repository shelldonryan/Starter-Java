package br.com.cz.test3.Model;

import br.com.cz.test3.Exception.ConfiguracaoInvalidaException;

public class LeituraConfig {
    private boolean configuracaoLida;

    public boolean getConfiguracaoLida() {
        return this.configuracaoLida;
    }

    public void setConfiguracaoLida(boolean configuracaoLida) {
        this.configuracaoLida = configuracaoLida;
    }

    public void lerConfiguracao() {
        try {
            if(!configuracaoLida) {
                throw new ConfiguracaoInvalidaException();
            }
        } catch (ConfiguracaoInvalidaException e) {
            System.err.println(e.getMessage());
        }
    }
}
