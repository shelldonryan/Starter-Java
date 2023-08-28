import java.util.Scanner;
import java.util.ArrayList;

public class Nineteenth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        while (true) {
            System.out.print("\nInput a grade: ");
            double grade = in.nextDouble();
            if (grade == -1) {
                System.out.println("\nFinished Input\n");
                break;
            }
            else if (grade > 10) {
                System.out.println("\nInvalid Option");
            }
            else {
                grades.add(grade);
            }
        }

        double sumOfValues = 0;
        for (int i = 0; i < grades.size(); i++) {
            sumOfValues += grades.get(i);
        }

        System.out.println("Order of grades: ");
        for (int j = 0; j < grades.size(); j++) {
            System.out.printf("%.1f\n", grades.get(j));
        }

        System.out.println("\nReverse grade order:");
        for (int k = grades.size() - 1; k > -1 ; k--) {
            System.out.printf("%.1f\n", grades.get(k));
        }

        in.close();

        System.out.printf("""
                \nAmount of values: %d
                Sum of the Values: %.1f
                Average of the Values: %.1f
                """, grades.size(), sumOfValues, sumOfValues / grades.size());
        System.out.println("\nFinished Program");
    }
}
