
public class Keci extends Hayvan
{  
    public Keci(String isim)
    {
        super(isim);
        System.out.println("Keci con");
    }

    @Override
    public String toString()
    {
        return "This is a Goat";
    }

    @Override
    public void Konus()
    {
        System.out.println("Keci Konusuyor...");
    }
}
