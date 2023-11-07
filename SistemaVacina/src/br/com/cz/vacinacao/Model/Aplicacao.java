package br.com.cz.vacinacao.Model;

import br.com.cz.vacinacao.Interface.IAplicacao;
import br.com.cz.vacinacao.Interface.IPaciente;
import br.com.cz.vacinacao.Interface.IVacina;

import java.time.LocalDate;

public class Aplicacao implements IAplicacao {

    public IPaciente paciente;
    public IVacina vacina;
    public LocalDate dataAplicacao;

    @Override
    public IPaciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(IPaciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public IVacina getVacina() {
        return this.vacina;
    }

    public void setVacina(IVacina vacina) {
        this.vacina = vacina;
    }

    @Override
    public LocalDate getDataAplicacao() {
        return this.dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    @Override
    public String toString() {
        return "Aplicacao{" +
                "paciente=" + paciente +
                ", vacina=" + vacina +
                ", dataAplicacao=" + dataAplicacao +
                '}';
    }
}
