package br.com.cz.zoologico.Main;

import br.com.cz.zoologico.Model.*;

public class Main {
    public static void main(String[] args) {
        Monkey monkey1 = new Monkey();
        monkey1.name = "Pipo";

        Monkey monkey2 = new Monkey();
        monkey2.name = "Zufa";

        Environment environment1 = new Environment(
            "Habitat Monkey", 
            "savannah", 
            4);
        
        environment1.addAnimal(monkey1);
        environment1.addAnimal(monkey2);

        // for(int i =0; i < environment1.maxAmountOfAnimals; i++) {
        //     System.out.println(environment1.animals[i]);
        // }
        
        Environment environment2 = new Environment(
            "Full Dog House",
            "Cerrado", 
            10);

        Dog dog1 = new Dog();
        dog1.name = "Chico";
        Dog dog2 = new Dog();
        dog2.name = "Maria";

        environment2.addAnimal(dog1);
        environment2.addAnimal(dog2);

        Zoo zoo1 = new Zoo("Peter Pan Zoo");
        zoo1.addEnvironment(environment1);
        zoo1.addEnvironment(environment2);

        for (int i = 0; i < zoo1.currentAmountEnvironment; i++) {
            System.out.println("Environment Name: " + zoo1.environments[i].name);
            System.out.println("Biome: " + zoo1.environments[i].kindOfBiome);
            System.out.println("");

            for (int f = 0; f < zoo1.environments[i].currentAmountOfAnimals; f++) {
                System.out.println("Animal: " + zoo1.environments[i].animals[f].name);
            }
            System.out.println("--------------------------------");
        }
    }
}
