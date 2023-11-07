package br.com.cz.test5.Exception;

public class DispositivoNaoConectadoException extends RuntimeException{
    public DispositivoNaoConectadoException() {
        super("ERROR: Dispositivo não conectado");
    }
}
