package br.com.cz.vacinacao.Model;

import br.com.cz.vacinacao.Exception.VacinaVencidaException;
import br.com.cz.vacinacao.Interface.IVacina;

import java.time.LocalDate;

public class Vacina implements IVacina {

    public String tipo;
    public String lote;
    public LocalDate dataValidade;

    @Override
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public LocalDate getDataValidade() {
        return this.dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String getLote() {
        return this.lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    @Override
    public boolean estaVencida() {
        boolean status = false ;
        try {
            status = dataValidade.isAfter(LocalDate.now());

            if (!status){
                throw new VacinaVencidaException();
            }
        } catch (VacinaVencidaException e){
            System.err.println(e);
        }

        return status;
    }

    @Override
    public String toString() {
        return "Vacina{" +
                "tipo='" + tipo + '\'' +
                ", lote='" + lote + '\'' +
                ", dataValidade=" + dataValidade +
                '}';
    }
}
