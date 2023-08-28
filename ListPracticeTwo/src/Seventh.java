import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input your salary: ");
        double salary = in.nextDouble();
        in.close();

        if (salary <= 280.00) {
            double increase = 1.2;
            double reajustedSalary = salary * increase;
            double increaseValue = reajustedSalary - salary;
            System.out.printf("""
                    Inital Salary: %.2f
                    Percentage of Increase: %.2f
                    Value of Increase: %.2f
                    Reajusted Salary: %.2f
                    """, salary, increase, increaseValue, reajustedSalary);
        }
        else if (salary <= 700.00) {
            double increase = 1.15;
            double reajustedSalary = salary * increase;
            double increaseValue = reajustedSalary - salary;
            System.out.printf("""
                    Inital Salary: %.2f
                    Percentage of Increase: %.2f
                    Value of Increase: %.2f
                    Reajusted Salary: %.2f
                    """, salary, increase, increaseValue, reajustedSalary);
        }
        else if (salary <= 1500.00) {
            double increase = 1.1;
            double reajustedSalary = salary * increase;
            double increaseValue = reajustedSalary - salary;
            System.out.printf("""
                    Inital Salary: %.2f
                    Percentage of Increase: %.2f
                    Value of Increase: %.2f
                    Reajusted Salary: %.2f
                    """, salary, increase, increaseValue, reajustedSalary);
        }
        else if (salary > 1500.00) {
            double increase = 1.05;
            double reajustedSalary = salary * increase;
            double increaseValue = reajustedSalary - salary;
            System.out.printf("""
                    Inital Salary: %.2f
                    Percentage of Increase: %.2f
                    Value of Increase: %.2f
                    Reajusted Salary: %.2f
                    """, salary, increase, increaseValue, reajustedSalary);
        }
    }
}
