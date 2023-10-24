package Main;
import java.util.Scanner;
import Model.Usuario;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Usuario usuario1 = new Usuario(
            "shelldonryan",
            "ryan2323"
        );

        String nomeUsuario = scanner.nextLine();
        String senha = scanner.nextLine();
        scanner.close();

        usuario1.autenticar(nomeUsuario, senha);
    }
}
