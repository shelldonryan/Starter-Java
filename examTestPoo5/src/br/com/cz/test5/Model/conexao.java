package br.com.cz.test5.Model;

import br.com.cz.test5.Exception.DispositivoNaoConectadoException;

public class conexao {
    public void conectarDispositivo() {
        boolean conexaoDispositivo = false;
        try {
            if(!conexaoDispositivo) {
                throw new DispositivoNaoConectadoException();
            }
        } catch (DispositivoNaoConectadoException e) {
            System.err.println(e.getMessage());
        }
    }
}
