import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int[] vetor = new int[3];


        try {
            Scanner scanner = new Scanner(System.in);
            String nome = scanner.nextLine();
            //System.out.println(5/0);
            //System.out.println(vetor[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("A posicao acessada nao existe");
        } catch (ArithmeticException e){
            System.out.println("Operacao matematica nao permitida");
        } catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("Finalizou");
        }

        System.out.println("O programa finalizou sem quebrar");


    }
}