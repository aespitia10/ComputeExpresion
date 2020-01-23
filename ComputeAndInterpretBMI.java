import java.util.*;
public class ComputeAndInterpretBMI
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight in pounds and height in inches: ");
        double pounds = input.nextDouble();
        double inches = input.nextDouble();
        double kilograms = pounds * 0.45359237;
        double meters = inches * 0.0254;
        double bmi = kilograms / Math.pow(meters, 2);

        System.out.print(bmi + " is bmi");
        if(bmi < 18.5)
            System.out.print("The person is Underwieght");
        else if(bmi < 25.0)
        System.out.print("The person is Normal");
        else if(bmi < 30.0)
        System.out.print("The person is Overweight");
        else 
            System.out.print("The person is Obese");

        input.close();
    }
}