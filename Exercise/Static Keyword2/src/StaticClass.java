
public class StaticClass
{
    private static int objeSayisi = 0;
    private String isim;

    public StaticClass(String isim)
    {
        this.isim = isim;
        objeSayisi++;
    }
    
    public int getObjeSayisi()
    {
        return objeSayisi;
    }

    public String getIsim()
    {
        return isim;
    }
    
    
    
}
