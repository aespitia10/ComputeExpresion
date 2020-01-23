import java.util.*;
public class CountingMonetaryUnits
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of money in decimal number: $");
        double totalAmount = input.nextDouble();
        
        int remainderCents = (int)(totalAmount * 100);

        int dollars = remainderCents / 100;
        remainderCents = remainderCents % 100;

        int quarters = remainderCents / 25 ; 
        remainderCents = remainderCents % 25 ;

        int dimes = remainderCents / 10 ; 
        remainderCents = remainderCents % 10; 

        int nickles = remainderCents / 5; 
        remainderCents = remainderCents % 5; 

        int pennies = remainderCents; 
        System.out.println("Your amount " + totalAmount + " consists of");
        System.out.println(" " + dollars + " dollars");
        System.out.println(" " + quarters + " quarters ");
        System.out.println(" " + dimes + " dimes");
        System.out.println(" " + nickles + " nickels");
        System.out.println(" " + pennies + " pennies");

        input.close();
        
    }
}