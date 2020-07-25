
public class FinalTest
{
    private final String isim;
    private final int objeSayisi;
    private static int say = 0;

    public FinalTest(String isim)
    {
        this.isim = isim;
        say++;
        this.objeSayisi = say;
    }

    public String getIsim()
    {
        return isim;
    }

    public int getObjeSayisi()
    {
        return objeSayisi;
    }
    
    
    
}
