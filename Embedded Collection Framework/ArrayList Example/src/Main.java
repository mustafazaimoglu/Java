
import java.util.ArrayList;
import java.util.List;


public class Main
{
    public static void main(String args[])
    {
        List<String> list = new ArrayList<>();
        
        list.add("Java");
        list.add("Python");
        list.add("C++");
        
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        // System.out.println(list.get(4)); Hata Verir
        
        System.out.println("*****************");
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("*****************");
        for (String s : list)
        {
            System.out.println(s);
        }
        
        list.remove("Java");
        list.remove(1);
        
        System.out.println("*****************");
        for (String s : list)
        {
            System.out.println(s);
        }
    }
}
