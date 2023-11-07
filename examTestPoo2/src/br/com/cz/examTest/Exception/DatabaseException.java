package br.com.cz.examTest.Exception;

public class DatabaseException extends RuntimeException{
    public DatabaseException() {
        super("Falha na conexao com o database");
    }
}
