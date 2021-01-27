
public class Arı extends Hayvan
{ 
    public Arı(String isim)
    {
        super(isim);
    }

    @Override
    public String toString()
    {
        return "This is a Honeybee";
    }

    @Override
    public void Konus()
    {
        System.out.println("Arı Konusuyor...");
    }
}
