
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Tester
{
    public static Scanner sc = new Scanner(System.in);
    
    public static void SehirGez(LinkedList<String> x)
    {
        ListIterator<String> iterator = x.listIterator();
        
        String islemler = ("0 - İslemleri Goruntule!\n"
                + "1 - Bir Sonraki Sehre Git\n"
                + "2 - Bir Onceki Sehre Git\n"
                + "3 - Programdan Cıkıs Yap!");
        
        boolean ileri = false;
        boolean geri = false;
        
        System.out.println(islemler);
        while (true)
        {            
            System.out.print("Lutfen Bir Sayı Giriniz : ");
            int islem = sc.nextInt();
            
            switch (islem)
            {
                case 0:
                    System.out.println(islemler);
                    break;
                    
                case 1:
                    ileri = true;
                    if (geri == true)
                    {
                        if (iterator.hasNext())
                        {
                            iterator.next();
                        }
                        geri = false;
                    }

                    if (iterator.hasNext())
                    {
                        System.out.println("Gidilen Sehir : " + iterator.next());                      
                    }
                    else
                    {
                        System.out.println("Gidilecek Sehir Kalmadi!!!");
                    }
                    break;
                        
                    
                case 2:
                    geri = true;
                    if (ileri == true)
                    {
                        if (iterator.hasPrevious())
                        {
                            iterator.previous();
                        }
                        ileri = false;
                    }
                
                    if (iterator.hasPrevious())
                    {
                        System.out.println("Gidilen Sehir : " + iterator.previous());
                    }
                    else
                    {
                        System.out.println("Seyehat Daha Yeni Basladi!");
                    } 
                    break;
                    
                case 3:
                    System.out.println("Programdan Cıkılıyor...");
                    return;
                    
                default : 
                    System.out.println("Hatali Bir Giris Yaptınız...");
                    break;                  
            }
        }
        
    }
    
    public static void main(String[] args) 
    {
        LinkedList<String> Sehirler = new LinkedList<>();
        
        Sehirler.add("Malatya");
        Sehirler.add("Mersin");
        Sehirler.add("İstanbul");
        Sehirler.add("Antalya");
        
        SehirGez(Sehirler);
          
    }
    
}
