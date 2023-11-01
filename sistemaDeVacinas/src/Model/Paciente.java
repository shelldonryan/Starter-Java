package Model;

import Interface.IPaciente;

public class Paciente implements IPaciente{
    private String nome;
    private String cpf;

    @Override
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Paciente{" + 
                "nome=" + nome +
                ", cpf=" + cpf + 
                '}';
    }
}
