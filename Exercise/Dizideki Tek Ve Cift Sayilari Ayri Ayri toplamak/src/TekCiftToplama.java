// Coded By MKZ
import java.util.Scanner;

public class TekCiftToplama 
{
    public static void main (String... Args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kaç Tane Deger Gireceginizi Giriniz : ");
        int DiziElemanSayisi = scanner.nextInt();
        int i;
        int Arr[] = new int[DiziElemanSayisi];
        
        for (i = 0; i < DiziElemanSayisi; i++)
        {
            System.out.print("Dizinin " + (i + 1) + ".Elemanini Giriniz : ");
            Arr[i] = scanner.nextInt();
        }
        
        System.out.println();
        for (i = 0; i < DiziElemanSayisi; i++)
        {
            System.out.println("Dizinin " + (i + 1) + ".Elemani : " + Arr[i]);
        }
        
        int min = Arr[0],TekSayiTop = 0;
        int max = Arr[0],CiftSayiTop = 0;
        
        for (i = 0; i < DiziElemanSayisi; i++)
        {
            if (Arr[i] < min)
            {
                min = Arr[i];
            }
            
            if (Arr[i] > max)
            {
                max = Arr[i];
            }
            
            if (Arr[i] % 2 == 0)
            {
                CiftSayiTop += Arr[i];               
            }
            else
            {
                TekSayiTop += Arr[i];
            }
        }
        
        System.out.println("\nEn Buyuk Sayi : " + max);
        System.out.println("En Kucuk Sayi : " + min);
        System.out.println("Cift Sayilar Toplami : " + CiftSayiTop);
        System.out.println("Tek Sayilar Toplami : " + TekSayiTop);
        
        
    }
    
}
