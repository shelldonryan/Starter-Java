package br.com.cz.test3.Exception;

public class ConfiguracaoInvalidaException extends RuntimeException{
    public ConfiguracaoInvalidaException() {
        super("Conteudo do arquivo nao esta no formato esperado");
    }
}
