package Environment;

import Animals.AnimalTerrestre;

public class TerrestrialEnvironment extends Environment{
    
    public int temperature;
    public String typeOfSoil;
    public String vegetationCover;
    public double soilMoisture;
    public String typeOfRocks;
    public AnimalTerrestre[] terrestrialAnimals;

    public TerrestrialEnvironment(String weather, String habitat, int qntTerrestrialAnimals) {
        super(weather, habitat);
        this.terrestrialAnimals = new AnimalTerrestre[qntTerrestrialAnimals];
    }

    public void addTerrestrialAnimals(AnimalTerrestre animal) {
        for(int i = 0; i < terrestrialAnimals.length; i++) {
            if (terrestrialAnimals[i] == null) {
                terrestrialAnimals[i] = animal;
            }
        }
    }
}
