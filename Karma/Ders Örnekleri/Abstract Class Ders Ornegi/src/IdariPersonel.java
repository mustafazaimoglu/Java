
public class IdariPersonel extends Calisan
{
    private static final int MAAS = 800;

    public IdariPersonel(String ad, String soyAd)
    {
        super(ad, soyAd);
    }

    @Override
    public int maasHesapla()
    {
        return IdariPersonel.MAAS;
    }

    @Override
    public String kimimBen()
    {
        return "İdari Personel";
    }
    
}
