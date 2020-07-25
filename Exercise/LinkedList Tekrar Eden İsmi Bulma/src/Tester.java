
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Tester
{
    static Scanner scanner = new Scanner(System.in);
    
    public static void Yazdir(LinkedList<String> x)
    {
        System.out.println("\nListede Bulunan İsimler : ");
        int c = 0;
        ListIterator<String> iterator = x.listIterator();
        
        while (iterator.hasNext())
        {
            c++;
            System.out.println(c + ". " + iterator.next());
        }
        System.out.println();
        
    }
    
    public static void EnCokTekrarEdenIsim(LinkedList<String> x)
    {        
        int MaxSayi = 0,i,j;
        ArrayList<String> Isim = new ArrayList<>();
        ArrayList<Integer> Sayi = new ArrayList<>();
        
        for (i = 0; i < x.size(); i++)
        {
            int Temp = 0;
            for (j = 0; j < x.size(); j++)
            {
                if (x.get(i).equals(x.get(j)))
                {
                    Temp++;
                }
            }
            
            if (Temp >= MaxSayi)
            {
                MaxSayi = Temp;
                Isim.add(x.get(i));
                Sayi.add(MaxSayi);
            }
        }
        
        for (i = 0; i < Isim.size(); i++)
        {
            if (Sayi.get(i).equals(MaxSayi))
            {
                for (j = 0; j < Isim.size(); j++)
                {
                    if (Isim.get(i).equals(Isim.get(j)))
                    {
                        Isim.remove(j);
                        Sayi.remove(j);
                    }
                }
            }      
        }
        
        for (i = 0; i < Isim.size(); i++)
        {
            if (Sayi.get(i).equals(MaxSayi))
            {
                System.out.println(Isim.get(i) + " İsmi " + MaxSayi + " Kere Tekrar etti");
            }      
        }
    }
    
    public static void main (String Args[])
    {
        LinkedList<String> Isimler = new LinkedList<>();
        
        String islemler1 = ("Eklemek Istediginiz Ismi Giriniz...\n"
                + "Cikis Yapmak İcin \"q\" ya Basiniz...");
        
        System.out.println(islemler1);
        while (true)
        {
            System.out.print("Lutfen Bir İsim Giriniz : ");
            String islem1 = scanner.nextLine();
            if (islem1.equals("q"))
            {
                break;
            }
            else
            {
                Isimler.add(islem1);
            }
        }
        
        Yazdir(Isimler);
        
        EnCokTekrarEdenIsim(Isimler);
        
        
    }
    
}
