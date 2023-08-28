import java.util.Scanner;

public class Fourteenth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the amount of numbers: ");
        int amount = in.nextInt();
        in.close();

        for (int i = 1; i < amount + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
