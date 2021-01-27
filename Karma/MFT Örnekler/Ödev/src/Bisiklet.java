
public class Bisiklet implements Interface
{
    private int hiz;

    public Bisiklet(int hiz)
    {
        this.hiz = hiz;
    }

    
    @Override
    public void hızarttır()
    {
        this.hiz++;
    }

    @Override
    public void hızazalt()
    {
        this.hiz--;
    }

    @Override
    public void bilgiver()
    {
        System.out.println("Bisilet Hizi : " + this.hiz);
    }
    
    
    
}
