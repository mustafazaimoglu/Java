
import java.util.LinkedList;
import java.util.ListIterator;


public class Tester
{
    public static void Yazdir(LinkedList<String> x)
    {
        /*
        for (String s : x)
        {
            System.out.println(s);
        }
        */
        
        ListIterator<String> iterate = x.listIterator();
        
        while (iterate.hasNext())
        {
            System.out.println(iterate.next());
        }
        
    }
    
    public static void SiraliEkle(LinkedList<String> x, String yeni)
    {
        ListIterator<String> iterate = x.listIterator();
        
        while (iterate.hasNext())
        {
            int karsilastir = iterate.next().compareTo(yeni); //Yeni Deger Buyukse Pozitif 
                                                              //Kucukse Negatif 
                                                              //Aynı ise Sıfır olusur
            
            if (karsilastir == 0)
            {
                System.out.println("Girilen Deger Zaten Listede Var!!!");
                return;
            }
            else if (karsilastir > 0)
            {
                //Yeni Deger İterate.next den Daha Kucuk!!!!!
                iterate.previous();
                iterate.add(yeni);
                return;
            }
        }
        iterate.add(yeni);
    }
    
    public static void main(String[] args)
    {
        LinkedList<String> mkz = new LinkedList<>();
        
        mkz.add("Ev");
        mkz.add("Hastane");
        mkz.add("Okul");
        mkz.add("Eczane");
        mkz.add("Universite");
        
        Yazdir(mkz);
        System.out.println("-------------------------------------------");
        
        mkz.add(1, "Market");
        mkz.remove("Eczane");
        mkz.remove(2);
        
        Yazdir(mkz);
        mkz.clear();
        System.out.println("-------------------------------------------");        
        
        SiraliEkle(mkz, "Ev");
        SiraliEkle(mkz, "Market");
        SiraliEkle(mkz, "Eczane");
        SiraliEkle(mkz, "Sinema");
        SiraliEkle(mkz, "AVM");
        
        Yazdir(mkz);
    }
    
}
