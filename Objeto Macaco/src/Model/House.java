package Model;
import java.util.ArrayList;
import java.util.List;

public class House {
    //listas para armazenar objetos;
    private List<Animal> listAnimals;
    private List<Vehicle> listVehicles;
    private List<Person> listPeople;

    public House() {
        this.listAnimals = new ArrayList<>();
        this.listVehicles = new ArrayList<>();
        this.listPeople = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        listAnimals.add(animal);
    }

    public void addVehicle(Vehicle vehicle) {
        listVehicles.add(vehicle);
    }

    public void addPerson(Person person) {
        listPeople.add(person);
    }

    public void displayInformations() {
        System.out.println("\nList of animals in the house:");
        for (int i = 0; i < listAnimals.size(); i++) {
            System.out.println(listAnimals.get(i).specie);
        }

        System.out.println("\nList of vehicle in the house:");
        for (int i = 0; i < listVehicles.size(); i++) {
            System.out.println(listVehicles.get(i).brand + " " + listVehicles.get(i).model);
        }

        System.out.println("\nList of people in the house:");
        for (int i = 0; i < listPeople.size(); i++) {
            System.out.println(listPeople.get(i).name);
        }
    }
}
