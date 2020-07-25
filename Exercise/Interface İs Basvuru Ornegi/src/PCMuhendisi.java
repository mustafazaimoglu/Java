
public class PCMuhendisi extends Muhendis
{

    public PCMuhendisi(boolean Askerlik, boolean Sicil)
    {
        super(Askerlik, Sicil);
    }

    @Override
    public void IsTecrubesi(String[] Array)
    {
        System.out.println("Bilgisayar Muhendisi Olarak Su Şirketlerde Calistim :");
        
        for (String s : Array)
        {
            System.out.println(s);
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
        return super.MezuniyetOrtalamasi(derece); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AskerlikSorgula()
    {
        super.AskerlikSorgula(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
