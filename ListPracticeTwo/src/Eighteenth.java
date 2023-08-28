import java.util.Scanner;

public class Eighteenth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] answer = new String[5];

        System.out.printf("Did you call the victim? {Y/N} ");
        answer[0] = in.nextLine().toUpperCase();       

        System.out.printf("Were you at the crime scene? {Y/N} ");
        answer[1] = in.nextLine().toUpperCase();        

        System.out.printf("Do you live near the victim? {Y/N} ");
        answer[2] = in.nextLine().toUpperCase();        

        System.out.printf("Did you owe it to the victim? {Y/N} ");
        answer[3] = in.nextLine().toUpperCase();

        System.out.printf("Have you ever worked with the victim? {Y/N} ");
        answer[4] = in.nextLine().toUpperCase();
        in.close();

        int positiveAnswers = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i].equals("Y")) {
                positiveAnswers = positiveAnswers + 1;
            }
        }
        
        if (positiveAnswers == 5) {
            System.out.println("You're guilty");
        }
        else if (positiveAnswers >= 3 && positiveAnswers <= 4) {
            
            System.out.println("You're an complice");
        }
        else if (positiveAnswers == 2) {
            System.out.println("You're suspect");
        }
        else if (positiveAnswers < 2) {
            System.out.println("You're inocent");
        }
    }
}
