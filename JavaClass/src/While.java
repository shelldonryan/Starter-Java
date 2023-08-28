public class While {
    public static void main(String[] args) {
        int startIn = 0;
        int endIn = 10;

        /*while (startIn < endIn){

            System.out.println(startIn);
                startIn++;
            }
        }*/

        //Do-While

        do {
            System.out.print(startIn + " - ");
            startIn++;
        } while (startIn < endIn);
    }
}
