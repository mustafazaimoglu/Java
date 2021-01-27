
public class Esek extends Hayvan
{ 
    public Esek(String isim)
    {
        super(isim);
    }

    @Override
    public String toString()
    {
         return "This is a Donkey";
    }

    @Override
    public void Konus()
    {
        System.out.println("Esek Konusuyor...");
    }
}
