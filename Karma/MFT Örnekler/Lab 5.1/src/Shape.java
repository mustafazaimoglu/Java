
public class Shape
{
    private String isim;

    public Shape(String isim)
    {
        this.isim = isim;
    }

    public String getIsim()
    {
        return isim;
    }
    
    public void Draw()
    {
        System.out.println(getIsim() + " Ciziliyor...");
    }
    
    public void Erase()
    {
        System.out.println(getIsim() + " Siliniyor...");
    }
    
    public void KimimBen()
    {
        System.out.println("I am : " + getIsim());
    }
}
