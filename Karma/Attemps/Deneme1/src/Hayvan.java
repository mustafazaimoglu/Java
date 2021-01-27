
public class Hayvan
{
    private String isim;

    public Hayvan(String isim)
    {
        this.isim = isim;
        System.out.println("Hayvan Cont");
    }

    public String getIsim()
    {
        return isim;
    }
    
    public void Konus()
    {
        System.out.println("Hayvan Konusuyor...");
    }

    @Override
    public String toString()
    {
        return "This is an Animals"; 
    } 
}
