public class Strings 
{
    public static void main(String[]args)
    {
        int myInt = 927;
        String text = "Hello"; 

        String blank = " ";

        String name = "Bob";

        String greeting = text + blank + name;

        System.out.println("Hello" + " " + "Bob");
        System.out.println(greeting +  myInt);
    }
}