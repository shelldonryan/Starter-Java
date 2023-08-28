import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number -> ");
        int firstNumber = in.nextInt();

        System.out.print("Input other number -> ");
        int secondNumber = in.nextInt();
        in.close();

        if (firstNumber > secondNumber) {
            System.out.println("The first number is bigger than the second number");
            System.out.printf("%d > %d", firstNumber, secondNumber);
        }
        else {
            System.out.println("The second number is bigger than the first number");
            System.out.printf("%d > %d", secondNumber, firstNumber);
        }
    }
}
