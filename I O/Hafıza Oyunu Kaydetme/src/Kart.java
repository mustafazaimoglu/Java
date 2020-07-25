
import java.io.Serializable;


public class Kart implements Serializable
{
    private char Deger;
    private boolean Tahmin = false;

    public Kart(char Deger)
    {
        this.Deger = Deger;
    }

    public char getDeger()
    {
        return Deger;
    }

    public void setDeger(char Deger)
    {
        this.Deger = Deger;
    }

    public boolean isTahmin()
    {
        return Tahmin;
    }

    public void setTahmin(boolean Tahmin)
    {
        this.Tahmin = Tahmin;
    }
    
    
    
    
    
}
