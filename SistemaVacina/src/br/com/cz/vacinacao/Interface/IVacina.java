package br.com.cz.vacinacao.Interface;

import java.time.LocalDate;

public interface IVacina {
    // getTipo(), getDataValidade(), getLote(), estaVencida();
    String getTipo();
    LocalDate getDataValidade();
    String getLote();
    boolean estaVencida();
}
