package br.com.cz.vacinacao.Interface;

import java.time.LocalDate;

public interface IAplicacao {
    //getPaciente(), getVacina(), getDataAplicacao()

    IPaciente getPaciente();
    IVacina getVacina();
    LocalDate getDataAplicacao();
}
