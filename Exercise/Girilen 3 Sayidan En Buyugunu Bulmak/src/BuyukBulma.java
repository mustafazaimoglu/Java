import java.util.Scanner;

public class BuyukBulma 
{
    public static void main (String[] Args)
    {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Lutfen Bir Sayi Giriniz : ");
        int a = scanner.nextInt();
        System.out.print("Lutfen Bir Sayi Daha Giriniz : ");
        int b = scanner.nextInt();
        System.out.print("Lutfen Bir Sayi Daha Giriniz : ");
        int c = scanner.nextInt();
        int max = a;
        
        if (a >= b && a >= c)
        {
            max = a;            
        }
        else if (b >= a && b >= c)
        {
            max = b;
        }
        else if (c >= a && c >= b)
        {
            max = c;
        }
        
        System.out.println("En Buyuk Deger = " + max);       
    }
}
