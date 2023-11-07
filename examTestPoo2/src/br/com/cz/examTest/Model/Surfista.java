package br.com.cz.examTest.Model;

import br.com.cz.examTest.Interface.Navegavel;

public class Surfista implements Navegavel{
    @Override
    public void navegar() {
        System.out.println("Surfista: Voando no vento");
    }
}
