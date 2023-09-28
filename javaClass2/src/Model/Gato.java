package Model;

import java.time.LocalTime;

public class Gato extends Animal {
    public Gato(String nome, String nomeCientifico, String somEmitido, int membros, LocalTime horaDeDormir){
        super(nome, nomeCientifico, somEmitido, membros, horaDeDormir);
    }

    @Override
    public void emitirSom() {
        System.out.println("\nMiando: " + nome + " emiti o som " + somEmitido);
    }

    public void atividadePreferida() {
        System.out.println("\n" + nome + " gosta de brincar com uma bola, lá ele");
    }
}
