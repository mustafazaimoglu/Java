
public class Seyirci
{
    private String isim;
    
    private static int seyirciSayisi = 0; // Static demek ram da hemen olumasi demek.
    
    // O yuzden static metodlar static olmayan attribute leri alamaz.... 

    public Seyirci(String isim)
    {
        this.isim = isim;
        
        seyirciSayisi++;
    }

    public String getIsim()
    {
        return isim;
    }

    public void setIsim(String isim)
    {
        this.isim = isim;
    }

    public static int getSeyirciSayisi()
    {
        return seyirciSayisi;
    }
    
    public void calis()
    {
        System.out.println(isim + " izliyor...");
    }
        
    
}
