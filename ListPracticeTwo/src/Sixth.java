import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String menu = """
                M - Matutino
                V - Vespertino
                N - Noturno
                """;

        System.out.println(menu);

        System.out.print("Input your oiption: ");
        String c = in.next().toUpperCase();
        in.close();

        switch (c) {
            case "M" -> System.out.println("Good Morning");
            case "V" -> System.out.println("Good Afternon");
            case "N" -> System.out.println("Good Night");
            default -> System.out.println("This option don't work or exists");
        }
    }
}
