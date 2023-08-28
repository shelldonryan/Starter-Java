import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What number do you want to see the * table: ");
        int number = in.nextInt();
        in.close();

        for (int i = 1; i < 11; i++) {
            int result = number * i;
            System.out.printf("%d * %d = %d", number, i, result);
            System.out.println(" ");
        }
    }
}
