package br.com.cz.zoologico.Model;

public class Environment {
    public String name;
    public String kindOfBiome;
    public int maxAmountOfAnimals;
    public int currentAmountOfAnimals = 0;
    public Animal[] animals;

    public Environment(String name, String biome, int amountAnimals) {
        this.name = name;
        this.kindOfBiome = biome;
        this.maxAmountOfAnimals = amountAnimals;
        this.animals = new Animal[this.maxAmountOfAnimals];
    }

    public void addAnimal(Animal animal) {
        if (this.currentAmountOfAnimals < this.maxAmountOfAnimals) {
            this.animals[this.currentAmountOfAnimals] = animal;
            this.currentAmountOfAnimals++;
        } else {
            System.out.println("Environment full of animals");
        }
    }
}
