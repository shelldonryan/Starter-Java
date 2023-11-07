package br.com.cz.empresa.model.Sistema;

import br.com.cz.empresa.contratos.IAcessoAoSistema;
import br.com.cz.empresa.model.Utilizadores.Utilizador;

public class SistemaAutenticacao {

    public void login(Utilizador utilizador) {
        utilizador.login();
    }

    public void logout(Utilizador utilizador) {
        utilizador.logout();
    }
}
