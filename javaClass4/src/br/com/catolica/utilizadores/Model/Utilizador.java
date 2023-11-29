package br.com.catolica.utilizadores.Model;

public class Utilizador {
    private int id;
    private String nome;

    public Utilizador(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Utilizador{" +
                "id=" + id +
                ", nome=" + nome +
                "}";
    }
}
