package Main;

import java.time.LocalTime;

import Model.*;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro(
        "Fuba",
        "Canis lupus familiaris",
        "auauauauauau",
        4,
        LocalTime.of(20, 30)

    );

    cachorro1.atividadePreferida();
    cachorro1.emitirSom();
    cachorro1.dormir();
    cachorro1.exibirInfo();

    Gato gato1 = new Gato(
        "Fidélio",
        "Felis Catus",
        "Miau Miau Miau",
        4,
        LocalTime.of(22, 10)
    );
    
    gato1.atividadePreferida();
    gato1.emitirSom();
    gato1.dormir();
    gato1.exibirInfo();

    Macaco macaco1 = new Macaco(
        "Chico",
        "Primates",
        "UU aa UUU aaa",
        2,
        LocalTime.of(19, 40)
    );
    
    macaco1.atividadePreferida();
    macaco1.emitirSom();
    macaco1.dormir();
    macaco1.exibirInfo();

    Rato rato1 = new Rato(
        "Remy de Ratatouille",
        "Rattus",
        "fifififiiffi",
        4,
        LocalTime.of(1, 20)
    );
    
    rato1.atividadePreferida();
    rato1.emitirSom();
    rato1.dormir();
    rato1.exibirInfo();

    }
    
}
