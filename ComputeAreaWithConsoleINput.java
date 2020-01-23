import java.util.Scanner; // Scanner is in the java.util package
//import java.util.*; // wildcard import, imports all the classes in the package

public class ComputeAreaWithConsoleINput
{
    public static void main(String[]args)
    {
        // Create Scanner input 
           Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius 
        System.out.print("Enter a number for the raduis: ");
        double radius = input.nextDouble();

        // Comput area 
        double area = radius * radius * 3.14159;

        // Print results 
        System.out.println("The area for the circle of radius " + radius + " is " + area );
        input.close();
    }
}