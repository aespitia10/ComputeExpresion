import java.util.*;
public class ChineseZodiac
{
    public static void main(String[]args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year you were born in: ");
        int year = input.nextInt(); 

        switch (year % 12)
        {
            case 0: System.out.println("Zodiac: Monkey"); 
                    break;
            case 1: System.out.println("Zodiac: Rooster"); 
                    break;
            case 2: System.out.println("Zodiac: dog"); 
                    break;
            case 3: System.out.println("Zodiac: Pig"); 
                    break;
            case 4: System.out.println("Zodiac: Rat"); 
                    break;
            case 5: System.out.println("Zodiac: Ox"); 
                    break;
            case 6: System.out.println("Zodiac: Tiger");
                    break;
            case 7: System.out.println("Zodiac: Rabbit"); 
                    break;
            case 8: System.out.println("Zodiac: Dragon"); 
                    break;
            case 9: System.out.println("Zodiac: Snake"); 
                    break;
           case 10: System.out.println("Zodiac: Horse"); 
                    break;
           case 11: System.out.println("Zodiac: Sheep"); 
                    break;
        }
        // This is equivalent code but going from switch to if-else statements 
        // if(year % 12 == 0)
        //         System.out.println("Monkey");
        // else if(year % 12 == 1)
        //         System.out.println("Rooster");
        // else if(year % 12 == 2)
        //         System.out.println("Dog");
        // else if(year % 12 == 3)
        //         System.out.println("Pig");
        // else if(year % 12 == 4)
        //         System.out.println("Rat");
        // else if(year % 12 == 5)
        //         System.out.println("Ox");
        // else if(year % 12 == 6)
        //         System.out.println("Tiger");
        // else if(year % 12 == 7)
        //         System.out.println("Rabbit");
        // else if(year % 12 == 8)
        //         System.out.println("Dragon");
        // else if(year % 12 == 9)
        //         System.out.println("Snake");
        // else if(year % 12 == 10)
        //         System.out.println("Horse");
        // else if(year % 12 == 11)
        //         System.out.println("Sheep");
        input.close();
   }
}