package Model;

import java.time.LocalDate;

import Interface.IAplicacao;

public class Aplicacao implements IAplicacao{
    private Paciente paciente;
    private Vacina vacina;
    private LocalDate dataDeAplicacao;

    public Aplicacao(Paciente paciente, Vacina vacina, LocalDate dataDeAplicacao) {
        this.paciente = paciente;
        this.vacina = vacina;
        this.dataDeAplicacao = dataDeAplicacao;
    }

    @Override
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    @Override
    public Vacina getVacina() {
        return this.vacina;
    }
    
    @Override
    public LocalDate dataDeAplicacao() {
        return this.dataDeAplicacao;
    }
}
