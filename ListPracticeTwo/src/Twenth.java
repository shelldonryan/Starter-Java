import java.util.Scanner;

public class Twenth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int windowsServer = 0;
        int unix = 0;
        int linux = 0;
        int netWare = 0;
        int macOs = 0;
        int outro = 0;

        System.out.println("""
                1 - Windows Server
                2 - Unix
                3 - Linux
                4 - Net Ware
                5 - Mac OS
                6 - Outros
                """);

        while (true) {
            System.out.print("\nInput your desire option: ");
            int option = in.nextInt();
            if (option == 0) {
                System.out.println("\nFinished Programming\n");
                break;
            }
            else if (option == 1) {
                windowsServer++;
            }
            else if (option == 2) {
                unix++;
            }
            else if (option == 3) {
                linux++;
            }
            else if (option == 4) {
                netWare++;
            }
            else if (option == 5) {
                macOs++;
            }
            else if (option == 6) {
                outro++;
            }
            else {
                System.out.println("Invalid Option");
            }
        }
        in.close();

        System.out.printf("""
                windows server: %d
                unix: %d
                linux: %d
                netware: %d
                macOs: %d
                outro: %d
                """, windowsServer, unix, linux, netWare, macOs, outro);
    }
}