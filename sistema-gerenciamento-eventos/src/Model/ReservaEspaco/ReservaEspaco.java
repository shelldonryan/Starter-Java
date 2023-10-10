package Model.ReservaEspaco;

import Model.Organizador.Organizador;

import java.time.LocalDate;

import Model.Evento.Evento;

public abstract class ReservaEspaco {
    public Organizador organizadorDoEvento;
    public Evento eventoOrganizado;
    public LocalDate dataDaReserva;
    public String localReservado;

    public ReservaEspaco(Organizador organizadorDoEvento, Evento eventoOrganizado, LocalDate dataDaReserva, String localReservado) {
        this.organizadorDoEvento = organizadorDoEvento;
        this.eventoOrganizado = eventoOrganizado;
        this.dataDaReserva = dataDaReserva;
        this.localReservado = localReservado;
    }

    public void exibirInfo() {
        System.out.printf("""
                Detalhes da Reserva
                Organizador do evento: %s
                Data da Reserva: %d / %d / %d
                Espaco Reservado: %s
                """, 
                organizadorDoEvento.nomeDoOrganizador, 
                dataDaReserva.getDayOfMonth(), 
                dataDaReserva.getMonth(), 
                dataDaReserva.getYear(), 
                localReservado);
    }
}
