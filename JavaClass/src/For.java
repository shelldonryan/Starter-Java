import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] number = new int[4];

        for (int i = 0; i<number.length; i++) {
            System.out.printf("Write the %d number: ", i + 1);
            number[i] = in.nextInt();
        }

        in.close();

        for (int i=0; i<number.length; i++){
            System.out.printf("The number of %d position is %d\n", i + 1, number[i]);
        }
        
        // for each 
        for(int i : number) {
            System.out.println(i);
        }
    }
}
