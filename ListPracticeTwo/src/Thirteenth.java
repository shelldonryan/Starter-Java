import java.util.Scanner;

public class Thirteenth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the amount of th terms: ");
        int N = in.nextInt();
        in.close();

        double h = 0;

        System.out.print("H = ");
        for (int i = 1; i < N + 1; i++) {
            h += 1.0 / i;

            if (i != N) {
                System.out.printf("1/%d + ", i);
            }
            else {
                System.out.printf("1/%d = ", i);
            }
        }

        System.out.printf("%f", h);
    }
}
