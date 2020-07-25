
import java.util.Scanner;

public class Tester
{
    public static boolean Asalmi(int Sayi)
    {
        for (int i = 2; i < Sayi; i++)
        {
            if (Sayi % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static int TersBul(int Sayi)
    {
        int p;
        String ters = "";
        while (Sayi > 0)
        {
            p = Sayi % 10;
            Sayi = (Sayi - p) / 10;
            ters += p;
            
        }
        return Integer.valueOf(ters);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lutfen Bir Sayi Giriniz : ");
        int Sayi = scanner.nextInt();
        
        for (int i = 10; i < Sayi; i++)
        {
            boolean Asal = Asalmi(i);
            
            if (Asal == true)
            {
                int Ters = TersBul(i);
                boolean TersAsal = Asalmi(Ters);
                if (TersAsal == true)
                {
                    System.out.println(i + " - " + Ters + " Aynali Asaldir!!!");
                }
            }
        }
    }  
}
