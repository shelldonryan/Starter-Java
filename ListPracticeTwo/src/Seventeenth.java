import java.util.Scanner;
import java.util.ArrayList;

public class Seventeenth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Double> provisions = new ArrayList<>();

        while (true) {
            System.out.print("\nGive me the installment value: R$ ");
        double installValue = in.nextDouble();

        if (installValue == 0) {
            System.out.println("\nThere isn't more values\n");
            break;
        }
        else {
            provisions.add(installValue);
        }

        System.out.print("\nGive me the number of delayed days: ");
        int days = in.nextInt();

        double result = valorPagamento(installValue, days);

        System.out.printf("\nAmount to be paid is R$ %.2f\n", result);
        }
        in.close();
        
        double sumProvisions = 0;
        for (int i = 0; i < provisions.size(); i++) {
            sumProvisions += provisions.get(i);
        }
        System.out.printf("""
                REPORT OF THE DAY
                \nAmount of Provisions: %d
                Value of the Provisions: R$ %.2f
                """, provisions.size(), sumProvisions);

        System.out.println("\nFinished Program");
        

    }

    public static double valorPagamento(double provision, int day) {
        double result = 0;
        if (day == 0) {
            result =provision;
        }
        else if (day > 0) {
            result = (provision * 1.03) * (day * 0.001 + 1);
        }
        return result;
    }
}
