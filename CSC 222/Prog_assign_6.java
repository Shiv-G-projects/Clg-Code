import java.util.*;

public class Prog_assign_6 {
    public static void main(String[] args) {
        double[] futureValues = new double[30];
        //input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount invested: ");
        double investmentAmount = keyboard.nextDouble(); 
        System.out.println("Enter the interest rate: ");
        double annualInterestRate = keyboard.nextDouble(); 
        double monthlyInterestRate = annualInterestRate/12;

        //array generation
        for (int years = 1; years <= 30; years++) {
            futureValues[years - 1] = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
        }
        // array printing
        System.out.printf("%-5s %15s\n", "Years", "Future Value");

        for (int years = 1; years <= 30; years++) {
            System.out.printf("%-5d %15.2f\n", years, futureValues[years - 1]);
        }
    }
    public static double futureInvestmentValue( double investmentAmount, double monthlyInterestRate, int years){
        double FIV = investmentAmount * (Math.pow((1+monthlyInterestRate), (years*12)));
        return FIV; 
    }
}
