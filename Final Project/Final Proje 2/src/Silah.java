
public abstract class Silah
{
    private String silahIsmi;
    private int etkiliMenzil;
    
    public abstract void atesEt(int hedefUzakligi);
    public abstract void doldur();

    public Silah(String silahIsmi, int etkiliMenzil)
    {
        this.silahIsmi = silahIsmi;
        this.etkiliMenzil = etkiliMenzil;
    }

    public String getSilahIsmi()
    {
        return silahIsmi;
    }

    public void setSilahIsmi(String silahIsmi)
    {
        this.silahIsmi = silahIsmi;
    }

    

    public int getEtkiliMenzil()
    {
        return etkiliMenzil;
    }

    public void setEtkiliMenzil(int etkiliMenzil)
    {
        this.etkiliMenzil = etkiliMenzil;
    }
    
    
}
