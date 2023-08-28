import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Write your first name: " );
        String firstName = entrada.nextLine();

        System.out.print("Write your Second Name: ");
        String secondName= entrada.nextLine();

        String completedName = firstName + " " + secondName;

        entrada.close();

        System.out.printf("\nYour name is %s\n", completedName);

        if (firstName.equals("Shelldon")) {
            System.out.println("You're a admin of this system");
        }
        else {
            System.out.println("You aren't a admin of this system");
        }
    }
}