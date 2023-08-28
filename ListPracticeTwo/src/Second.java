import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Give me a entire number -> ");
        int entireNumber = in.nextInt();
        in.close();

        if (entireNumber >= 0) {
            System.out.println("This number is positive");
            System.out.printf("%d", entireNumber);
        }
        else if (entireNumber < 0) {
            System.out.println("This number is negative");
            System.out.printf("%d", entireNumber);
        }
        else {
            System.out.println("Invalid option");
        }
    }
}
