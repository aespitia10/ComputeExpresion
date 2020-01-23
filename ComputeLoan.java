import java.util.*;
public class ComputeLoan 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("\nEnter the loan amount: $");
        double loanAmount = input.nextDouble();
        System.out.print("\nEnter the amount of years for which the payment will be made: ");
        int numberOfYears = input.nextInt();
        double monthlyInterestRate = annualInterestRate / 1200 ;

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow(1 + monthlyInterestRate , numberOfYears * 12)));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.print("\nThe monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
        System.out.print("\nThe total payment is $" + (int)(totalPayment * 100) / 100.0);



        input.close();
    }
}