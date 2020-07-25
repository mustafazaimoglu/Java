
public class Hizmetli extends Calisan
{
    private static final int SAAT_UCRETI = 10;
    private int mesaiSaati;

    public Hizmetli(String ad, String soyAd)
    {
        super(ad, soyAd);
    }
    
    public void setMesaiSaati(int mesaiSaati)
    {
        this.mesaiSaati = mesaiSaati;
    }

    @Override
    public int maasHesapla()
    {
        return this.mesaiSaati * Hizmetli.SAAT_UCRETI;
    }

    @Override
    public String kimimBen()
    {
        return "Hizmetli";
    }
    
}
