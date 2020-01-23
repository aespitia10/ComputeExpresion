import java.util.*;
public class QuadraticFormula  
{
    public static void main(String [] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the values for a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

// check if this is the correct way to solve the quadratic formula
        double quadraticFormula = (-b + (Math.pow(Math.pow(b,2) - (4 * a * c), (1 / 2)))) / (2 * a);
        System.out.println("The answer for the quadratic formula is: " + quadraticFormula);

        input.close();   
    }
}