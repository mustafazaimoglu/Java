
import java.util.ArrayList;


public class Tester
{
    static void Yazdir(ArrayList<String> x)
    {
        int c = 0;
        for (String s : x)
        {
            c++;
            System.out.println(c + ". " + s);
        }
        System.out.println();
    }
    
    static void TekrarSilici(ArrayList<String> x)
    {
        for (int i = 0; i < x.size(); i++)
        {
            for (int j = i + 1; j < x.size(); j++)
            {
                if (x.get(i).equals(x.get(j)))
                {
                    x.remove(j);
                }
                               
            }
        }
    }
    
    public static void main (String Args[])
    {
        ArrayList<String> mkz = new ArrayList<>();
        
        mkz.add("Ali");
        mkz.add("Aynur");
        mkz.add("Veli");
        mkz.add("Mustafa");
        mkz.add("Ayse");
        mkz.add("Veli");
        mkz.add("Mustafa");
        mkz.add("Ali");
        mkz.add("Ayse");
        mkz.add("Veli");
        mkz.add("Mustafa");
        mkz.add("Ali");
        mkz.add("Aynur");
        mkz.add("Aynur");
        mkz.add("Sumeyye");
        mkz.remove(mkz.size() - 2);
        
        Yazdir(mkz);
        
        TekrarSilici(mkz);
        
        Yazdir(mkz);
    }
    
}
