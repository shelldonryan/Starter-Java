package Model;

import Interface.ICentroSaude;

public class CentroSaude implements ICentroSaude{
    private String nome;
    private int capacidadeArmazenamento;
    private boolean temEquipamentoAdequado;

    public CentroSaude(String nome, int capacidadeArmazenamento, boolean temEquipamento) {
        this.nome = nome;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.temEquipamentoAdequado = temEquipamento;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getCapacidadeArmazenamento() {
        return this.capacidadeArmazenamento;
    }

    @Override
    public boolean isTemEquipamentoAdequado() {
        return this.temEquipamentoAdequado;
    }
    
}
