package br.com.cz.test4.Model;

import br.com.cz.test4.Exception.ImagemNaoEncontradaException;

public class Upload {
    public void carregarImagem() {
        try {
            if(true) {
                throw new ImagemNaoEncontradaException();
            }
        } catch (ImagemNaoEncontradaException e) {
            System.err.println(e.getMessage());
        }
    }
}
