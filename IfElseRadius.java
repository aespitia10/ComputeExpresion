import java.util.*;
public class IfElseRadius
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius greater than zero: ");
        double radius = input.nextDouble();

            if(radius < 0)
            {
                System.out.print("Incorrect input");
            }
            else 
            {
                double area = Math.pow(radius, 2) * 3.14159;
                System.err.print("Area is " + area);
            }
        input.close();
    }
}