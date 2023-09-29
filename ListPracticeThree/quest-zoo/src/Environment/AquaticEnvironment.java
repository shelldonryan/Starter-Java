package Environment;

import Animals.AnimalAquatico;

public class AquaticEnvironment extends Environment {

    public int waterTemperature;
    public double phLevel;
    public boolean salinity;
    public double maxDepth;
    public String colorWater;
    public AnimalAquatico[] aquaticAnimals;

    public AquaticEnvironment(String weather, String habitat, int qntAquaticAnimals) {
        super(weather, habitat);
        this.aquaticAnimals = new AnimalAquatico[qntAquaticAnimals];
    }

    public void addAquaticAnimal(AnimalAquatico animal) {
        for(int i = 0; i < aquaticAnimals.length; i++) {
            if(aquaticAnimals[i] ==  null){
                aquaticAnimals[i] = animal;
            }
        }
    }
}
