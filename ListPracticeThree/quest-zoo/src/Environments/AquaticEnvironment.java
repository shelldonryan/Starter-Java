package Environments;

import Animals.Animal;
import Animals.AnimalAquatico;

public class AquaticEnvironment extends Environment {

    public int waterTemperature;
    public double phLevel;
    public boolean salinity;
    public double maxDepth;
    public String colorWater;
    public Animal[] aquaticAnimals;

    public AquaticEnvironment(String environmentName, String geographyLocation, int qntAquaticAnimals, int temp, double ph, boolean salinity, int depth, String color) {
        super(environmentName, geographyLocation);
        this.aquaticAnimals = new Animal[qntAquaticAnimals];
        this.waterTemperature = temp;
        this.phLevel = ph;
        this.salinity = salinity;
        this.maxDepth = depth;
        this.colorWater = color;
    }

    public void addAquaticAnimal(AnimalAquatico animal) {
        for(int i = 0; i < aquaticAnimals.length; i++) {
            if(aquaticAnimals[i] ==  null){
                aquaticAnimals[i] = animal;
            }
        }
    }
}
