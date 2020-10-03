
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        Map<Character,Integer> frekans = new TreeMap<>();
        
        System.out.print("Lutfen Bir Cumle Girin : ");
        String cumle = scanner.nextLine();
        
        for (int i = 0; i < cumle.length(); i++)
        {
            char c = cumle.charAt(i);
            
            if (c == ' ')
            {
                continue;
            }
            
            if (frekans.containsKey(c))
            {
                frekans.replace(c, frekans.get(c) + 1);
            }
            else
            {
                frekans.put(c, 1);
            }
        }
        
        for (Character c : frekans.keySet())
        {
            System.out.println(c + " karakterinden " + frekans.get(c) + " tane bulunuyor.");
        }
        
        System.out.println("**************************************************************");
        
        for (Map.Entry<Character,Integer> entry : frekans.entrySet())
        {
            System.out.println(entry.getKey() + " karakterinden " + entry.getValue() + " tane bulunuyor.");
        }
    }
    
}
