package Model;

import java.time.LocalTime;

public class Rato extends Animal{
    public Rato(String nome, String nomeCientifico, String somEmitido, int membros, LocalTime horaDeDormir){
        super(nome, nomeCientifico, somEmitido, membros, horaDeDormir);
    }

    @Override
    public void emitirSom() {
        System.out.println("\nRoendo: " + nome + " emiti o som " + somEmitido);
    }

    public void atividadePreferida() {
        System.out.println("\n" + nome + " gosta de comer queijo, que tem como principal ativo o leite, lá ele");
    }
}
