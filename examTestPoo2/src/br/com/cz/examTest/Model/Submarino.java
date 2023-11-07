package br.com.cz.examTest.Model;

import br.com.cz.examTest.Interface.Navegavel;

public class Submarino implements Navegavel{
    @Override
    public void navegar() {
        System.out.println("Submarino está navegando");
    }
}
