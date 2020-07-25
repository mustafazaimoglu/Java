import java.util.Scanner;

public class Digits 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Lutfen Bir Sayi Giriniz : ");
        int sayi = scanner.nextInt();
        
        int p,top = 0;
        while (sayi > 0)
        {
            p = sayi % 10;
            sayi = (sayi - p) / 10;
            top = top + p;
        }
        
        System.out.println("Girilen Sayinin Basamaklari Toplami = " + top);
    }
}
