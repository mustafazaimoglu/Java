
public class Araba implements Comparable<Araba>
{

    private String marka;
    private String model;
    private int yil;

    public Araba(String marka, String model, int yil)
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

    public int getYil()
    {
        return yil;
    }

    public void setYil(int yil)
    {
        this.yil = yil;
    }

    public void display()
    {
        System.out.print("{Marka : " + this.marka);
        System.out.print(" - Model : " + this.model);
        System.out.print(" - Yıl : " + this.yil + "}");
    }

    @Override
    public int compareTo(Araba a)
    {
        if (this.yil == a.getYil())
        {
            return 0;
        }
        else if (this.yil > a.getYil())
        {
            return 1;
        }
        else
        {
            return -1;
        }
        
//        return this.yil - a.getYil();  // BU SEKİLDEDE KULLANILABİLİR.
    }
}
