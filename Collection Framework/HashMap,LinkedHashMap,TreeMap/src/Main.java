
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Main
{
    public static void main(String[] args)
    {
        Map<Integer,String> hashMap = new HashMap<>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer,String> treeMap = new TreeMap<>();
        
        System.out.println("***************************");
        mapDoldur(hashMap); // Rastgele Sıralanır
        System.out.println("***************************");
        mapDoldur(linkedHashMap); //Ekleme Sırasına Göre Calışır
        System.out.println("***************************");
        mapDoldur(treeMap); // Key değerine göre sıralanır
        System.out.println("***************************");
    }
    
    public static void mapDoldur(Map<Integer,String> map)
    {
        map.put(15, "Java");
        map.put(1, "Delphi");
        map.put(13, "Dart");
        map.put(25, "Go");
        map.put(100, "Dart");
        
//        for (Map.Entry<Integer,String> entry : map.entrySet())
//        {
//            System.out.println("Key : " + entry.getKey() + "  Value : " + entry.getValue());
//        }
        
//        System.out.println(map.keySet());
//        
//        for (Integer key : map.keySet()) //Güzel Bir Yazdırma Yöntemi
//        {
//            System.out.println("Key : " + key + "  Value : " + map.get(key));
//        }

        Collection<String> values = map.values();

        for (String s : values)
        {
            System.out.println("Değer : " + s);
        }




    }
}
