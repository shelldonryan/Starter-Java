package br.com.cz.examTest.Exception;

public class FileNotFoundException extends RuntimeException {
    public FileNotFoundException() {
        super("Arquivo não encontrado");
    }
}
