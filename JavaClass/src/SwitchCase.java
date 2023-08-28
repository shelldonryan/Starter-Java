import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String menu = """
                1 - Entrar
                2 - Cadastrar
                3 - Listar Produtos
                """;
        
        System.out.print(menu);

        int option = entrada.nextInt();
        entrada.close();

        switch(option) {
            case 1:
                System.out.println("Opção de Entrar");
                break;
            case 2:
                System.out.println("Opção de cadastrar");
                break;
            case 3:
                System.out.println("Opção de Listar Produtos");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
         
        /*switch(option) {
            case 1 -> System.out.println("Opção de Entrar");
            case 2 -> System.out.println("Opção de cadastrar");
            case 3 -> System.out.println("Opção de Listar Produtos");
            default -> System.out.println("Opção Inválida");
        }*/
    }
}
