package br.com.cz.zoo.Model;

import br.com.cz.zoo.Interface.IAnimal;

import java.time.LocalTime;

public abstract class Animal implements IAnimal {
    private int id;
    private String nome;
    private String especie;
    private int idade;
    private LocalTime horaDeDormir;
    private String alimentoPrincipal;

    public Animal() {

    }

    public Animal(int id, String nome, String especie, int idade, LocalTime horaDeDormir, String alimentoPrincipal) {
        this.nome = nome;
        this.especie = especie;
        this.idade =idade;
        this.horaDeDormir = horaDeDormir;
        this.alimentoPrincipal = alimentoPrincipal;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalTime getHoraDeDormir() {
        return horaDeDormir;
    }

    public void setHoraDeDormir(LocalTime horaDeDormir) {
        this.horaDeDormir = horaDeDormir;
    }

    public String getAlimentoPrincipal() {
        return alimentoPrincipal;
    }

    public void setAlimentoPrincipal(String alimentoPrincipal) {
        this.alimentoPrincipal = alimentoPrincipal;
    }

    public int getId() {
        return id;
    }

    @Override
    public void locomocao() {
        System.out.println("Implemente na sublasse");
    }

    @Override
    public void alimentacao() {
        System.out.println("Implemente na sublasse");
    }

    @Override
    public void horaDeDormir() {
        System.out.println("Implemente na sublasse");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome=" + nome +
                ", especie=" + especie  +
                ", idade=" + idade +
                ", horaDeDormir=" + horaDeDormir +
                ", alimentoPrincipal=" + alimentoPrincipal  +
                '}';
    }
}
