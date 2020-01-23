import java.util.*;
public class Grades
{
    public static void main(String[]aStrings)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a score between 0 and 100: ");
        double score = input.nextDouble();

        if(score >= 90.0)
            System.out.print("A");
        else if (score >= 80.0)
            System.out.print("B");
        else if (score >= 70.0)
            System.out.print("C");  
        else if (score >= 60.0)
            System.out.print("D");
        else 
            System.out.print("F");
            
        input.close(); 

    }
}