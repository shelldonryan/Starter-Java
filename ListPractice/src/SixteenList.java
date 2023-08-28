import java.util.Scanner;

public class SixteenList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = in.nextInt();
        in.close();

        if (number % 2 == 0) {
            System.out.println("This number is multiple of 3");
        }
        else {
            System.out.println("This number isn't multiple of 3");
        }
    }
}
