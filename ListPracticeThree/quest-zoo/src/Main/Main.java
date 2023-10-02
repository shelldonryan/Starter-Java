package Main;

import java.time.LocalTime;

import Animals.*;
import Environments.*;
import Zoo.*;
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(
            "Zoo da fantasia", 
            "Um zoológico encantado, onde os visitantes podem explorar habitats exóticos e conhecer uma grande variedade de animais fascinantes de todo o mundo.", 
            "Sr. A. Magine",
            "Rua das Maravilhas", 
            6, 
            1000, 
            3);

        zoo.capacity(345);
        System.out.println("");
        zoo.report("This zoo is amazing!!");
        System.out.println("");
        zoo.outInfo();
        System.out.println("");

        AerialEnvironment ambiente1 = new AerialEnvironment(
            "Céu Sereno", 
            10000, 
            70, 
            10, 
            60, 
            false, 
            2);

        AquaticEnvironment ambiente2 = new AquaticEnvironment(
            "Mar Azul", 
            2, 
            25, 
            8.2, 
            true, 
            30, "Turquesa");

        TerrestrialEnvironment ambiente3 = new TerrestrialEnvironment(
            "Floresta Encantada", 
            22, 
            "Solo Argiloso", 
            "Árvores altas, samambaias e musgos", 
            70, 
            "Granito", 
            2);

        zoo.addEnviroments(ambiente1);
        zoo.addEnviroments(ambiente2);
        zoo.addEnviroments(ambiente3);
        System.out.println("");

        zoo.whatEnvironment();
        System.out.println("");

        Hawk hawk1 = new Hawk(
            "Apollo", 
            "Falco peregrinus", 
            5, 
            LocalTime.of(20, 00), 
            "Carnívoro", 
            40);
        hawk1.activity();
        hawk1.sleep();
        System.out.println("");

        Owl owl1 = new Owl(
            "Luna", 
            "Bubo virginianus", 
            3, 
            LocalTime.of(6, 0), 
            "Carnívoro", 
            50);
        owl1.activity();
        owl1.sleep();
        System.out.println("");

        Dog dog1 = new Dog(
            "Max", 
            "Canis lupus familiaris", 
            7, 
            LocalTime.of(21, 0), 
            "Onívoro", 
            60);
        dog1.activity();
        dog1.sleep();
        System.out.println("");

        Wolf wolf1 = new Wolf(
            "Pamplona", 
            "Canis lupus", 
            6, 
            LocalTime.of(23, 0), 
            "Carnívoro", 
            80);
        wolf1.activity();
        wolf1.sleep();
        System.out.println("");

        Delfim delfim1 = new Delfim(
            "Flipper", 
            "Tursiops truncatus", 
            8, 
            LocalTime.of(22, 10), 
            "Carnívoro", 
            250);
        delfim1.activity();
        delfim1.sleep();
        System.out.println("");
         
        Shark shark1 = new Shark(
            "Sharky", 
            "Carcharhinus leucas", 
            12, 
            LocalTime.of(23, 0), 
            "Carnívoro", 
            290);
        shark1.activity();
        shark1.sleep();
        System.out.println("");

        ambiente1.addAerialAnimals(hawk1);
        ambiente1.addAerialAnimals(owl1);

        ambiente2.addAquaticAnimal(shark1);
        ambiente2.addAquaticAnimal(delfim1);

        ambiente3.addTerrestrialAnimals(wolf1);
        ambiente3.addTerrestrialAnimals(dog1);
    }
}
