
public class Muhendis implements IMuhendis
{
    private boolean Askerlik;
    private boolean Sicil;

    public Muhendis(boolean Askerlik, boolean Sicil)
    {
        this.Askerlik = Askerlik;
        this.Sicil = Sicil;
    }

    @Override
    public void AskerlikSorgula()
    {
        if (Askerlik)
        {
            System.out.println("Askerliğimi Yaptim.");
        }
        else
        {
            System.out.println("Askerliğimi Henuz Yapmadim.");
        }
    }

    @Override
    public String MezuniyetOrtalamasi(double derece)
    {
        return "Ortalamam : " + derece;
    }

    @Override
    public void AdliSicilKaydi()
    {
        if (Sicil)
        {
            System.out.println("Bir Kac Suca Bulastim.");
        }
        else
        {
            System.out.println("Ben Tertemizim. Herhangi Bir Sicil Kaydim"
                    + " Yok!");
        }  
    }

    @Override
    public void IsTecrubesi(String[] Array)
    {
        System.out.println("Muhendis Olarak Su Şirketlerde Calistim :");
        
        for (String s : Array)
        {
            System.out.println(s);
        }
    }
    
}
