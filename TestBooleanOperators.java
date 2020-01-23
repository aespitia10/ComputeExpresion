import java.util.*;
public class TestBooleanOperators
{
    public static void main(String[]args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any intger: ");
        int userInt = input.nextInt();

        if((userInt % 2 == 0) && (userInt % 3 == 0))
        {
            System.out.println(userInt + " is divisible by 2 and 3");
        }
        if((userInt % 2 == 0) || (userInt % 3 == 0))
        {
            System.out.println(userInt + " is divisible by 2 or 3");

        }
        if((userInt % 2 == 0) ^ (userInt % 3 == 0))
        {
            System.out.println(userInt + " is divisible by 2 or 3 but not both");
        }
        input.close();
        System.exit(1);   
    }
}
