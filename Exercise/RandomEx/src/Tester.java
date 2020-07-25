import java.util.Scanner;

public class Tester 
{
    public static void main (String[] Args)
    {
        Scanner scanner = new Scanner(System.in);
        Otomobil mkz = new Otomobil(35850, 50, 40);
        Kullanici mkz1 =  new Kullanici();
    
        mkz1.setSys_Kullanici("Mustafa KUZ");
        
        Login Giris1 = new Login();
        
        int denemeSayisi = 1;
        
        System.out.println("****Yol Bilgisayarina Hosgeldiniz****");
        
        while (true)
        {            
            if (Giris1.GirisYap(mkz1))
            {
                
                break;
            }
            else
            {
                System.out.println("Girilen Kullanici Adi Yanlis");
                System.out.println("Lutfen Tekrar Deneyiniz!");
            }
            
            if (denemeSayisi == 3)
            {
                System.out.println("Deneme Hakki Bitti!\n"
                        + "Programdan Cikiliyor...");
                return;
            }
            
           denemeSayisi++; 
        }
        
        System.out.print("Lutfen Yol Bilgisayarina Kac KM Yol Gideceginizi Giriniz : ");
        int km = scanner.nextInt();
        
        if ((double)mkz.getYakit()/km < 0.05)
        {
            System.out.println("Yeterli Yakıt Yok!");
        }
        else
        {
            mkz.setYakit(mkz.getYakit()-(km*0.05));
            System.out.println("Yolculuktan Sonra Kalan Yakıt : " + mkz.getYakit() + " Lt");
        }
        
        for (int i = 0; i < km; i++)
        {
            mkz.setSicaklik(mkz.getSicaklik() + 0.03);
        }
        
        System.out.println("Yolculuktan Sonra Ulaşılacak Olan Motor Sicakliği : " + mkz.getSicaklik() + " °C");
    
        System.out.println("Arac Kilometre Sayaci : " + (mkz.getAracKm() + km));
    }
    
}
