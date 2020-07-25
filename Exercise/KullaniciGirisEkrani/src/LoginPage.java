//By MKZ
import java.util.Scanner;

public class LoginPage 
{
    public static void main (String... args)
    {
        Scanner scanner = new Scanner (System.in);
        
        String sys_kullaniciadi = "Mustafa KUZ";
        String sys_parola = "123mkz";
        
        int GirisHakki = 3;
        
        System.out.println("************************************");
        System.out.println("Kullanici Girisine Hos Geldiniz");
        System.out.println("************************************");
        
        while (GirisHakki > 0)
        {
            if (GirisHakki == 1 || GirisHakki == 3)
            {
                if (GirisHakki == 1)
                {
                    System.out.println("Kalan Giris Hakkiniz = " + GirisHakki
                        + "\nSon Giris Hakkinizi Kullaniyorsunuz!");
                }
                else
                {
                    System.out.println("Giris Hakkiniz = " + GirisHakki);
                }
            }
            else
            {
                System.out.println("Kalan Giris Hakkiniz = " + GirisHakki);
            }
            
            System.out.print("\nKullanici Adinizi Giriniz : ");
            String kullaniciadi = scanner.nextLine();
            System.out.print("Parolanizi Giriniz : ");
            String parola = scanner.nextLine();
            
            if (parola.equals(sys_parola) && kullaniciadi.equals(sys_kullaniciadi))
            {
                System.out.println("\nHosgeldiniz " + kullaniciadi);
                break;
            }            
            else if (parola.equals(sys_parola) && !kullaniciadi.equals(sys_kullaniciadi))
            {
                System.out.println("\nGirilen Kullanici Adi Yanlis!" + 
                        "\nLutfen Tekrar Deneyiniz");  
                GirisHakki--;
            }
            else if (!parola.equals(sys_parola) && kullaniciadi.equals(sys_kullaniciadi))
            {
                System.out.println("\nGirilen Parola Yanlis!" + 
                        "\nLutfen Tekrar Deneyiniz");  
                GirisHakki--;
            }
            else if (!parola.equals(sys_parola) && !kullaniciadi.equals(sys_kullaniciadi))
            {
                System.out.println("\nGirilen Parola ve Kullanici Adi Yanlis!" + 
                        "\nLutfen Tekrar Deneyiniz");  
                GirisHakki--;
            }
            
            if (GirisHakki == 0)
            {
                System.out.println("Giris Hakkiniz Bittigi için Daha Sonra" +
                        " Tekrar Deneyiniz !");
            }
            
        }
                
    }
    
}
