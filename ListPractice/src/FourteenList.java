import java.util.Scanner;

public class FourteenList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input a number for your preference: ");
        int number = in.nextInt();
        in.close();

        if (number % 2 == 0) {
            System.out.print("This number is even");
        }
        else {
            System.out.println("This number isn't even");
        }
    }
}
