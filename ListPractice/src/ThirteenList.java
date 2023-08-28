public class ThirteenList {
    public static void main(String[] args) {
        int number = 4;

        if (0 <= number && 10 >= number) {
            System.out.print("Number between zero and ten");
        }
        else if (number < 0){
            System.out.println("This number is lower than zero");
        }
        else {
            System.out.println("This number is bigger than ten");
        }
    }
}
