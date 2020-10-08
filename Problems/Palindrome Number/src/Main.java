
import java.util.Scanner;


public class Main
{
    public static boolean isPalindrome(int x)
    {
        int y = x,z = 0,p;
        if (x < 0)
        {
            return false;
        }
        else
        {
            if(x == 0)
            {
                return true;
            }
            else
            {
                while(y > 0)
                {
                    p = y % 10;
                    y = (y - p) / 10;
                    z = z * 10 + p;
                }
            }
        }
        
        System.out.println(z);
        return x == z;
        
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Lutfen Bir Sayı Giriniz : ");
        int number = sc.nextInt();
        
        System.out.println(isPalindrome(number));
    }
}
