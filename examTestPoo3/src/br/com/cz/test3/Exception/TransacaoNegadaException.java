package br.com.cz.test3.Exception;

public class TransacaoNegadaException extends RuntimeException{
    public TransacaoNegadaException() {
        super("Transação negada");
    }
}
