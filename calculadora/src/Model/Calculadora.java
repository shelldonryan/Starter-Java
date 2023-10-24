package Model;

public class Calculadora {
    public int sum(int a, int b) {
        return a + b;
    }
    
    public int subtraction(int a, int b) {
        return a - b;
    }
    
    public  int multiplication(int a, int b) {
        return a * b;
    }
    
    public int division(int a, int b) {
        int resultado = 0;

        try {
            if(b == 0) {
                throw new DivisaoZeroException();
            }
            resultado = a / b;
        } catch (DivisaoZeroException e){
            System.err.println("\n" + e);
        } finally {
            System.out.println("\nOperação Finalizada!");
        }

        return resultado;
    }
}
