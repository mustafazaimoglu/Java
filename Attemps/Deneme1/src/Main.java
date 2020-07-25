
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {      
        Hayvan hayvan[] = new Hayvan[3];
        
        hayvan[0] = new Arı("Ege");
        hayvan[1] = new Esek("Mustafa");
        hayvan[2] = new Keci("Rifat");
        
        for (int i = 0; i < hayvan.length; i++)
        {
            hayvan[i].Konus();
        }
        System.out.println("***************************");
       
        ArrayList<Hayvan> a = new ArrayList<>();
        
        a.add(new Arı("Ege"));
        a.add(new Esek("Mustafa"));
        a.add(new Keci("Rifat"));
        
        for (Hayvan e : a)
        {
            System.out.println(e);
            e.Konus();        
            System.out.println();
        }    
    }          
}
