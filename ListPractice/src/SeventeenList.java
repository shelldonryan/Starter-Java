import java.util.Scanner;

public class SeventeenList {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = in.nextInt();
        in.close();

        if (number % 5 == 0) {
            System.out.println("This number is multiple of 5");
        }
        else {
            System.out.println("This number isn't multiple of 5");
        }
    }
}
