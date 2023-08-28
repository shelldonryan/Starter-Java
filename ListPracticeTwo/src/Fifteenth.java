import java.util.Scanner;

public class Fifteenth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input the amount of rows: ");
        int rows = in.nextInt();
        in.close();

        for (int i = 1; i < rows + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.printf("%d", j);
            }
            
            System.out.println(" ");
        }
    }
}
