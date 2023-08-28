import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Create the table of the number  ");
        int tableNumber = in.nextInt();

        System.out.print("Start by ");
        int startNumber = in.nextInt();

        System.out.print("End by ");
        int endNumber = in.nextInt();
        in.close();

        System.out.printf("""
                Create the table: %d
                Start the table by: %d
                End the table by: %d
                """, tableNumber, startNumber, endNumber);

        for (int i = startNumber; i < endNumber + 1; i++) {
            int result = i * tableNumber;
            System.out.printf("%d * %d = %d", tableNumber, i, result);
            System.out.println(" ");
        }   

    }
}
