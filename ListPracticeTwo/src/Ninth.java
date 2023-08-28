import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String day = """
                1 - *****
                2 - *****
                3 - *******
                4 - *********
                5 - ********
                6 - ******
                7 - ********
                """;
        System.out.println(day);

        System.out.print("Select one number: " );
        int selectedNumber = in.nextInt();
        in.close();

        switch ( selectedNumber ) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
        }
    }
}
