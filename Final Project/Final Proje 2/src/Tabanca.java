
public class Tabanca extends Silah
{
    private Sarjor tabancaSarjor;
    private int tabancaMermiSayisi = 15;
    private int askerYedekSarjorSayisi; 
    
    public Tabanca(String tabancaIsmi, int etkiliMenzil, int askerYedekSarjorSayisi)
    {
        super(tabancaIsmi, etkiliMenzil);
        tabancaSarjor = new Sarjor(tabancaMermiSayisi, tabancaMermiSayisi);
        this.askerYedekSarjorSayisi = askerYedekSarjorSayisi;
    }
    
    @Override
    public void atesEt(int hedefUzakligi)
    {
        if (tabancaSarjor.getKalanMermi() > 0)
        {
            if (getEtkiliMenzil() >= hedefUzakligi)
            {
                System.out.println("1 el ateş edildi!\n"
                                  + "Hedef menzilde olduğu için atış isabetli!!");
                tabancaSarjor.setKalanMermi(tabancaSarjor.getKalanMermi() - 1);
                System.out.println("Sarjörde Kalan Mermi : " + tabancaSarjor.getKalanMermi());
            }
            else
            {
                System.out.println("1 el ateş edildi!\n"
                                  + "Hedef menzil dışında olduğu için atış isabetsiz!!");
                tabancaSarjor.setKalanMermi(tabancaSarjor.getKalanMermi() - 1);
                System.out.println("Sarjörde Kalan Mermi : " + tabancaSarjor.getKalanMermi());
            }
        }
        else
        {
            System.out.println("Sarjörde Mermi Bulunmamaktadır!");
        }

    }
    
    @Override
    public void doldur()
    {
        if (tabancaSarjor.getKalanMermi() == 0)
        {
            if (askerYedekSarjorSayisi > 0)
            {
                tabancaSarjor.setKalanMermi(tabancaMermiSayisi);
                askerYedekSarjorSayisi--;
                System.out.println("Sarjör Basarı ile Dolduruldu!");
            }
        }
        else
        {
            System.out.println("Sarjörde Hala Mermi Bulunuyor....");
        }
        
    }

    public int getAskerYedekSarjorSayisi()
    {
        return askerYedekSarjorSayisi;
    }

    

}
