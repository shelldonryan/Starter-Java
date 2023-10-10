package Model.Evento;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Evento {
    public UUID idDoEvento;
    public String nomeDoEvento;
    public LocalDateTime dataHoraEvent;
    public String adress;

    public Evento(UUID idDoEvento, String nome, LocalDateTime dataHoraEvent, String adress) {
        this.idDoEvento = UUID.randomUUID();
        this.nomeDoEvento = nome;
        this.dataHoraEvent = dataHoraEvent;
        this.adress = adress;
    }

    public void exibirInfo() {
        System.out.printf("""
                Calendario Do Evento
                Nome do Evento: %s
                Data do Eevento: %d / %d / %d
                Hora do Evento: %d - %d
                Local do Evento: %s
                """, nomeDoEvento, dataHoraEvent.getDayOfMonth(), dataHoraEvent.getMonth(), dataHoraEvent.getYear(), dataHoraEvent.getHour(), dataHoraEvent.getMinute(), adress);
    }
}
