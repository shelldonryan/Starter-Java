package br.com.cz.examTest.Exception;

public class IOException extends RuntimeException {
    public IOException() {
        super("Erro na entrada/saida de dados");
    }
}
