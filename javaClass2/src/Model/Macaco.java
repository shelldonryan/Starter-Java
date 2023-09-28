package Model;

import java.time.LocalTime;

public class Macaco extends Animal{
    public Macaco(String nome, String nomeCientifico, String somEmitido, int membros, LocalTime horaDeDormir){
        super(nome, nomeCientifico, somEmitido, membros, horaDeDormir);
    }

    @Override
    public void emitirSom() {
        System.out.println("\nGritando: " + nome + " emiti o som " + somEmitido);
    }

    public void atividadePreferida() {
        System.out.println("\n" + nome + " ama comer banana toda hora, lá ele");
    }
}
