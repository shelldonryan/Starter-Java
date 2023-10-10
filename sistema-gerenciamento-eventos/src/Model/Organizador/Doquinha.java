package Model.Organizador;

import java.util.UUID;

public class Doquinha extends Organizador{

    public Doquinha(String nomeDoOrganizador, UUID idDoOrganizador, String email, int lmtEventos) {
        super(nomeDoOrganizador, idDoOrganizador, email, 2);
    }
}
