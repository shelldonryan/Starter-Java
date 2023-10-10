package Model.Evento;

import java.time.LocalDateTime;
import java.util.UUID;

public class CultoDaIgreja extends Evento{
    
    public CultoDaIgreja(UUID idDoEvento, String nomeDoEvento, LocalDateTime dataHoraEvent, String adress) {
        super(idDoEvento, nomeDoEvento, dataHoraEvent, adress);
    }
}
