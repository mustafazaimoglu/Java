
public class Araba implements Interface
{
    private int hiz;

    public Araba(int hiz)
    {
        this.hiz = hiz;
    }
    
    
    @Override
    public void hızarttır()
    {
        this.hiz++;
    }
    
    public void hızarttır(int sayi)
    {
        this.hiz += sayi;
    }

    @Override
    public void hızazalt()
    {
        this.hiz--;
    }
    
    public void hızazalt(int sayi)
    {
        this.hiz += sayi;
    }

    @Override
    public void bilgiver()
    {
        System.out.println("Araba Hizi : "  + this.hiz);    
    }
    
    

}
