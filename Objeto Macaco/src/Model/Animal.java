package Model;

public class Animal {
    public String name;
    public String specie;
    public int age;
    public double height;
    public String whatDoYouLike;

    public Animal(String name, String specie, int age, double height, String what) {
        this.name = name;
        this.specie = specie;
        this.age = age;
        this.height = height;
        this.whatDoYouLike = what;
    }

    public void whatDoYouLike() {
        System.out.println(name + ", " + whatDoYouLike);
    }

    public void animalDescription() {
        System.out.printf("Name of the animal: %s\n", name);
        System.out.printf("Specie of the animal: %s\n", specie);
        System.out.printf("Age of the animal: %d\n", age);
        System.out.printf("Height of the animal: %.2f metters\n", height);
        System.out.printf("What the animal like to do: %s\n", whatDoYouLike);
    }
}
