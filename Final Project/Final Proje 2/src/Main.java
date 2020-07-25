
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Asker> askerler = new ArrayList<>();
        
    public static void askerEkle()
    {
        System.out.print("Asker Adi : ");
        String isim = scanner.nextLine();
                    
        System.out.print("Asker Rutbesi : ");
        String rutbe = scanner.nextLine();
        
        System.out.print("Tabanca ismi : ");
        String tabancaIsmi = scanner.nextLine();
        
        System.out.print("Tabanca Etkili Menzil : ");
        int tabancaMenzil = scanner.nextInt();
        
        System.out.print("Tabanca Yedek Sarjör Sayisi : ");
        int tabancaYedekSarjorSayisi = scanner.nextInt();
        scanner.nextLine(); // dummy
        
        System.out.print("Otomatik Silah ismi : ");
        String otoIsmi = scanner.nextLine();
        
        System.out.print("Otomatik Silah Etkili Menzil : ");
        int otoEtkiliMenzil = scanner.nextInt();
        
        System.out.print("Otomatik Silah Sarjör Sayisi : ");
        int otoSarjorSayisi = scanner.nextInt();
        scanner.nextLine(); // dummy
        
        askerler.add(new Asker(isim, rutbe, tabancaIsmi, tabancaMenzil, tabancaYedekSarjorSayisi, otoIsmi, otoEtkiliMenzil, otoSarjorSayisi));
    }
    
    public static void askerListele()
    {
        System.out.println("\n********************************");
        System.out.println("Asker Listesi : ");
        for (Asker a : askerler)
        {
            System.out.println(a + "\n");
        }
        System.out.println("********************************\n");
    }
    
    public static int askerBul(String isim)
    {
        for (int i = 0; i < askerler.size(); i++)
        {
            if (askerler.get(i).getIsim().equalsIgnoreCase(isim))
            {
                return i;
            }
        }
        return -1;
    }
    
    public static void talimler(int index)
    {        
        String neYapalım = "1 - Tabanca ile Ates Et\n"
                + "2 - Otomatik Silah ile Tekli Ates Et\n"
                + "3 - Otomatik Silah ile Seri Ates Et\n"
                + "4 - Tabanca Sarjör Doldur\n"
                + "5 - Otomatik Silah Sarjör Doldur\n"
                + "q - Talimi Bitir";
        
        while (true)
        {
            System.out.println(neYapalım);
            
            System.out.print("Lutfen Bir Seçim Yapınız : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("1"))
            {
                System.out.print("Ates Edilecek Menzili Giriniz :");
                int menzil = scanner.nextInt();
                scanner.nextLine(); // dummy
                
                askerler.get(index).getTabanca().atesEt(menzil);
                
                while (true)
                {
                    System.out.print("Tekrar Ates Etmek için enter'e basın\n" //Enter Dısındada calısabilir daha seri olması için enter seçildi.
                        + "Geri Dönmek için q ya basın. --> ");
                    String s = scanner.nextLine();
                    
                    if (s.equals("q"))
                    {
                        break;
                    }
                    else
                    {
                        askerler.get(index).getTabanca().atesEt(menzil);
                    }
                }
            }
            else if (islem.equals("2"))
            {
                System.out.print("Ates Edilecek Menzili Giriniz :");
                int menzil = scanner.nextInt();
                scanner.nextLine(); // dummy
                
                askerler.get(index).getOtomatik().atesEt(menzil);
                
                while (true)
                {
                    System.out.print("Tekrar Ates Etmek için enter'e basın\n" //Enter Dısındada calısabilir daha seri olması için enter seçildi.
                        + "Geri Dönmek için q ya basın. --> ");
                    String s = scanner.nextLine();
                    
                    if (s.equals("q"))
                    {
                        break;
                    }
                    else
                    {
                        askerler.get(index).getOtomatik().atesEt(menzil);
                    }
                }
            }
            else if (islem.equals("3"))
            {
                System.out.print("Ates Edilecek Menzili Giriniz :");
                int menzil = scanner.nextInt();
                scanner.nextLine(); // dummy
                
                askerler.get(index).getOtomatik().seriAtesEt(menzil);
                
                while (true)
                {
                    System.out.print("Tekrar Ates Etmek için enter'e basın\n" //Enter Dısındada calısabilir daha seri olması için enter seçildi.
                        + "Geri Dönmek için q ya basın. --> ");
                    String s = scanner.nextLine();
                    
                    if (s.equals("q"))
                    {
                        break;
                    }
                    else
                    {
                        askerler.get(index).getOtomatik().seriAtesEt(menzil);
                    }
                }
            }
            else if (islem.equals("4"))
            {
                askerler.get(index).getTabanca().doldur();
            }
            else if (islem.equals("5"))
            {
                askerler.get(index).getOtomatik().doldur();
            }
            else if (islem.equals("q"))
            {
                System.out.println("Talim bitti!");
                return;
            }
            else
            {
                System.out.println("Hatalı Bir Tuslama Yaptınız!");
            }
        }
    }
    
    public static void talimYap()
    {
        if (askerler.isEmpty())
        {
            System.out.println("Su Anda Hic Asker Yok!!!");
            return;
        }
        
        System.out.print("Talim Yapmak İstenilen Askerin Adını Giriniz : ");
        String askerIsmi = scanner.nextLine();
        
        int askerIndexi = askerBul(askerIsmi);
        
        if (askerIndexi == -1)
        {
            System.out.println("Aranan Asker Bulunamadı!!");                
        }
        else
        {
            talimler(askerIndexi);
        }
    }
            
    public static void main(String[] args)
    {         
        askerler.add(new Asker("Salih", "Maresal", "Desert Eagle", 150, 2, "AK - 47", 450, 3)); //Başlangıcta bir adet asker olsun diye

        
        String islemler = "1 - Asker Ekle\n"
                            + "2 - Talim Yap\n"
                            + "3 - Tüm Askerleri Listele\n"
                            + "4 - Toplam Asker Sayısını Göster\n"
                            + "q - Cıkıs Yap";

        while (true)
        {
            System.out.println(islemler);
            
            System.out.print("Lutfen Yapılacak İslemin Kodunu Girin : ");
            String islem = scanner.nextLine();
            
            switch (islem)
            {
                case "1":
                    askerEkle();
                    System.out.println("Asker Basari ile Eklendi!");
                    break;
                case "2": 
                    talimYap();
                    break;
                case "3": 
                    askerListele();
                    break;
                case "4": 
                    System.out.println("Toplam Asker Sayısı : " + askerler.size());
                    break;
                case "q":  
                    System.out.println("Programdan Cıkılıyor...");
                    return;
                default:
                    System.out.println("Hatalı Bir Tuslama Yaptınız!");
                    break;
            }
                
        }
        
    }
    
}
