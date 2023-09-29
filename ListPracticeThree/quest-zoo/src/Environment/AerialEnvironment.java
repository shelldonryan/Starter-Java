package Environment;

import Animals.AnimalAereo;

public class AerialEnvironment extends Environment{

    public int maxHeight;
    public double atmosphericPressure;
    public int windSpeed;
    public double windMoisture;
    public boolean presenceOfPollutants;
    public AnimalAereo[] aerialAnimals;

    public AerialEnvironment(String weather, String habitat, int qntAerialAnimals) {
        super(weather, habitat);
        this.aerialAnimals = new AnimalAereo[qntAerialAnimals];
    }

    public void addTerrestrialAnimals(AnimalAereo animal) {
        for(int i = 0; i < aerialAnimals.length; i++) {
            if (aerialAnimals[i] == null) {
                aerialAnimals[i] = animal;
            }
        }
    }
}
