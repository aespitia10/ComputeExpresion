import java.util.*; // wildcard import, imports all the classes in the package

public class ComputeAverage
{
    public static void main(String[]args)
    {
        // Create Scanner input 
           Scanner input = new Scanner(System.in);
           System.out.print("Enter three numbers: ");
           double number1 = input.nextDouble();
           double number2 = input.nextDouble();
           double number3 = input.nextDouble();

        // Compute Average 
            double average = (number1 + number2 + number3) / 3;
        // Display Results 
        System.out.println("The average of " + number1 + " " + number2 + 
        " " + number3 + " is " + average);
        input.close();
   }
}