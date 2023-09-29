package Animals;

import java.time.LocalTime;

public abstract class AnimalAquatico extends Animal{
    public AnimalAquatico(String name, String specie, LocalTime horaDeDormir, String animalEats, double height) {
        super(name, specie, horaDeDormir, animalEats, height);
    }
}
