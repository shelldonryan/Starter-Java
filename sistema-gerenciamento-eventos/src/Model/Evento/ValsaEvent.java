package Model.Evento;

import java.util.UUID;
import java.time.LocalDateTime;

public class ValsaEvent extends Evento{
    public ValsaEvent(UUID idDoEvento, String nomeDoEvento, LocalDateTime dataHoraEvent, String adress) {
        super(idDoEvento, nomeDoEvento, dataHoraEvent, adress);
    }
}
