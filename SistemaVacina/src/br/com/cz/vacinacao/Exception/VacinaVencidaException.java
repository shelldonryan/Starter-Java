package br.com.cz.vacinacao.Exception;

public class VacinaVencidaException extends RuntimeException{

    public VacinaVencidaException(){
        super("Vacina vencida, vai virar o bolsonaro");
    }
}
