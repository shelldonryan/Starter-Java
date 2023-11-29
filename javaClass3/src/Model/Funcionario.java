package Model;

import Interface.IFuncionario;

public class Funcionario<T extends Cargo> implements IFuncionario{
    public String nome;
    
    public Funcionario(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome=" + nome +
                '}';
    }
}
