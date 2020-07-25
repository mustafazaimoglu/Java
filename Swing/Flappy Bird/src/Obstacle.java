
import java.util.Random;


public class Obstacle
{
    Random r = new Random();
    private final int fieldYukseklik = 430;
    private final int aralik = 100;
    private final int genislik = 80;
    private final int ustY = 0;
    private int ustYukseklik = 10 + r.nextInt(320);
    private int genelX = 1000;
    private int altY = ustYukseklik + aralik;
    private int altYukseklik = fieldYukseklik - (ustYukseklik + aralik);

    public int getUstYukseklik()
    {
        return ustYukseklik;
    }

    public void setUstYukseklik(int ustYukseklik)
    {
        this.ustYukseklik = ustYukseklik;
    }

    public int getGenelX()
    {
        return genelX;
    }

    public void setGenelX(int genelX)
    {
        this.genelX = genelX;
    }

    public int getAltY()
    {
        return altY;
    }

    public void setAitY(int aitY)
    {
        this.altY = aitY;
    }

    public int getAltYukseklik()
    {
        return altYukseklik;
    }

    public void setAltYukseklik(int altYukseklik)
    {
        this.altYukseklik = altYukseklik;
    }

    public int getUstY()
    {
        return ustY;
    }

    public int getFieldYukseklik()
    {
        return fieldYukseklik;
    }

    public int getAralik()
    {
        return aralik;
    }

    public int getGenislik()
    {
        return genislik;
    }
    
    
    
}
