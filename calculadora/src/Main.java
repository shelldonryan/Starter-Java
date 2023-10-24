import java.util.Scanner;
import Model.Calculadora;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora\n");

        System.out.println("Qual o simbolo da operação desejada?");
        String op = scanner.next().toUpperCase();
        
        System.out.println("\nDigite o primeiro numero:");
        int numero1 = scanner.nextInt();
        
        System.out.println("\nDigite o segundo numero:");
        int numero2 = scanner.nextInt();

        switch (op) {
            case "+" -> calculadora.sum(numero1, numero2);
            case "-" -> calculadora.subtraction(numero1, numero2);
            case "*" -> calculadora.multiplication(numero1, numero2);
            case "/" -> calculadora.division(numero1, numero2);
        }
            
        scanner.close();
    }
}
