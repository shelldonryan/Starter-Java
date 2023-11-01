package Interface;

import java.time.LocalDate;

public interface IAplicacao {
    IPaciente getPaciente();
    IVacina getVacina();
    LocalDate getDataDeAplicacao();
}
