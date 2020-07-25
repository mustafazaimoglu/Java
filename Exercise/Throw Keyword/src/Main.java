
import java.util.Scanner;


public class Main
{
    // Throw Keywordu ile kendimiz exception fırlatabiliriz!!!
    // Fakat yakalamazsak program yarida kesilir!!!
    public static void mekanKontrol(int yas)
    {
        if (yas < 18)
        {
            throw new ArithmeticException();
        }
        else
        {
            System.out.println("Mekana Hosgeldiniz...");
        }
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lutfen Yasınızı giriniz : ");
        int yas = scanner.nextInt();
        
        try
        {
            mekanKontrol(yas);
        }
        catch(ArithmeticException e)
        {
            System.out.println("18 Yasindan Kucukler Mekana Giremez!!!");
        }
        
        System.out.println("This thing is still working!!!");
    }
    
}
