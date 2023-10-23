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

        if(op.equals("+")) {
            try {
                int resultado = calculadora.sum(numero1, numero2);
            System.out.println("\nResultado: "+ resultado);
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("\nOperação Finalizada!");
            }
            
        } else if (op.equals("-")) {
            try {
                int resultado = calculadora.subtraction(numero1, numero2);
                System.out.println("\nResultado: "+ resultado);
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("\nOperação Finalizada!");
            }
        } else if (op.equals("*")) {
            try {
                int resultado = calculadora.multiplication(numero1, numero2);
                System.out.println("\nResultado: "+ resultado);
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("\nOperação Finalizada!");
            }
        } else if (op.equals("/")) {
            try {
                int resultado = calculadora.division(numero1, numero2);
                System.out.println("\nResultado: "+ resultado);
            } catch (ArithmeticException e){
                System.out.println("\nDivisao por zero nao existe");
            } finally {
                System.out.println("\nOperação Finalizada!");
            }
        } else {
            System.out.println("\nSó aceitasse  '+', '-', '*' ou '/'");
        }
        
        scanner.close();
    }
}
