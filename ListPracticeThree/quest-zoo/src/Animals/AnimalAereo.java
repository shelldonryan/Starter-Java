package Animals;

import java.time.LocalTime;

public abstract class AnimalAereo extends Animal{
    public AnimalAereo(String name, String specie, LocalTime horaDeDormir, String animalEats, double height) {
        super(name, specie, horaDeDormir, animalEats, height);
    }
}
