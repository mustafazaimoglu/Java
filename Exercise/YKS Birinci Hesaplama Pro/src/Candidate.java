public abstract class Candidate
{
    private String isim;
    private int turkce;
    private int matematik;
    private int edebiyat;
    private int fizik;
    

    public Candidate(String isim, int turkce, int matematik, int edebiyat, int fizik)
    {
        this.isim = isim;
        this.turkce = turkce;
        this.matematik = matematik;
        this.edebiyat = edebiyat;
        this.fizik = fizik;
    }
    
    public abstract int puanHesapla();

    public String getIsim()
    {
        return isim;
    }

    public void setIsim(String isim)
    {
        this.isim = isim;
    }

    public int getTurkce()
    {
        return turkce;
    }

    public void setTurkce(int turkce)
    {
        this.turkce = turkce;
    }

    public int getMatematik()
    {
        return matematik;
    }

    public void setMatematik(int matematik)
    {
        this.matematik = matematik;
    }

    public int getEdebiyat()
    {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat)
    {
        this.edebiyat = edebiyat;
    }

    public int getFizik()
    {
        return fizik;
    }

    public void setFizik(int fizik)
    {
        this.fizik = fizik;
    }
    
    
}
