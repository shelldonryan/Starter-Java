package br.com.cz.examTest.Exception;

public class AcessoNegadoException extends RuntimeException {
    public AcessoNegadoException() {
        super("Acessado negado");
    }
}
