import java.util.Scanner;

public class TwentyList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How much do you earn per hour?");
        double earnedPerHour = in.nextDouble();

        System.out.print("How many hours do you work per month?");
        double hoursPerMonth = in.nextDouble();
        in.close();

        double grossSalary = earnedPerHour * hoursPerMonth;
        double incomeTax = grossSalary * 0.11;
        double inss = grossSalary * 0.08;
        double sindicate = grossSalary * 0.05;
        double netWage = grossSalary * 0.76;

        System.out.printf("The net wage is R$ %.2f, gross salary is R$ %.2f, inss is R$ %.2f, sindicate is R$ %.2f, income tax is R$ %.2f, ", netWage, grossSalary, inss, sindicate, incomeTax);
    }
}
