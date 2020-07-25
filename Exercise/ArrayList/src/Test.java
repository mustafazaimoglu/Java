
import java.util.ArrayList;

public class Test
{
    public static void Yazdir (ArrayList<String> x)
    {
        for (int i = 0; i < x.size(); i++) // .size ArrayListlerde .lenght degil!!!
        {
            System.out.println(x.get(i)); // .get alma komutu
        }
        System.out.println();
    }
    
    public static void main(String[] args) 
    {
        ArrayList<String> mkz = new ArrayList(); //ArrayList<"Tür"> isim = new ArrayList();
                                                 //ArrayList<"Tür"> isim = new ArrayList<"Tür">();
        mkz.add("Mustafa"); // .add Ekleme Komutu
        mkz.add("Mehmet");
        mkz.add("Eyyub");
        mkz.add("Tunahan");
        mkz.add("Osman");
        
        Yazdir(mkz);
        
        /*
        for (int i = 0; i < mkz.size(); i++) // .size ArrayListlerde .lenght degil!!!
        {
            System.out.println(mkz.get(i));
        }
        */
       
        mkz.remove("Tunahan"); // .remove silme komutu index veya içerik girilebilir.
        mkz.remove(2);
        
        Yazdir(mkz);
        
        mkz.set(1, "Sahin"); // .set Update Komutu
        
        Yazdir(mkz);
        
        System.out.println(mkz.indexOf("Sahin")); //Soldan Baslayarak ilk index
        mkz.add("Sahin");
        mkz.add("Sahin");
        System.out.println(mkz.lastIndexOf("Sahin")); //Sağdan Baslayarak ilk index
        
        System.out.println();
        Yazdir(mkz);
        
        mkz.add(1, "Halil"); //Konum Yazarak Ekleme Kaydırma Yapıyor Veri Kaybuı Yok.
        mkz.add(4, "Veli");
        
        System.out.println();
        Yazdir(mkz);
        
        // mkz.clear(); Tüm Diziyi Siler
   
    }
    
}
