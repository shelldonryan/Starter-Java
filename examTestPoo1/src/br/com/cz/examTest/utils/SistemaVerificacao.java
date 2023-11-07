package br.com.cz.examTest.utils;

import br.com.cz.examTest.Exception.AcessoNegadoException;
import br.com.cz.examTest.Model.Usuario;

public class SistemaVerificacao {
    public void verificarAcesso(Usuario usuario) {
        try {
            if (usuario.getNivelDeAcesso() < 5) {
                throw new AcessoNegadoException();
            }
        } catch (AcessoNegadoException e) {
            System.err.println(e.getMessage());
        }
    }
}
