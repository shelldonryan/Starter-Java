package Model;

import java.time.LocalDate;

import Interface.IAplicacao;
import Interface.IPaciente;
import Interface.IVacina;

public class Aplicacao implements IAplicacao{
    private IPaciente paciente;
    private IVacina vacina;
    private LocalDate dataDeAplicacao;

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
    public LocalDate getDataDeAplicacao() {
        return this.dataDeAplicacao;
    }

    public void setDataDeAplicacao(LocalDate dataDeAplicacao) {
        this.dataDeAplicacao = dataDeAplicacao;
    }

    @Override
    public String toString() {
        return "Aplicacao{" + 
                "paciente=" + paciente + 
                ", vacina=" + vacina +
                ", dataDeAplicacao=" + dataDeAplicacao + 
                '}';
    }
}
