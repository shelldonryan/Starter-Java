package Model;

public class DivisaoZeroException extends RuntimeException{
    public DivisaoZeroException(){
        super("ERR > Divisao por zero");
    }
}
