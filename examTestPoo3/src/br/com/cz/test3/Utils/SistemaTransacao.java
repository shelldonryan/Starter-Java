package br.com.cz.test3.Utils;

import br.com.cz.test3.Exception.TransacaoNegadaException;
import br.com.cz.test3.Model.Usuario;

public class SistemaTransacao {
    public void executarTransacao (Usuario usuario) {
        try {
            if (!usuario.getPermissaoTransacao()) {
                throw new TransacaoNegadaException();
            }
        } catch (TransacaoNegadaException e) {
            System.err.println(e.getMessage());
        }
    }
}
