package Model;

import java.time.LocalDate;
import Exceptions.VacinaVencidaException;
import Interface.IVacina;

public class Vacina implements IVacina{
    private String tipo;
    private LocalDate validade;
    private String lote;

    @Override
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public LocalDate getValidade() {
        return this.validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    @Override
    public String getLote() {
        return this.lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    @Override
    public boolean isEstaVencida() {
        boolean status = false;

        try {
            status = validade.isAfter(LocalDate.now());

            if (!status) {
                throw new VacinaVencidaException("Esta vacina esta vencida");
            }
        } catch (VacinaVencidaException e) {
            System.err.println(e);
        }

        return status;
    }

    @Override
    public String toString() {
        return "Vacina{" + 
                "tipo=" + tipo +
                ", validade" + validade +
                ", lote=" + lote + 
                '}';
    }
}
