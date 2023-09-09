package Model;

public class House {
    //listas para armazenar objetos;
    private Animal[] listAnimals;
    private Vehicle[] listVehicles;
    private Person[] listPeople;
    private int animalCount;
    private int vehicleCount;
    private int peopleCount;
    

    public House(int maxAnimals, int maxVehicles, int maxPeople) {
        this.animalCount = 0;
        this.vehicleCount = 0;
        this.peopleCount = 0;
        this.listAnimals = new Animal[maxAnimals];
        this.listVehicles = new Vehicle[maxVehicles];
        this.listPeople = new Person[maxPeople];
    }

    public void addAnimal(Animal animal) {
        if (animalCount < listAnimals.length) {
            listAnimals[animalCount++] = animal;
        } else {
            System.out.print("\nThere isn't more storage here");
        }
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicleCount < listVehicles.length) {
            listVehicles[vehicleCount++] = vehicle;
        } else {
            System.out.print("\nThere isn't more storage here");
        }
    }

    public void addPerson(Person person) {
        if (peopleCount < listPeople.length) {
            listPeople[peopleCount++] = person;
        } else {
            System.out.print("\nThere isn't more storage here");
        }
    }

    public void displayInformations() {
        System.out.println("\nList of animals in the house:");
        for (int i = 0; i < listAnimals.length; i++) {
            System.out.println(listAnimals[i].specie);
        }

        System.out.println("\nList of vehicle in the house:");
        for (int i = 0; i < listVehicles.length; i++) {
            System.out.println(listVehicles[i].brand + " " + listVehicles[i].model);
        }

        System.out.println("\nList of people in the house:");
        for (int i = 0; i < listPeople.length; i++) {
            System.out.println(listPeople[i].name);
        }
    }
}
