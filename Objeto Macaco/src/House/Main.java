package House;

import Model.Animal;
import Model.Vehicle;
import Model.Person;
import Model.House;

public class Main {

    public static void main(String[] args) {
    Animal animal1 = new Animal("Frankinha","chicken", 3, 0.34, "She likes to run after kids");
    Animal animal2 = new Animal("Darbi","cat", 4, 0.68, "She likes to sleep");

    Vehicle vehicle1 = new Vehicle("Volkswagen", "Golf", 2019, 209762.00);
    Vehicle vehicle2 = new Vehicle("Mitsubishi", "L200 Triton", 2023, 207046.00);
    Vehicle vehicle3 = new Vehicle("Bmw", "M5 Competition", 2022, 935671.00);
    Vehicle vehicle4 = new Vehicle("Ferrari", "488 Gtb", 2019, 3234848.00);
    Vehicle vehicle5 = new Vehicle("Toyota", "Sw4", 2023, 423890.00);

    Person person1 = new Person("Shelldon Ryan", 17, "Street AB, 34", 81955736, "masculino");
    Person person2 = new Person("Shirlley Rayanne", 12, "Street A, 82",67890123, "feminino");
    Person person3 = new Person("Francisca Maria", 38, "Street A, 82",67850123, "feminino");
    Person person4 = new Person("Dimas Oliveira", 45, "Street A, 82",81514800, "masculino");

    House house1 = new House();

    house1.addAnimal(animal1);
    house1.addAnimal(animal2);

    house1.addVehicle(vehicle1);
    house1.addVehicle(vehicle2);
    house1.addVehicle(vehicle3);
    house1.addVehicle(vehicle4);
    house1.addVehicle(vehicle5);

    house1.addPerson(person1);
    house1.addPerson(person2);
    house1.addPerson(person3);
    house1.addPerson(person4);

    house1.displayInformations();
    }

}
