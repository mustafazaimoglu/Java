
package interfacetest;

public class Dikdortgen implements ISekil
{
    public int x,y;

    public Dikdortgen(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public int getKenarSayi()
    {
        return 4;
    }
    
    public int CevreHesapla()
    {
        return 2*x + 2*y;
    }


}
