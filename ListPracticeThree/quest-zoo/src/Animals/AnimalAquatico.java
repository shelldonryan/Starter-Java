package Animals;

import java.time.LocalTime;

public abstract class AnimalAquatico extends Animal{
    public AnimalAquatico(String name, String specie, int age, LocalTime horaDeDormir, String animalEats, double height) {
        super(name, specie, age, horaDeDormir, animalEats, height);
    }
}
