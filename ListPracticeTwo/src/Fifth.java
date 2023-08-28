import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numbers = new int[3];
        int lowerNumber = 0;
        int biggerNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Input your number: ");
            numbers[i] = in.nextInt();

            if (i == 0) {
                lowerNumber = numbers[i];
                biggerNumber = numbers[i];
            }

            if (biggerNumber < numbers[i]) {
                biggerNumber = numbers[i];
            }

            if (lowerNumber > numbers[i]) {
                lowerNumber = numbers[i];
            }
        }

        in.close();

        System.out.printf("The bigger number is %d and the smaller number is %d", biggerNumber, lowerNumber);
    }
}
