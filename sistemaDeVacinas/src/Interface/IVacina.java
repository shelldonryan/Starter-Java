package Interface;

import java.time.LocalDate;

public interface IVacina {
    public String getTipo();
    public LocalDate getValidade();
    public String getLote();
    public boolean isEstaVencida();
}
