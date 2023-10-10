package Model.ReservaEspaco;

import java.time.LocalDate;

import Model.Evento.Evento;
import Model.Organizador.Organizador;

public class Salao extends ReservaEspaco{
    public Salao(Organizador organizadorDoEvento, Evento eventoOrganizado, LocalDate dataDaReserva, String localReservado) {
        super(organizadorDoEvento, eventoOrganizado, dataDaReserva, localReservado);
    }
}
