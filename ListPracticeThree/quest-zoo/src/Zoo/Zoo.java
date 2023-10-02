package Zoo;

import Environments.Environment;

public class Zoo {
    public String name;
    public String description;
    public String onwer;
    public String street;
    public int numberOfAnimals;
    public int capacityPeople;
    public Environment[] environments;

    public Zoo(String name, String description, String onwer, String street, int qntAnimals, int capacity, int qntEnvironments) {
        this.name = name;
        this.description = description;
        this.onwer = onwer;
        this.street = street;
        this.numberOfAnimals = qntAnimals;
        this.capacityPeople = capacity;
        this.environments = new Environment[qntEnvironments];
    }

    public void addEnviroments(Environment environment) {
        for(int i = 0; i < environments.length; i++) {
            if(environments[i] == null) {
                environments[i] = environment;
                break;
            }
        }
    }

    public void outInfo() {
        System.out.printf("""
                Detalhes do Zoo:
                Name: %s
                Description: %s
                Owner: %s
                Street: %s
                Current number of Animals: %d
                """, name, description, onwer, street, numberOfAnimals);
    }

    public void report(String report) {
        System.out.println("Dear " + onwer + "...");
        System.out.println(report);
    }

    public void capacity(int peopleInZoo) {
        System.out.println("The maximum number of people in this zoo is " + capacityPeople);

        if (peopleInZoo >= capacityPeople) {
            System.out.println("The max capacity has been reached");
        } else {    
            System.out.println("The zoo can get more people yet");
        }
    }

    public void whatEnvironment() {
        for(int i = 0; i < environments.length; i++) {
            System.out.println(environments[i].environmentName);
        }
    }
}
