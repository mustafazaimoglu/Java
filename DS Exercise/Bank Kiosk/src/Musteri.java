
public class Musteri
{
    private static int totalMusteri = 1;
    private int islemZamani;
    private int siraNumarasi;

    public Musteri(int islemZamani)
    {
        this.islemZamani = islemZamani;
        this.siraNumarasi = Musteri.totalMusteri;
        Musteri.totalMusteri++;
    }

    public int getIslemZamani()
    {
        return islemZamani;
    }

    public void setIslemZamani(int islemZamani)
    {
        this.islemZamani = islemZamani;
    }

    public int getSiraNumarasi()
    {
        return siraNumarasi;
    }

    public void setSiraNumarasi(int siraNumarasi)
    {
        this.siraNumarasi = siraNumarasi;
    }
    
    public void print()
    {
        System.out.println("Sira Numarasi : " + this.siraNumarasi + " İslem Süresi : " + this.islemZamani);
    }
    
    
}
