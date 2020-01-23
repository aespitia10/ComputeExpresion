import java.util.*;
public class ComputeAreaWithConstant 
{
    public static void main(String[]args)
    {
        final double PI = 3.14159; //Declare a constant 

        // Create a Scanner Object 
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the radius 
        System.out.print("Enter a number for the radius: ");
        double radius = input.nextDouble();

        // Compute Area 
        double area = radius * radius * PI;
        
        // Display the Result 
        System.out.println("The area for the circle of radius " + 
        radius + " is " + area);

        // Exaample 2.9 
        double miles = 100; 
        final double KILOMETERS_PER_MILE = 1.609;
        double kilometers = miles * KILOMETERS_PER_MILE;
        System.out.println("Kilometers = " + kilometers);
        
        input.close();
    }
}