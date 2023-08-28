import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many hours do you work per month: " );        
        int hoursPerMonth = in.nextInt();

        System.out.print("Input the value of your hourly rate: " );
        int hourlyRate = in.nextInt();
        in.close();

        double grossSalary = hourlyRate * hoursPerMonth;

        double fgts = grossSalary * 0.11;
        double inss = grossSalary * 0.1;

        if (grossSalary <= 900) {
            double incomeTax = grossSalary * 0;
            double discounts = incomeTax + inss;
            System.out.printf("""
                    Gross Salary: R$ %.2f
                    Income Tax: R$ %.2f
                    INSS: R$ %.2f
                    FGTS: R$ %.2f
                    Total Discounts: R$ %.2f
                    Net Wage: R$ %.2f
                    """, grossSalary, incomeTax, inss, fgts, discounts, (grossSalary - discounts));
        }
        else if (grossSalary <= 1500) {
            double incomeTax = grossSalary * 0.05;
            double discounts = incomeTax + inss;
            System.out.printf("""
                    Gross Salary: R$ %.2f
                    Income Tax: R$ %.2f
                    INSS: R$ %.2f
                    FGTS: R$ %.2f
                    Total Discounts: R$ %.2f
                    Net Wage: R$ %.2f
                    """, grossSalary, incomeTax, inss, fgts, discounts, (grossSalary - discounts));
        }
        else if (grossSalary <= 2500) {
            double incomeTax = grossSalary * 0.1;
            double discounts = incomeTax + inss;
            System.out.printf("""
                    Gross Salary: R$ %.2f
                    Income Tax: R$ %.2f
                    INSS: R$ %.2f
                    FGTS: R$ %.2f
                    Total Discounts: R$ %.2f
                    Net Wage: R$ %.2f
                    """, grossSalary, incomeTax, inss, fgts, discounts, (grossSalary - discounts));
        }
    }
}
