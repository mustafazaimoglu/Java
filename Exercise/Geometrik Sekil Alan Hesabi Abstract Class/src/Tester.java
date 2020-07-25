
import java.util.Scanner;


public class Tester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "İşlemler : \n"
                          +"1. Kare Alan Hesapla\n"
                          +"2. Üçgen Alan Hesapla\n"
                          +"3. Daire Alan Hesapla\n"
                          +"q : Çıkış...";
        
        while (true)
        {
            System.out.println(islemler);
            System.out.print("Hangi Seklin Alanını Hesaplamak İstiyorsunuz : ");
            String islem = scanner.nextLine();
            
            Sekil sekil = null;
            
            if (islem.equals("q"))
            {
                System.out.println("Programdan Cıkılıyor...");
                break;
            }
            else if (islem.equals("1"))
            {
                System.out.print("Karenin Kenari : ");
                int kenar = scanner.nextInt();
                scanner.nextLine(); //Dummy
                
                sekil = new Kare(kenar, "Kare");
                
                sekil.alanHesapla();
            }
            else if (islem.equals("2"))
            {
                System.out.print("Ucgenin Kenarlarını Giriniz!\n"
                        + "Kenar 1 : ");
                int kenar1 = scanner.nextInt();
                System.out.print("Kenar 2 : ");
                int kenar2 = scanner.nextInt();
                System.out.print("Kenar 3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine(); //Dummy
                
                sekil = new Ucgen(kenar1, kenar2, kenar3, "Ucgen");
                
                sekil.alanHesapla();
            }
            else if (islem.equals("3"))
            {
                System.out.print("Dairenin Yaricapi : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine(); // Dummy
                
                sekil = new Daire(yaricap, "Daire");
                
                sekil.alanHesapla();
            }
            else
            {
                System.out.println("Gecersiz İslem...");
            }
        }
        
    }
    
}
