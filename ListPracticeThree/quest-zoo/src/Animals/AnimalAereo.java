package Animals;

import java.time.LocalTime;

public abstract class AnimalAereo extends Animal{
    public AnimalAereo(String name, String specie, int age, LocalTime horaDeDormir, String animalEats, double height) {
        super(name, specie, age, horaDeDormir, animalEats, height);
    }

    @Override
    public void activity() {
        System.out.println("Esse animal tem como principal atividade voar.");
    }
}
