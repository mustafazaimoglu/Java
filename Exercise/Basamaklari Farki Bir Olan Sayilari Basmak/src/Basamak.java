//Coded By MKZ
import java.util.Scanner;

public class Basamak 
{
    public static boolean FarkBul(int x)
    {
        int p,k = 0,c = 0;
        
        while (x > 0)
        {
            c++;
            p = x % 10;
            x = (x-p)/10;
            
            if (c > 1)
            {
              if ((k - p) != 1 && (p - k) != 1) 
              {
                  return false;                 
              }
            }
            k = p;
        }
        return true;
    }
    
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Type Any Number : ");
        int Number = scanner.nextInt();
        int c = 0;
        boolean mkz;
        
        for (int i = 0; i < Number; i++)
        {           
            mkz = FarkBul(i);
            
            if (mkz == true)
            {
                System.out.print(i + "   ");
                c++;
                if (c % 10 == 0)
                {
                    System.out.println();
                }
            }
        }
    }
}
