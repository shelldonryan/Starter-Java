package Model;

import Interface.IPaciente;

public class Paciente implements IPaciente{
    private String nome;
    private int cpf;

    public Paciente(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getCpf() {
        return this.cpf;
    }
}
