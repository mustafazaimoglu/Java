
import java.util.Random;

public class SariTop
{
    Random r = new Random();
    private final int genelBoyut = 130;  // bir tane değişmez bir genelBoyut belirledik en büyük boyutumuz 130 olacak
    private int x = 1000; //Ekran Dısından gelmesi için nesne X i
    private int y = 30 + r.nextInt(340); // min 30 px den max 370 px den nesne Y si olusacak
    private int katsayi = 1 + r.nextInt(10); // katsayıya göre değişecek boyutumuz
    private int boyut = genelBoyut - (katsayi * 10); //Katsayisi buyuk olan topun kendisinin küçük olması için
    private int degisim = 8 + (katsayi * 1); //hızımız minimum 8 maximum 18 olacak 

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getKatsayi()
    {
        return katsayi;
    }

    public void setKatsayi(int katsayi)
    {
        this.katsayi = katsayi;
    }

    public int getBoyut()
    {
        return boyut;
    }

    public void setBoyut(int boyut)
    {
        this.boyut = boyut;
    }

    public int getDegisim()
    {
        return degisim;
    }

    public void setDegisim(int degisim)
    {
        this.degisim = degisim;
    }

}
