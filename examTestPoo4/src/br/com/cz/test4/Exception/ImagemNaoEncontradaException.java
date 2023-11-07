package br.com.cz.test4.Exception;

public class ImagemNaoEncontradaException extends RuntimeException{
    public ImagemNaoEncontradaException() {
        super("A imagem nao foi encontrada");
    }
}
