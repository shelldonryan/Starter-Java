package Model.Organizador;

import java.util.UUID;
import Model.Evento.Evento;

public abstract class Organizador {
    public String nomeDoOrganizador;
    public UUID idDoOrganizador;
    public String email;
    public Evento[] eventos;

    public Organizador(String nomeDoOrganizador, UUID idDoOrganizdor, String email, int lmtEventos) {
        this.nomeDoOrganizador = nomeDoOrganizador;
        this.idDoOrganizador = UUID.randomUUID();
        this.email = email;
        this.eventos = new Evento[lmtEventos];
    }

    public void exibirInfo() {
        System.out.printf("""
                Detalhes do organizador
                Nome do Organizador: %s
                E-mail do Organizador: %s
                Id do Organizador: *******
                """, nomeDoOrganizador, email);
    }
}
