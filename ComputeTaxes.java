import java.text.DecimalFormat;
import java.util.*;
public class ComputeTaxes 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat(".##");
        System.out.print("Enter 0 for single filers, " + 
        "1 for married filing jointly or qualified widow(er), " + 
        "2 for married filing separately, and 3 for head of household." + "\nEnter: ");
        int status = input.nextInt();

        if (status == 0) // Single filling
        {
            System.out.print("Enter the income: $");
            int income = input.nextInt();
            if(income > 0 && income <= 8350)
            {
                double tax = income * (10d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income <= 33950)
            {
                double tax = 8350 * (10d / 100) + (income - 8350) * (15d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income <= 82250)
            {
                double tax = 8350 * (10d / 100) + (33950 - 8350) * (15d / 100) + 
                (income - 33950) * (25d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income <= 171550)
            {
                double tax = 8350 * (10d / 100) + (33950 - 8350) *(15d / 100) + 
                (82250 - 33950) * (25d / 100) + (income - 82250) * (28d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income <= 372950)
            {
                double tax = 8350 * (10d / 100) + (33950 - 8350) *(15d / 100) + 
                (82250 - 33950) * (25d / 100) + (171550 - 82250) * (28d / 100) +
                (income - 171550) * (33d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income >= 372951)
            {
                double tax = 8350 * (10d / 100) + (33950 - 8350) *(15d / 100) + 
                (82250 - 33950) * (25d / 100) + (171550 - 82250) * (28d / 100) +
                (372951 - 171550) * (33d / 100) + (income - 372950) * (35d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
        }   
        else if(status == 1)//Married filling
        {
            System.out.print("Enter the income: $");
            int income = input.nextInt();
            if(income > 0 && income <= 16700)
            {
                double tax = income * (10d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income <= 67900)
            {
                double tax = 16700 * (10d / 100) + (income - 16700) * (15d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income <= 137050)
            {
                double tax = 16700 * (10d / 100) + (67900 - 8350) * (15d / 100) + 
                (income - 67900) * (25d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income <= 208850)
            {
                double tax = 16700 * (10d / 100) + (67900 - 8350) * (15d / 100) + 
                (137050 - 67900) * (25d / 100) + (income - 137050) * (28d / 100); 
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income <= 372950)
            {
                double tax = 16700 * (10d / 100) + (67900 - 8350) * (15d / 100) + 
                (137050 - 67900) * (25d / 100) + (208850 - 137050) * (28d / 100) +
                (income - 208850) * (30d / 100);

                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income >= 372951)
            {
                double tax = 16700 * (10d / 100) + (67900 - 8350) * (15d / 100) + 
                (137050 - 67900) * (25d / 100) + (208850 - 137050) * (28d / 100) +
                (372950 - 208850) * (30d / 100) + (income - 372950) + (35d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
        }   
        else if (status == 2)//Married Filing Seperate
        {
            System.out.print("Enter the income: $");
            int income = input.nextInt();
            if(income > 0 && income <= 8350)
            {
                double tax = income * (10d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income <= 33950)
            {
                double tax = 8350 * (10d / 100) + (income - 8350) * (15d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income <= 68525)
            {
                double tax = 8350 * (10d / 100) + (33950 - 8350) * (15d / 100) +
                (income - 33950) * (25d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income <= 104425)
            {
                double tax = 8350 * (10d / 100) + (33950 - 8350) * (15d / 100) +
                (68525 - 33950) * (25d / 100) + (income - 68525) * (28d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income <= 186475)
            {
                double tax = 8350 * (10d / 100) + (33950 - 8350) * (15d / 100) +
                (68525 - 33950) * (25d / 100) + (104425 - 68525) * (28d / 100) +
                (income - 104425) * (33d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income >= 186476)
            {
                double tax = 8350 * (10d / 100) + (33950 - 8350) * (15d / 100) +
                (68525 - 33950) * (25d / 100) + (104425 - 68525) * (28d / 100) +
                (186475 - 104425) * (33d / 100) + (income - 186475) * (35d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }

        }
        else if (status == 3)//Head of household
        {
            System.out.print("Enter the income: $");
            int income = input.nextInt();
            if(income > 0 && income <= 11950)
            {
                double tax = income * (10d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income <= 45500)
            {
                double tax = 11950 * (10d / 100) + (income - 11950) * (15d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income <= 117450)
            {
                double tax = 11950 * (10d / 100) + (45500 - 11950) * (15d / 100) +
                 (income - 45500) * (25d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income <= 190200)
            {
                double tax = 11950 * (10d / 100) + (45500 - 11950) * (15d / 100) +
                (117450 - 45500) * (25d / 100) + (income - 117450) * (28d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income <= 372950)
            {
                double tax = 11950 * (10d / 100) + (45500 - 11950) * (15d / 100) +
                (117450 - 45500) * (25d / 100) + (190200 - 117450) * (28d / 100) +
                (income - 190200) * (33d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }
            else if(income >= 372951)
            {
                double tax = 11950 * (10d / 100) + (45500 - 11950) * (15d / 100) +
                (117450 - 45500) * (25d / 100) + (190200 - 117450) * (28d / 100) +
                (372950 - 190200) * (33d / 100) + (income - 372950) * (35d / 100);
                System.out.print("The tax on your income is: $" + df2.format(tax));
            }

        }
        else
        {
            System.out.println("!!!Your entry is invalid!!!");
            
        }
        
        System.exit(1);
        input.close(); 
    }
}