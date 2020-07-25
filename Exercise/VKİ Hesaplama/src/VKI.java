import java.util.Scanner;

public class VKI 
{
    public static void main (String[] Args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lutfen Kilonuzu Giriniz : ");
        int kilo = scanner.nextInt();
        
        System.out.print("Lutfen Boyunuzu Giriniz(Ornek : 1,72) : ");
        double boy =  scanner.nextDouble();
        
        double vki = kilo / (boy * boy);
        
        System.out.println ("Vucut Kitle Indeksiniz : " + vki);
        
    }
    
    
}
