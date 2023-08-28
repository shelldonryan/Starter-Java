import java.util.Scanner;

public class FifteenList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        int number = in.nextInt();
        in.close();

        if (number % 3 != 0) {
            System.out.println("This number is odd");
        }
        else {
            System.out.println("This number isn't odd");
        }
        
    }
}
