import java.util.Scanner;

public class Fourth
 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numbers = new int[3];
        int biggerNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Input a number: ");
            numbers[i] = in.nextInt();
            
            if (i == 0) {
                biggerNumber = numbers[i];
            }
            
            if (numbers[i] > biggerNumber) {
                biggerNumber = numbers[i];
            }
        }

        in.close();

        System.out.printf("The bigger number is %d", biggerNumber);
    }
}
