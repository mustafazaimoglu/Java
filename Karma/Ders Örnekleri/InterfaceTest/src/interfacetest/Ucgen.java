
package interfacetest;


public class Ucgen implements ISekil
{
    public int x,y,z;

    public Ucgen(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int getKenarSayi()
    {
        return 3;
    }

    @Override
    public int CevreHesapla()
    {
        return x + y +z;
    }

}
