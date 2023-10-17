package br.com.cz.corretora.Model.Sistemas;

import br.com.cz.corretora.Contratos.IAcessoSistema;

public class SistemaAutentic {
    
    public void login(IAcessoSistema funcionario) {
        funcionario.login();
    }
    public void logout(IAcessoSistema funcionario) {
        funcionario.logout();
    }

}
