package Model;

import Interface.ICargo;

public abstract class Cargo implements ICargo{
    public double salario;

    public Cargo(double salario) {
        this.salario = salario;
    }

    @Override
    public double getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return "Cargo{" + 
                "salario=" + salario +
                '}';
    }
}
