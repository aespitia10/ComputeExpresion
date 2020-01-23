import java.util.*;
public class SubtractionQuiz
{
    public static void main(String[]args) 
    {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        System.out.println(number1);
        System.out.println(number2);

        if(number1 < number2)
        {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
            System.out.print("What is " + number1 + " - " + number2 + "?");
            int myAnswer = input.nextInt();
                if(myAnswer == number1 - number2)
                    System.out.println("Answer is corrrect");
                else 
                System.out.println("Answer is incorrect");
    
        input.close();
    }
}