
public class Main
{
    public static void main(String[] args)
    {
        Araba araba = new Araba(25);
        Bisiklet bisiklet = new Bisiklet(5);
        
        bisiklet.hızarttır();
        bisiklet.bilgiver();
        bisiklet.hızazalt();
        bisiklet.bilgiver();
        
        araba.hızazalt();
        araba.hızazalt();
        araba.bilgiver();
        araba.hızarttır(15);
        araba.bilgiver();
        
        
    }
}
