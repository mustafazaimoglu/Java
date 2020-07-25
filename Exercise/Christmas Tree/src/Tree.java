//Coded By MKZ
public class Tree 
{
    public static void main (String[] Args)
    {
        int t = 7;
        int i,j;

        for (i = 0; i < 7; i++)
        {
            for (j = i; j < 7-1; j++)
            {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        System.out.println("   |   |");
        System.out.println("   |   |");
    }
    
}
