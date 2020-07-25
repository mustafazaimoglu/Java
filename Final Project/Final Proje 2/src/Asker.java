
public class Asker
{
    private String isim;
    private String rütbe;
    private Tabanca tabanca;
    private OtomatikSilah otomatik;

    public Asker(String isim, String rütbe, String tabancaIsmi, int tabancaMenzil, int tabancaYedekSarjor, String otoIsmi, int otoMenzil, int otoSarjörSayisi)
    {
        this.isim = isim;
        this.rütbe = rütbe;
        tabanca = new Tabanca(tabancaIsmi, tabancaMenzil, tabancaYedekSarjor);
        otomatik = new OtomatikSilah(otoIsmi, otoMenzil, otoSarjörSayisi);
    }

    public String getIsim()
    {
        return isim;
    }

    public void setIsim(String isim)
    {
        this.isim = isim;
    }

    public String getRütbe()
    {
        return rütbe;
    }

    public void setRütbe(String rütbe)
    {
        this.rütbe = rütbe;
    }

    public Tabanca getTabanca()
    {
        return tabanca;
    }

    public void setTabanca(Tabanca tabanca)
    {
        this.tabanca = tabanca;
    }

    public OtomatikSilah getOtomatik()
    {
        return otomatik;
    }

    public void setOtomatik(OtomatikSilah otomatik)
    {
        this.otomatik = otomatik;
    }

    @Override
    public String toString()
    {
        return "Adi : " + isim +
                "\nRutbe : " + rütbe + 
                "\nTabanca Adı : " + getTabanca().getSilahIsmi() +
                "\nTabanca Etkili Menzil : " + getTabanca().getEtkiliMenzil() +
                "\nTabanca Yedek Sarjör Sayisi : " + getTabanca().getAskerYedekSarjorSayisi() +
                "\nOtomatik Silah Adı : " + getOtomatik().getSilahIsmi() + 
                "\nOtomatik Silah Etkili Menzil : " + getOtomatik().getEtkiliMenzil() +
                "\nOtomatik Silah Sarjör Sayısı : " + getOtomatik().getOtoSilahSarjorler().size();
    }
    
    
    
}
