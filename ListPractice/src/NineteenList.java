import java.util.Scanner;

public class NineteenList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input the first grade:");
        int grade1 = in.nextInt();

        System.out.print("Input the second grade:");
        int grade2 = in.nextInt();

        System.out.print("Input the third grade:");
        int grade3 = in.nextInt();

        System.out.print("Input the fourth grade:");
        int grade4 = in.nextInt();
        in.close();

        int middle = (grade1 + grade2 + grade3 + grade4) / 4;

        System.out.printf("The middle is %d", middle);

    }
}
