
public class MakineMuhendisi extends Muhendis implements ICalisma 
{

    public MakineMuhendisi(boolean Askerlik, boolean Sicil)
    {
        super(Askerlik, Sicil);
    }
 
    @Override
    public void calis()
    {
        System.out.println("Gardasim Makina Calisiyor...");
    }
    
    @Override
    public void IsTecrubesi(String[] Array)
    {
        if (Array.length == 0)
        {
            System.out.println("Herhangi Bir İs Tecrubem Bulunmuyor!");
        }
        else
        {
            System.out.println("Makine Muhendisi Olarak Su Şirketlerde Calistim :");
            for (String s : Array)
            {
                 System.out.println(s);
            }
        }
    }

    @Override
    public void AdliSicilKaydi()
    {
        super.AdliSicilKaydi(); 
    }

    @Override
    public String MezuniyetOrtalamasi(double derece)
    {
        return super.MezuniyetOrtalamasi(derece); 
    }

    @Override
    public void AskerlikSorgula()
    {
        super.AskerlikSorgula();
    }
    
    public void Referanslarim(String Array[])
    {
        System.out.println("Referanslarım : ");
        
        for (String s : Array)
        {
            System.out.println(s);
        }
    }
    
    
}
