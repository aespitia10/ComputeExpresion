import java.util.*;
public class ExponentialOperator
{
    public static void main(String[]args)
    {
        
        Scanner input = new Scanner(System.in); 
        System.out.println("!!!Welcome to expontential operator!!!");
        System.out.print("Enter two integers: ");
        int m = input.nextInt();
        int r = input.nextInt();
        System.out.println(m * Math.pow(r , 2));
        input.close();
        

// Examples
        System.out.println("a = " + 56 % 6); // 2
        System.out.println("b = " + 78 % -4); // 2
        System.out.println("c = " + -34 % 5);// -4
        System.out.println("d = " + -34 % -5); // -4
        System.out.println("e = " + 5 % 1);// 0
        System.out.println("f = " + 1 % 5); // 1

// Calculating the day of the week 
        /* 
            0 = Sunday
            1 = Monday 
            2 = Tuesday 
            3 = Wednesday 
            4 = Thursday 
            5 = Friday 
            6 = Saturday
        */
       System.out.println("100 days after a tuesday is: " + (2 + 100) % 7 );
       System.out.println(25f / 4f); 
    }
}