package Model;

import java.time.LocalDate;

import Interface.IVacina;

public class Vacina implements IVacina{
    private String tipo;
    private LocalDate validade;
    private String lote;
    private boolean estaVencida;

    public Vacina(String tipo, LocalDate validade, String lote, boolean estaVencida) {
        this.tipo = tipo;
        this.validade = validade;
        this.lote = lote;
        this.estaVencida = estaVencida; 
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public LocalDate getValidade() {
        return this.validade;
    }

    @Override
    public String getLote() {
        return this.lote;
    }

    @Override
    public boolean isEstaVencida() {
        return this.estaVencida;
    }
}
