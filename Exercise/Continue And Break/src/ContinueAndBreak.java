import java.util.Scanner;

public class ContinueAndBreak 
{
    public static void main (String[] Args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int i,k,j;
        
        System.out.println("LUTFEN 20'DEN BUYUK BIR SAYI GIRINIZ! : ");
        k = scanner.nextInt();
        
        for (i = 0; i < 50; i++)
        {
            if (i == k)
            {
                System.out.println("Dongu Bitiriliyor...");  
                break; //Burda Alt Satırlara Bakmaksızın iptal Oluyor...             
            }
            
            System.out.println("I = " + i);
        }
        System.out.println("");
        
        int p;
        
        while (true)
        {
            System.out.print("Lutfen Bir Sayi Giriniz :");
            p = scanner.nextInt();
            
            if (p == 8)
            {
                System.out.println("Dongu Bitiriliyor...");  
                break;
            }
            
            System.out.println("Girilen Sayi = " + p + "\nDurdurmak için 8'e Basınız!");
        }
        System.out.println("");
        
        for (j = 1; j <= 10; j++)
        {
            if (j == 3 || j == 5 || j == 7)
            {
                continue; // if dogrulandiginda continue direkt basa dödürüyor! if durumlarını atliyor...
            }
            
            System.out.println("J = " + j);
        }
        System.out.println("");
        
        int t = 0;
        
        while (t < 10)
        {
            if (t == 3 || t == 5)
            {
                t++; // Bu Sonsuz Döngüden Kurtarıyor!!! burda artmazsa 3'e takili kalir...
                continue;
            }
            
            System.out.println("T = " + t);
            t++;           
        }
        
        
    }
    
}
