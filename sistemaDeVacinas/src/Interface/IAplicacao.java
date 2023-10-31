package Interface;

import java.time.LocalDate;

import Model.Paciente;
import Model.Vacina;

public interface IAplicacao {
    public Paciente getPaciente();
    public Vacina getVacina();
    public LocalDate dataDeAplicacao();
}
