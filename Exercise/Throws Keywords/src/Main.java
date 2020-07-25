
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    // Throws Kelimesi Method veya classin yanına gelir.
    // Cunku eger throw ile bir adet checked exception fırlatırsak java bunu anlar ve karşı cıkmaya calısır.
    // Biz de class veya sınıf onune getirerek Bu elemanların fırlatabilecegini söyleriz!!!
    
    public static void mekanKontrol(int yas) throws IOException
    {
        if (yas < 18)
        {
            throw new IOException();
        }
        else
        {
            System.out.println("Mekana Hoşgeldiniz...");
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lutfen Yasınızı Giriniz : ");
        int yas = scanner.nextInt();
        
        try
        {
            mekanKontrol(yas);
        } 
        catch (IOException e)
        {
            System.out.println("IOException Olustu!!!");
        }
        
        System.out.println("This fucking thing is still working!!!");
    }
    
}
