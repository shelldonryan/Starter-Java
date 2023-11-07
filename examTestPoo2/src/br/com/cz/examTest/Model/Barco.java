package br.com.cz.examTest.Model;

import br.com.cz.examTest.Interface.Navegavel;

public class Barco implements Navegavel{
    @Override
    public void navegar() {
        System.out.println("Barco está navegando");
    }
}
