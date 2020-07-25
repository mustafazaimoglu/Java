
public abstract class AOgrenci
{
    private String isim;
    private String Number;

    public AOgrenci(String isim, String Number)
    {
        this.isim = isim;
        this.Number = Number;
    }

    public String getIsim()
    {
        return isim;
    }

    public void setIsim(String isim)
    {
        this.isim = isim;
    }

    public String getNumber()
    {
        return Number;
    }

    public void setNumber(String Number)
    {
        this.Number = Number;
    }
    
    
    
    public abstract void kayitYaptir();
    
    public void selamla()
    {
        System.out.println("Selamlar...");
    }
    
}
