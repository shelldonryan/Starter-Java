package Model;

import java.time.LocalTime;

public class Cachorro extends Animal{
    public Cachorro(String nome, String nomeCientifico, String somEmitido, int membros, LocalTime horaDeDormir){
        super(nome, nomeCientifico, somEmitido, membros, horaDeDormir);
    }

    @Override
    public void emitirSom() {
        System.out.println("\nLatindo: " + nome + " emiti o som " + somEmitido);
    }

    public void atividadePreferida() {
        System.out.println("\n" + nome + " gosta de correr atrás de pau, lá ele");
    }
}
