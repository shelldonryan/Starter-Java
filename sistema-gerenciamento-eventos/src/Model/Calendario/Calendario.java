package Model.Calendario;

import java.time.LocalDateTime;

import Model.ReservaEspaco.ReservaEspaco;

public class Calendario {
    public ReservaEspaco[] eventosAgendados;

    public Calendario(int lmtEventosAgendados) {
        this.eventosAgendados = new ReservaEspaco[lmtEventosAgendados];
    }

    public void verificarDisponibilidade(LocalDateTime dataDesejada) {
        for(int i = 0; i < eventosAgendados.length; i++) {
            if(eventosAgendados[i].eventoOrganizado.dataHoraEvent == dataDesejada) {
                System.out.println("Lamento, mas essa data ja esta reservada");
                System.out.println("O Evento abaixo já esta enacixado...");
                eventosAgendados[i].eventoOrganizado.exibirInfo();
                return;
            }
        }
        System.out.println("este horario está disponível");
    }
    
    public void inserirEventos(ReservaEspaco evento) {
        for(int i = 0; i < eventosAgendados.length; i++) {
            if(eventosAgendados[i] == null) {
                eventosAgendados[i] = evento;
            }
        }
    }
    
    public void cancelarEventos(ReservaEspaco evento) {
        for(int i = 0; i < eventosAgendados.length; i++) {
            if(eventosAgendados[i] == evento) {
                eventosAgendados[i] = null;
            }
        }
    }
    
    public void exibirInfo() {
        System.out.println("Calendario com Eventos Agendados\n");
        for(int i = 0; i < eventosAgendados.length; i++) {
            System.out.printf("""
                    Evento %d - %s
                    Data do evento: %d / %d / %d
                    Hora do evento: %d - %d
                    """, 
                    i + 1,
                    eventosAgendados[i].eventoOrganizado.nomeDoEvento,
                    eventosAgendados[i].eventoOrganizado.dataHoraEvent.getDayOfMonth(), 
                    eventosAgendados[i].eventoOrganizado.dataHoraEvent.getMonth(), 
                    eventosAgendados[i].eventoOrganizado.dataHoraEvent.getYear(),
                    eventosAgendados[i].eventoOrganizado.dataHoraEvent.getHour(), 
                    eventosAgendados[i].eventoOrganizado.dataHoraEvent.getMinute());
        }
    }
}
