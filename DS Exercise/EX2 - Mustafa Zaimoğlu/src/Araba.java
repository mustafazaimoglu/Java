
public class Araba
{
    private String marka;
    private String model;
    private String yil;

    public Araba(String marka, String model, String yil)
    {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    public String getMarka()
    {
        return marka;
    }

    public void setMarka(String marka)
    {
        this.marka = marka;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getYil()
    {
        return yil;
    }

    public void setYil(String yil)
    {
        this.yil = yil;
    }
    
    public void display()
    {
        System.out.print("{Marka : " + this.marka);
        System.out.print(" - Model : " + this.model);
        System.out.print(" - Yıl : " + this.yil + "}");
    }
}
