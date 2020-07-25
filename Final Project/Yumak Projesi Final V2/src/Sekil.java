
import java.util.Random;

class KuruKafa extends Sekil{}   //
class Up extends Sekil{}         // Gerekli Sınıfların Türetilmesi
class Down extends Sekil{}       //

public class Sekil
{
    Random r = new Random();
    private int x = 1000;
    private int y = 30 + r.nextInt(340);
    private int degisim = 14; //Nesnelerin genel hizi 14 olarak belirlendi

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

    public int getDegisim()
    {
        return degisim;
    }

    public void setDegisim(int degisim)
    {
        this.degisim = degisim;
    }
       
}

