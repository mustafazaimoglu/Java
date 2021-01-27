
import java.util.HashMap;
import java.util.Map;


public class Main
{
    public static void main(String[] args)
    {
        /*
        HashMap Sınıfı

        1. Değerleri Key(Anahtar) ve Value(Değer) olarak depolar. Her key'e karşılık
        gelen bir tane değer bulunur.
        2. Bir anahtar sadece bir kez varolabilir. Ancak bir değer birden fazla olabilir.
        3. Elementleri tıpkı HashSet gibi ekleme sırasına göre depolamaz. (HashSet gibi)
        */
        
        HashMap<Integer,String> hashMap = new HashMap<>();
        
        hashMap.put(10, "Java");
        hashMap.put(30, "C++");
        hashMap.put(50, "Python");
        hashMap.put(70, "Kotlin");
        hashMap.put(70, "Kotlin"); // İki Kere değer Kabul etmez
        hashMap.put(30, "Go"); // 30 Artık "Go"
        
        System.out.println(hashMap);
        
        System.out.println(hashMap.get(10));
        System.out.println(hashMap.get(30));
        System.out.println(hashMap.get(100)); // Hata Vermez Null
    
        
        for (Map.Entry<Integer,String> hm : hashMap.entrySet())
        {
            System.out.println("Anahtar : " + hm.getKey() + " ---> Değer : " + hm.getValue());
        }
    }
}
