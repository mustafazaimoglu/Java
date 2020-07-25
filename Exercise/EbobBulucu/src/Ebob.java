import java.util.Scanner;

public class Ebob 
{
    public static void EbobBulucu(int x, int y)
    {
        for (int i = x; i > 0; i--)
        {
            if (x % i == 0 && y % i == 0)
            {
                System.out.println("Girilen Sayilarin EBOB'u = " + i);
                break;
            }               
        }       
    }
    public static void main (String Args[])
    {
        Scanner scanner = new Scanner(System.in);
                
        System.out.print("Lutfen Bir Sayi Giriniz : ");
        int a = scanner.nextInt();
        
        System.out.print("Lutfen Bir Sayi Daha Giriniz :");
        int b = scanner.nextInt();
        
        if (a > b)
        {
            EbobBulucu(b,a);
        }
        else
        {
            EbobBulucu(a,b);
        }        
    }  
}
