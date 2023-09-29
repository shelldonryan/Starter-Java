package Animals;

import java.time.LocalTime;

public abstract class AnimalTerrestre extends Animal{
    public AnimalTerrestre(String name, String specie, LocalTime horaDeDormir, String animalEats, double height) {
        super(name, specie, horaDeDormir, animalEats, height);
    }

    
}
