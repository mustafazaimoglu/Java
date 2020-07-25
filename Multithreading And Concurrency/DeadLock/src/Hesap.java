
public class Hesap
{
    private int bakiye = 10000;
    
    public void paraCek(int miktar)
    {
        bakiye -= miktar;
    }
    
    public void paraYatir(int miktar)
    {
        bakiye += miktar;
    }
    
    public static void paraTransferi(Hesap h1, Hesap h2, int miktar)
    {
        h1.paraCek(miktar);
        h2.paraYatir(miktar);
    }

    public int getBakiye()
    {
        return bakiye;
    }

    public void setBakiye(int bakiye)
    {
        this.bakiye = bakiye;
    }
    
    
}
