package Environments;

import Animals.Animal;
import Animals.AnimalAereo;

public class AerialEnvironment extends Environment{

    public int maxHeight;
    public double atmosphericPressure;
    public int windSpeed;
    public double windMoisture;
    public boolean presenceOfPollutants;
    public Animal[] aerialAnimals;

    public AerialEnvironment(String environmentName,int maxHeight, double atmosphericPressure, int windSpeed, double windMoisture, boolean presenceOfPollutants, int qntAerialAnimals) {
        super(environmentName, "Aerial");
        this.maxHeight = maxHeight;
        this.atmosphericPressure = atmosphericPressure;
        this.windSpeed = windSpeed;
        this.windMoisture = windMoisture;
        this.presenceOfPollutants = presenceOfPollutants;
        this.aerialAnimals = new Animal[qntAerialAnimals];
    }

    public void addAerialAnimals(AnimalAereo animal) {
        for(int i = 0; i < aerialAnimals.length; i++) {
            if (aerialAnimals[i] == null) {
                aerialAnimals[i] = animal;
            }
        }
    }
}
