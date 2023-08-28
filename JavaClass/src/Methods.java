import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = in.nextLine();

        String mensagemDeBoasVindas = boasVindas(name);
        System.out.println(mensagemDeBoasVindas);

        in.close();
    }
    
    public static String boasVindas(String name) {
        return "Seja Bem-vindo " + name;
    }
}
