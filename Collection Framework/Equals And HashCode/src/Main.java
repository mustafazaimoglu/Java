
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player
{

    private String name;
    private String id;

    public Player(String name, String id)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "||| id : " + this.id + " Name : " + this.name + " |||";
    }

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name))
        {
            return false;
        }
        if (!Objects.equals(this.id, other.id))
        {
            return false;
        }
        return true;
    }

    
}

public class Main
{

    public static void main(String[] args)
    {
//        Set<String> hashSet = new HashSet<>();

//        hashSet.add("Mustafa");
//        hashSet.add("Mehmet");
//        hashSet.add("Emre");
//        hashSet.add("Mustafa"); // Eklenmedi
//        
//        yazdir(hashSet);
        Set<Player> hashSet = new HashSet<>();

        Player p1 = new Player("Mustafa", "1");
        Player p2 = new Player("Mehmet", "4");
        Player p3 = new Player("Emre", "5");
        Player p4 = new Player("Mustafa", "1");
        
        hashSet.add(p1); //HashCode Ve Equals fonksiyonları olmazsa için ayırt edemez.
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(p4);
        
        yazdir(hashSet);

    }

    public static <E> void yazdir(Set<E> set)
    {
        for (E e : set)
        {
            System.out.println(e);
        }
    }
}
