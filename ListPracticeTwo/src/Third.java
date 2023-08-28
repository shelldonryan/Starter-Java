import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] grades = new double[2];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = in.nextDouble();
        }

        in.close();
        double average = (grades[0] + grades[1]) / 2;

        if (average == 10) {
            System.out.printf("You average grade is %.1f and you were approved with distinction", average);
        }
        else if (average > 7 && average < 10) {
            System.out.printf("You average grade is %.1f and you're approved", average);
        }
        else if (average < 7 && average > 0) {
            System.out.printf("You average grade is %.1f and you're failed", average);
        }
        else {
            System.out.println("Invalid Option");
        }

    }   
}
