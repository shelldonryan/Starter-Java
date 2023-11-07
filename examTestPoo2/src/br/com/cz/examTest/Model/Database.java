package br.com.cz.examTest.Model;

import br.com.cz.examTest.Exception.DatabaseException;

public class Database {
    private boolean conexao;

    public boolean getConexao() {
        return this.conexao;
    }

    public void setConexao(boolean conexao) {
        this.conexao = conexao;
    }

    public void conectarBancoDeDados() {
        try {
            if(!conexao) {
                throw new DatabaseException();
            }
        } catch (DatabaseException e) {
            System.err.println(e.getMessage());
        }
    }
}
