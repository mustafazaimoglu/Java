import java.util.Scanner;

public class Armstrong 
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Armstrong Sayiligini Kontrol Etmek İstediginiz Sayiyi Girin : ");
        int Sayi = scanner.nextInt();
        int p,top = 0,Sayi1 = Sayi;
        
        while (Sayi > 0)
        {
            p = Sayi % 10;
            Sayi = (Sayi - p) / 10;
            top = top + p * p * p;
        }
        
        System.out.println("");
        if (Sayi1 == top)
        {
            System.out.println(Sayi1 + " Sayisi Armstrong Bir Sayidir!");
        }
        else
        {
            System.out.println(Sayi1 + " Sayisi Armstrong Bir Sayi Degildir!");
        } 
    }  
}
