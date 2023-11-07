package br.com.cz.test5.Model;

import br.com.cz.test5.Interface.Movel;

public class Skate implements Movel{
    @Override
    public void mover() {
        System.out.println("Skate se movendo");
    }
}
