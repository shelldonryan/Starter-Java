package br.com.cz.Main;

import br.com.cz.Model.*;

public class Main {
    public static void main(String[] args) {
         Carro carro1 = new Carro(
        "Golf gti", 
        2019,
        "Vermelho", 
        278);
        carro1.acelerar(12);
        System.out.println(carro1.getVelocidade());
        carro1.passarMarcha(6);
        carro1.abrirPorta(4);
        carro1.abrirPortaMala();

        Moto moto1 = new Moto(
            "xj6", 
            2019, 
            "Cinza Chumbo", 
            200);
        moto1.freiar();
        moto1.acionarCavalete();
        System.out.println(moto1.getEstacionado());
        moto1.acelerar(120);
        moto1.empinarMoto();
    }
}
