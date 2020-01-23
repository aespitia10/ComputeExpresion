import java.util.*;
public class InputNumbers
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a byte number: ");
        byte num1 = input.nextByte();

        System.out.print("\nEnter a short number: ");
        short num2 = input.nextShort();

        System.out.print("\nEnter a long number: ");
        long num3 = input.nextLong();

        System.out.print("\nEnter a int number: ");
        int num4 = input.nextInt();

        System.out.print("\nEnter a float number: ");
        float num5 = input.nextFloat();

        System.out.print("\nEnter a double number: ");
        double num6 = input.nextDouble();

        System.out.print("\nEnter a boolean: ");
        boolean num7 = input.nextBoolean();

        System.out.println(num1 + num2 + num3 + num4 + num5);
        System.out.println(num6);
        System.out.println(num7);

        input.close();
    }
}