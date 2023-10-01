package Environments;

import Animals.Animal;
import Animals.AnimalTerrestre;

public class TerrestrialEnvironment extends Environment{
    
    public int temperature;
    public String typeOfSoil;
    public String vegetationCover;
    public double soilMoisture;
    public String typeOfRocks;
    public Animal[] terrestrialAnimals;

    public TerrestrialEnvironment(String environmentName, String geographyLocation, int temperature, String typeOfSoil, String vegetationCover, double soilMoisture, String typeOfRocks, int qntTerrestrialAnimals) {
        super(environmentName, geographyLocation);
        this.temperature = temperature;
        this.typeOfSoil = typeOfSoil;
        this.vegetationCover = vegetationCover;
        this.soilMoisture = soilMoisture;
        this.typeOfRocks = typeOfRocks;
        this.terrestrialAnimals = new Animal[qntTerrestrialAnimals];
    }

    public void addTerrestrialAnimals(AnimalTerrestre animal) {
        for(int i = 0; i < terrestrialAnimals.length; i++) {
            if (terrestrialAnimals[i] == null) {
                terrestrialAnimals[i] = animal;
            }
        }
    }
}
