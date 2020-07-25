import java.util.Scanner;

public class VKI 
{
    public static void main (String[] Args)
    {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Lutfen Kilonuzu Giriniz : ");
        int kilo = scanner.nextInt();
        
        System.out.print("Lufen Boyunuzu Giriniz (Ornek : 1,72) : ");
        double boy = scanner.nextDouble();
        
        double vki = kilo / (boy * boy);
        System.out.println("Vucut Kitle İndeksiniz : " + vki);
        
        if (vki <= 18.5)
        {
            System.out.println("Zayıf!");
        }
        else if (vki <= 25)
        {
            System.out.println("Normal!");
        }
        else if (vki <= 30)
        {
            System.out.println("Kilolu!");
        }
        else if (vki <= 35)
        {
            System.out.println("1.Derece Obez!");
        }
        else
        {
            System.out.println("2.Derece Obez!");
        }
        
    }
}
