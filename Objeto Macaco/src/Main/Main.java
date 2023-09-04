package Main;
import Model.Animal;

public class Main {
    public static void main(String[] args) {
        Animal featuresAnimal = new Animal("Petter Pink", "Dog", 2, 0.78, "He like to listen jazz");
        
        System.out.println("Description of the your " + featuresAnimal.specie);
        featuresAnimal.animalDescription();
    }
}
 