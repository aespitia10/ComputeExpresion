public class ShowLogicErrors
{
    public static void main(String[] args) 
    {
        
        System.out.print("Celsius 35 is Fahrenheit degree: ");
        System.out.print((9/ 5) * 35 + 32 + "\n");
        // Easy Fix 
        System.out.print("The real conversion of Celsius 35 is Fahrenheit degree: ");
        System.out.println((9.0/ 5) * 35 + 32);
    }
}