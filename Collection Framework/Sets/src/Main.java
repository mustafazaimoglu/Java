// Sets - Kumeler - Her Elemandan Bir Tane Var
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Main
{

    public static void main(String[] args)
    {
    /*
    Set Interface ----> HashSet,LinkedHashSet, TreeSet

    Set Interface ile List Interface’in farkı
    List interface’i implemente eden classlar bir elementten birden fazla depolayabilirken,  
    Set interface’i implemente eden classlar bir elementten sadece bir tane depolarlar.

    HashSet Sınıfı

    HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable

    1.HashSet elementleri "hashing" yani hash table  mekanizmasına uygun bir biçimde depolarlar
    (Her element belli bir key'e göre depolanır.)

    2.HashSet bir element'i sadece bir defa depolar.(Set Interface)

    3. Elementlerin ekleme sırasına göre depolamaz.

    LinkedHashSet Sınıfı

    LinkedHashSet extends HashSet extends AbstractSet implements Set Interface extends Collection extends Iterable

    1. LinkedHashSet hem HashTable hem de Set Interface'in LinkedList implementasyonu gibi davranır.

    2. HashSette olduğu gibi bir elementi sadece bir defa depolar.(Set Interface)

    3. Elementleri ekleme sırasına göre depolar.


    TreeSet Sınıfı

    TreeSet sınıfı NavigableSet inteface'ini implemente eder ve AbstractSet sınıfından miras alır. 
    NavigableSet interface'i de SortedSet interfaceinden miras alır. 

    1. Elementleri depolamak için Tree yani Ağaç yapısını kullanır.

    2. Elementleri alfabetik olarak sıralarlar.



    HashSet vs LinkedHashSet vs TreeSet

    HashSet, Hash Table mekanizmasını uyguladığı için elementler sıralı değildir. Ekleme,Çıkarma ve
    Arama metodları sabit zamanda( Time Complexity : O(1) ) çalışır. 

    TreeSet, elementleri tree yapısına yani ağaç yapısına uygun depolar. Ekleme,Çıkarma ve 
    Arama metodları O(log(n)) complexitysi ile çalışır.

    LinkedHashSet sınıfı hashtable ile linked list yapısını kullanarak elementleri depolar.Bu yüzden,
    elemetler ekleme sırasına göre depolanır. Ekleme,Çıkarma ve Arama metodları 
    sabit zamanda( Time Complexity : O(1) ) çalışır. 
 */
        
//        Set<String> set1 = new HashSet<>();
//        Set<String> set2 = new LinkedHashSet<>();
//        Set<String> set3 = new TreeSet<>();
//        
//        set1.add("Java");
//        set1.add("Kotlin");
//        set1.add("Python");
//        set1.add("Perl");
//        
//        set2.add("Java");
//        set2.add("Kotlin");
//        set2.add("Python");
//        set2.add("Perl");
//        
//        set3.add("Java");
//        set3.add("Python");
//        set3.add("Perl");
//        set3.add("Kotlin");
        
//        System.out.println("HashSet ****************************"); //Rastgele
//        for (String s : set1)
//        {
//            System.out.println(s);
//        }
//        System.out.println("LinkedHashSet ****************************"); //Eklemeye Göre
//        for (String s : set2)
//        {
//            System.out.println(s);
//        }
//        System.out.println("TreeSet ****************************"); //Sıralar
//        for (String s : set3)
//        {
//            System.out.println(s);
//        }
        
//        System.out.println(set1.contains("Java"));
//        System.out.println(set1.contains("Go"));
//        
//        set1.remove("Kotlin");
//        for (String s : set1)
//        {
//            System.out.println(s);
//        }
        
        
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        
        
        set1.add("Java");
        set1.add("C++");
        set1.add("Python");
        set1.add("JavaScript");
        set1.add("Dart");
        
        set2.add("Java");
        set2.add("Perl");
        set2.add("Go");
        set2.add("Kotlin");
        
        // Fark ve Kesişim 
        // set2 fark set1
        Set<String> fark = new HashSet<>(set2); // This means fark equals to set2
        
        System.out.println(fark.removeAll(set1));
        System.out.println(fark);
        
        Set<String> kesisim = new HashSet<>(set2);
        
        System.out.println(kesisim.retainAll(set1));
        System.out.println(kesisim);
        
        // Birleşim
        Set<String> total = new HashSet<>(set1);
        
        total.addAll(set2);
        
        System.out.println(total);
        
        
        
    }
}
