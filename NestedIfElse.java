import java.util.*;
public class NestedIfElse
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for i, j, and k: ");
        double i = input.nextDouble();
        double j = input.nextDouble();
        double k = input.nextDouble();
        
        if(i > k)
        {
            if(j > k)
                System.out.println("i and j are greater than k");
        }
        else 
        System.out.println("i is less than or equal to k");
        input.close();
    }
}