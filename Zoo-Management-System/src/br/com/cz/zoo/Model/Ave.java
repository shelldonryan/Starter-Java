package br.com.cz.zoo.Model;

import java.time.LocalTime;

public class Ave extends Animal{
    public Ave(int id, String nome, String especie, int idade, LocalTime horaDeDormir, String alimentoPrincipal) {
        super(id, nome, especie, idade, horaDeDormir, alimentoPrincipal);
    }

    @Override
    public void locomocao() {
        System.out.println("Animal está voando");
    }

    @Override
    public void alimentacao() {
        System.out.println("Ave está se alimentando com " + getAlimentoPrincipal());
    }

    @Override
    public void horaDeDormir() {
        System.out.println("PLin PLinn - Já são" + getHoraDeDormir().getHour() + ":" + getHoraDeDormir().getMinute());
    }
}
