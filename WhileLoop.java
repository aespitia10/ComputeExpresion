public class WhileLoop
{
    public static void main(String[]args)
    {
        boolean loop = true; 
        boolean loop2 = 4 < 5; 
        boolean loop3 = 4 > 5;
        int value = 5;
        int value2 = 9;
        boolean loop4 = value > value2; 

        while(value < value2)
        {
            System.out.println(true);
            value++ ;
        }
            System.out.println(false);
        System.out.println(loop);
        System.out.println(loop2);
        System.out.println(loop3);
        System.out.println(loop4);



    }
}