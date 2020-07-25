
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main
{
    public static void main(String[] args)
    {
        /*
        SONA DEĞER EKLEMEDE ARRAYLIST HIZLI FAKAT ORTALARA BASA VS DEGER EKLENIRSE
        ARAYLIST TUM LISTEYI KAYDIRMAK ZORUNDA KALDIGI IÇIN YAVAS ÇAILISIYOR.
        */
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        
        zamanBul("ArrayList",arrayList);
        zamanBul("linkedList",linkedList);
        
    }
    
    public static void zamanBul(String type,List<Integer> list) 
    {
        long basla,bitis;
        
        basla = System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++)
        {
            list.add(0,i); // 0. indexe yazdırmak için
        }
        
        bitis = System.currentTimeMillis();
        
        System.out.println(type + " : " + (bitis-basla) + " ms");
    }
    
}
