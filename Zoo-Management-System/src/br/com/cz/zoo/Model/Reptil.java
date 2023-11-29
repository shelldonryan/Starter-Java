package br.com.cz.zoo.Model;

import java.time.LocalTime;

public class Reptil extends Animal{
    public Reptil(int id, String nome, String especie, int idade, LocalTime horaDeDormir, String alimentoPrincipal) {
        super(id, nome, especie, idade, horaDeDormir, alimentoPrincipal);
    }

    @Override
    public void locomocao() {
        System.out.println("Animal está rastejando");
    }

    @Override
    public void alimentacao() {
        System.out.println("Reptil está se alimentando com " + getAlimentoPrincipal());
    }

    @Override
    public void horaDeDormir() {
        System.out.println("PLin PLinn - Já são" + getHoraDeDormir().getHour() + ":" + getHoraDeDormir().getMinute());
    }
}
