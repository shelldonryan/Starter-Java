package Model;

import Interface.ICentroSaude;

public class CentroSaude implements ICentroSaude{
    private String nome;
    private int capacidadeArmazenamento;

    @Override
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getCapacidadeArmazenamento() {
        return this.capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    @Override
    public boolean isTemEquipamentoAdequado() {
        boolean status = false;

        if (this.capacidadeArmazenamento >= 10){
            status = true;
        } else {
            System.out.println("Não possui equipamento adequado");
        }

        return status;
    }

    @Override
    public String toString() {
        return "CentroSaude{" + 
                "nome=" + nome +
                ", capacidadeArmazenamento=" + capacidadeArmazenamento +
                '}';
    }
}
