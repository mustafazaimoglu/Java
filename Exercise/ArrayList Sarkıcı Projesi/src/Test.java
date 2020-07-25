
import java.util.Scanner;

public class Test
{
    private static Sarkicilar sarkici = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void IslemleriGoruntule()
    {
        System.out.println("0 - İslemleri Goruntule\n"
                + "1 - Sarkicilari Goruntule\n"
                + "2 - Sarkici Ekle\n"
                + "3 - Sarkici Guncelle\n"
                + "4 - Sarkici Sil\n"
                + "5 - Sarkici Ara\n"
                + "6 - Uygulamadan Cik");
    }
    
    public static void SarkiciGoruntule()
    {
        sarkici.SarkicilariBastir();
    }
    
    public static void SarkiciEkle()
    {
        System.out.print("Lutfen Eklemek Istediginiz Ismi Giriniz : ");
        String isim = scanner.nextLine();
        
        sarkici.SarkiciEkle(isim);
    }
    
    public static void SarkiciGuncelle()
    {
        System.out.print("Guncellemek Istediginiz Sarkicinin Sirasi (1,2,3,...) : ");
        int sira = scanner.nextInt();
        scanner.nextLine(); //Dummy
        
        System.out.print("Lutfen Sarkicinin ismini giriniz : ");
        String isim = scanner.nextLine();
        
        sarkici.SarkiciGuncelle(sira - 1, isim);
    }
    
    public static void SarkiciSil()
    {
        System.out.print("Silmek Istediginiz Sarkicinin Sirasi (1,2,3,...) : ");
        int sira = scanner.nextInt();
        
        sarkici.SarkiciSil(sira-1);
    }
    
    public static void SarkiciAra()
    {
        System.out.print("Aramak istediginiz sarkicinin adini giriniz : ");
        String isim = scanner.nextLine();
        
        sarkici.SarkiciAra(isim);
    }
    
    public static void main(String[] args)
    {
        System.out.println("Sarkici Uygulamasina Hos Geldiniz...");
        
        IslemleriGoruntule();
        
        boolean calis = true;
        
        int islem;
        
        while (calis)
        {
            System.out.print("Lutfen Bir İslem Seciniz : ");
            islem = scanner.nextInt();
            scanner.nextLine(); //Dummy
            
            switch (islem)
            {
                case 0:
                    IslemleriGoruntule();
                    break;
                case 1:
                    SarkiciGoruntule();
                    break;
                case 2:
                    SarkiciEkle();
                    break;
                case 3:
                    SarkiciGuncelle();
                    break;
                case 4:
                    SarkiciSil();
                    break;
                case 5:
                    SarkiciAra();
                    break;
                case 6:
                    calis = false;
                    System.out.println("Uygulamadan Cikiliyor!");
                    break;
                default :
                    System.out.println("Hatali Bir Tuslama Yaptiniz...");              
            }
        }
   
    }
    
}
