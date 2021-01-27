
public class Tezgahtar extends Calisan
{
    private int satis;

    public Tezgahtar(String ad, String soyAd)
    {
        super(ad, soyAd);
    }
    
    public void setSatis(int satis)
    {
        this.satis = satis;
    }

    @Override
    public int maasHesapla()
    {
        return this.satis / 10;
    }

    @Override
    public String kimimBen()
    {
        return "Tezgahtar";
    }
    
}
