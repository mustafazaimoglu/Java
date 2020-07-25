
public abstract class Sekil
{
    private String Isim;
    
    public abstract void AlanHesapla(); //Govdesiz Method extend edilen her yerde yazılsın dıye var.

    public Sekil(String Isim)
    {
        this.Isim = Isim;
    }

    public String getIsim()
    {
        return Isim;
    }

    public void setIsim(String Isim)
    {
        this.Isim = Isim;
    }
    
    
}
