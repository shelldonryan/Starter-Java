package Model;

import Interface.IVeiculo;

public abstract class Veiculo implements IVeiculo{
    public String chassi;

    public Veiculo(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "model=" + this.getClass().getName() +
                ", chassi='" + chassi + '\'' + 
                '}';
    }
}
