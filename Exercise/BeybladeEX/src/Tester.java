import java.util.Scanner;

public class Tester 
{
    public static void main(String[] Args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Beyblade Programina Hoşgeldiniz...");
        System.out.println("Cıkıs için q'ya basınız...");
        
        while (true)
        {
            System.out.println();
            System.out.print("Hangi Bayblade'i Üretmek İstiyorsunuz : ");
            String Islem = scanner.nextLine();
            
            if (Islem.equals("q"))
            {
                System.out.println("Programdan Cıkılıyor...");
                break;
            }
            else
            {
                BeybladeFabrikasi uret = new BeybladeFabrikasi();
                
                Beyblade mkz = uret.BeybladeÜret(Islem);
                
                if (mkz == null)
                {
                    System.out.println("Lutfen Gecerli Bir Tür Giriniz...");
                    
                }
                else
                {
                    mkz.Informations();
                    mkz.KutsalCanavarOrtayaCikar();
                }
            }
        }
    }
    
}
