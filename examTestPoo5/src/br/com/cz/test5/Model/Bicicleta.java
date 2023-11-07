package br.com.cz.test5.Model;

import br.com.cz.test5.Interface.Movel;

public class Bicicleta implements Movel{
    @Override
    public void mover() {
        System.out.println("Bicicleta se movendo");
    }
}
