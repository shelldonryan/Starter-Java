package Animals;

import java.time.LocalTime;

public abstract class Animal {
    public String name;
    public String specie;
    public int age;
    public LocalTime horaDeDormir;
    public String animalEats;
    public double height;

    public Animal(String name, String specie, int age, LocalTime horaDeDormir, String animalEats, double height) {
        this.name = name;
        this.specie = specie;
        this.age = age;
        this.horaDeDormir = horaDeDormir;
        this.animalEats = animalEats;
        this.height = height;
    }

    public void OutInfo() {
        System.out.printf("""
                \nDetalhes do Animal:
                Name: %s
                Specie: %s
                age: %d years
                Animal Eats: %s
                Height: %.2f
                """, name, specie, age, animalEats, height);
    }

    public void sleep() {
        System.out.println("A hora que " + name + " dorme chegouuu, " + horaDeDormir.getHour() + ":" + horaDeDormir.getMinute());
    }

    public void activity() {
        System.out.println("Atividade preferida desse animal");
    }
}
