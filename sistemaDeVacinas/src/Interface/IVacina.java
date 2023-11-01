package Interface;

import java.time.LocalDate;

public interface IVacina {
    String getTipo();
    LocalDate getValidade();
    String getLote();
    boolean isEstaVencida();
}
