
import java.awt.Graphics;
import java.util.Random;


public abstract class Arac
{
    private int x,y;
    private double aci;
    Random r = new Random();

    public void setX(int x)
    {
        if (x > 5 && x < Main.DUNYABOYUTU-14)
        {
            this.x = x;
        }
        else
        {
            System.out.println("Aracın X konumunda Taşma Oldu");
        }
    }
    
    public void setY(int y)
    {
        if (y > 30 && y < Main.DUNYABOYUTU-35)
        {
            this.y = y;
        }
        else
        {
            System.out.println("Aracın Y konumunda Taşma Oldu");
        }
    }

    public void setAci(double aci)
    {
        this.aci = aci % (2 * Math.PI);
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public double getAci()
    {
        return aci;
    }
    

    public Arac()
    {
        setX((int) (5 + r.nextFloat() * (Main.DUNYABOYUTU-14)));
        setY((int) (31 + r.nextFloat() * (Main.DUNYABOYUTU-66)));
        setAci(r.nextFloat() * (2*Math.PI));
        //Bos Nesne Olusursa Diye
    }

    public Arac(int x, int y, double aci)
    {
        setX(x);
        setY(y);
        setAci(aci);
    }

    public abstract void ciz(Graphics g);
    
    public abstract void git(double don, int ilerle);
    

}
